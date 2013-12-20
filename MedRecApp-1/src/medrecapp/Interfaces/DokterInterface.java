/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package medrecapp.Interfaces;

import java.sql.SQLException;
import java.util.List;
import medrecapp.Entity.Dokter;

/**
 *
 * @author Fachrul Pralienka BM
 */
public interface DokterInterface {

    public void insertDokter(Dokter d)throws SQLException;
    public void updateDokter(Dokter d, String noDokter)throws SQLException;
    public void deleteDokter(String noDokter)throws SQLException;
    public List getAllDokter()throws SQLException;

}
