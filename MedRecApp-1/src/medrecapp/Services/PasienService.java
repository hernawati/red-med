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
import medrecapp.Dao.PasienDao;
import medrecapp.Entity.Pasien;
import medrecapp.Interfaces.PasienInterface;
import medrecapp.KoneksiDatabase.KoneksiDB;

/**
 *
 * @author Fachrul Pralienka BM
 */
public class PasienService {

    private Connection connection;
    private PasienInterface pi;

    public PasienService() {
        this.connection = KoneksiDB.getConnection();
        this.pi = new PasienDao(connection);
    }

    public void serviceInsertPasien(Pasien p){
        try{
            connection.setAutoCommit(false);
            pi.insertPasien(p);
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

    public void serviceUpdatePasien(Pasien p, String noRm){
        try{
            connection.setAutoCommit(false);
            pi.updatePasien(p, noRm);
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

    public void serviceDeletePasien(String noRm){
        try{
            connection.setAutoCommit(false);
            pi.deletePasien(noRm);
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

    public List serviceGetAllPasien(){
        try{
            return pi.getAllPasien();
        }catch(SQLException se){
            Logger.getLogger(DokterService.class.getName()).log(Level.SEVERE, null, se);
            return null;
        }
    }

}
