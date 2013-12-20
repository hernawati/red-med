/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package medrecapp.Interfaces;

import java.sql.SQLException;
import java.util.List;
import medrecapp.Entity.Pasien;

/**
 *
 * @author Fachrul Pralienka BM
 */
public interface PasienInterface {

    public void insertPasien(Pasien p)throws SQLException;
    public void updatePasien(Pasien p, String noRm)throws SQLException;
    public void deletePasien(String noRm)throws SQLException;
    public List getAllPasien()throws SQLException;

}
