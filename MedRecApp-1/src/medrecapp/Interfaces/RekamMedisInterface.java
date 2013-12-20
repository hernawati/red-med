/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package medrecapp.Interfaces;

import java.sql.SQLException;
import java.util.List;
import medrecapp.Entity.RekamMedis;

/**
 *
 * @author Fachrul Pralienka BM
 */
public interface RekamMedisInterface {

    public void insertRekamMedis(RekamMedis rm)throws SQLException;
    public void updateRekamMedis(RekamMedis rm, String noDaftar)throws SQLException;
    public void deleteRekamMedis(String noDaftar)throws SQLException;
    public List getAllRekamMedis()throws SQLException;

}
