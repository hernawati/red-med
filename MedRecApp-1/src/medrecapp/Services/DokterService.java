/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package medrecapp.Services;

import com.mysql.jdbc.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import medrecapp.Dao.DokterDao;
import medrecapp.Entity.Dokter;
import medrecapp.Interfaces.DokterInterface;
import medrecapp.KoneksiDatabase.KoneksiDB;

/**
 *
 * @author Fachrul Pralienka BM
 */
public class DokterService {

    private Connection connection;
    private DokterInterface di;

    public DokterService() {
        this.connection = KoneksiDB.getConnection();
        this.di = new DokterDao(connection);
    }

    public void serviceInsertDokter(Dokter d){
        try{
            connection.setAutoCommit(false);
            di.insertDokter(d);
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

    public void serviceUpdateDokter(Dokter d, String noDokter){
        try{
            connection.setAutoCommit(false);
            di.updateDokter(d, noDokter);
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

    public void serviceDeleteDokter(String noDokter){
        try{
            connection.setAutoCommit(false);
            di.deleteDokter(noDokter);
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

    public List serviceGetAllDokter(){
        try{
            return di.getAllDokter();
        }catch(SQLException se){
            Logger.getLogger(DokterService.class.getName()).log(Level.SEVERE, null, se);
            return null;
        }
    }

}
