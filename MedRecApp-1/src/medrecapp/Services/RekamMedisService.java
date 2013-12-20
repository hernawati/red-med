/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package medrecapp.Services;

import com.mysql.jdbc.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import medrecapp.Dao.RekamMedisDao;
import medrecapp.Entity.RekamMedis;
import medrecapp.Interfaces.DokterInterface;
import medrecapp.Interfaces.RekamMedisInterface;
import medrecapp.KoneksiDatabase.KoneksiDB;

/**
 *
 * @author Hady
 */
public class RekamMedisService {
    private Connection connection;
    private RekamMedisInterface ri;

    public RekamMedisService() {
        this.connection = KoneksiDB.getConnection();
        this.ri = new RekamMedisDao(connection);
    }
    
    public void serviceInsertRekamMedis(RekamMedis r){
        try{
            connection.setAutoCommit(false);
            ri.insertRekamMedis(r);
            connection.setAutoCommit(true);
        }catch(SQLException se){
            try{
                connection.rollback();
                connection.setAutoCommit(true);
            }catch(SQLException see){
                Logger.getLogger(DokterService.class.getName()).log(Level.SEVERE, null, see);
            }
            Logger.getLogger(DokterService.class.getName()).log(Level.SEVERE, null, se);
        }
    }
    
    public void serviceUpdateRekamMedis(RekamMedis r, String noDaftar){
        try{
            connection.setAutoCommit(false);
            ri.updateRekamMedis(r, noDaftar);
            connection.setAutoCommit(true);
        }catch(SQLException se){
            try{
                connection.rollback();
                connection.setAutoCommit(true);
            }catch(SQLException see){
                Logger.getLogger(DokterService.class.getName()).log(Level.SEVERE, null, see);
            }
            Logger.getLogger(DokterService.class.getName()).log(Level.SEVERE, null, se);
        }
    }
    
    public void serviceDeleteRekamMedis(String noDaftar){
        try{
            connection.setAutoCommit(false);
            ri.deleteRekamMedis(noDaftar);
            connection.setAutoCommit(true);
        }catch(SQLException se){
            try{
                connection.rollback();
                connection.setAutoCommit(true);
            }catch(SQLException see){
                Logger.getLogger(DokterService.class.getName()).log(Level.SEVERE, null, see);
            }
            Logger.getLogger(DokterService.class.getName()).log(Level.SEVERE, null, se);
        }
    }
    
    public List serviceGetAllRekamMedis(){
        try{
            return ri.getAllRekamMedis();
        }catch(SQLException se){
            Logger.getLogger(DokterService.class.getName()).log(Level.SEVERE, null, se);
            return null;
        }
    }
}
