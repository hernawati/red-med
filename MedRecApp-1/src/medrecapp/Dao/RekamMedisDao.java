/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package medrecapp.Dao;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import medrecapp.Entity.RekamMedis;
import medrecapp.Interfaces.RekamMedisInterface;

/**
 *
 * @author Hady
 */
public class RekamMedisDao implements RekamMedisInterface{
    private Connection connection;

    private final String insertRekamMedis = "INSERT INTO rekam_medis VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    private final String updateRekamMedis =
            "UPDATE rekam_medis SET no_rm=?, no_staf=?, id_unit_rs=?, id_jaminan=?, no_dokter=?, no_perawat=?, nadi=?, temperatur=?, pernapasan=?, kesadaran=?, anamnesa=?, tinggi_bdn=?, berat_bdn=?, tensi_darah=?, diagnosis=?, terapi=?, status=? WHERE no_daftar=?";
    private final String deleteRekamMedis = "DELETE FROM rekam_medis WHERE no_daftar=?";
    private final String getAllRekamMedis = "SELECT * FROM rekam_medis";

    public RekamMedisDao(Connection connection) {
        this.connection = connection;
    }    

    public void insertRekamMedis(RekamMedis rm) throws SQLException {
        try{
            PreparedStatement ps = (PreparedStatement) connection.prepareStatement(insertRekamMedis);
            ps.setString(1, rm.getNoDaftar());
            ps.setString(2, rm.getNoRm());
            ps.setString(3, rm.getNoStaf());
            ps.setString(4, rm.getIdUnitRs());
            ps.setString(5, rm.getIdJaminan());
            ps.setString(6, rm.getNoDokter());
            ps.setString(7, rm.getNoPerawat());
            ps.setInt(8, rm.getNadi());
            ps.setInt(9, rm.getTemperatur());
            ps.setInt(10, rm.getPernapasan());
            ps.setString(11, rm.getKesadaran());
            ps.setString(12, rm.getAnamnesa());
            ps.setFloat(13, rm.getTinggiBdn());
            ps.setFloat(14, rm.getBeratBdn());
            ps.setString(15, rm.getTensiDarah());
            ps.setString(16, rm.getDiagnosis());
            ps.setString(17, rm.getTerapi());
            ps.setString(18, rm.getStatus());
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Data rekam medis berhasil ditambah!", "Insert Rekam Medis", JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException se){
            JOptionPane.showMessageDialog(null, se.getMessage(),"Insert Rekam Medis Gagal!",JOptionPane.ERROR_MESSAGE);
        }
    }

    public void updateRekamMedis(RekamMedis rm, String noDaftar) throws SQLException {
        try{
            PreparedStatement ps = (PreparedStatement) connection.prepareStatement(updateRekamMedis);
            ps.setString(1, rm.getNoRm());
            ps.setString(2, rm.getNoStaf());
            ps.setString(3, rm.getIdUnitRs());
            ps.setString(4, rm.getIdJaminan());
            ps.setString(5, rm.getNoDokter());
            ps.setString(6, rm.getNoPerawat());
            ps.setInt(7, rm.getNadi());
            ps.setInt(8, rm.getTemperatur());
            ps.setInt(9, rm.getPernapasan());
            ps.setString(10, rm.getKesadaran());
            ps.setString(11, rm.getAnamnesa());
            ps.setFloat(12, rm.getTinggiBdn());
            ps.setFloat(13, rm.getBeratBdn());
            ps.setString(14, rm.getTensiDarah());
            ps.setString(15, rm.getDiagnosis());
            ps.setString(16, rm.getTerapi());
            ps.setString(17, rm.getStatus());
            ps.setString(18, noDaftar);
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Data rekam medis berhasil diubah!", "Update Rekam Medis", JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException se){
            JOptionPane.showMessageDialog(null, se.getMessage(),"Update Rekam Medis Gagal!",JOptionPane.ERROR_MESSAGE);
        }
    }

    public void deleteRekamMedis(String noDaftar) throws SQLException {
        try{
            PreparedStatement ps = (PreparedStatement) connection.prepareStatement(deleteRekamMedis);
            ps.setString(1, noDaftar);
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Data rekam medis berhasil dihapus!","Delete Rekam Medis",JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException se){
            JOptionPane.showMessageDialog(null, se.getMessage(),"Delete Rekam Medis Gagal!",JOptionPane.ERROR_MESSAGE);
        }
    }

    public List getAllRekamMedis() throws SQLException {
        try{
            List list = new ArrayList();
            Statement s = (Statement) connection.createStatement();
            ResultSet rs = s.executeQuery(getAllRekamMedis);
            while(rs.next()){
                RekamMedis rm = new RekamMedis();
                rm.setNoDaftar(rs.getString("no_daftar"));
                rm.setNoRm(rs.getString("no_rm"));
                rm.setNoStaf(rs.getString("no_staf"));
                rm.setIdUnitRs(rs.getString("id_unit_rs"));
                rm.setIdJaminan(rs.getString("id_jaminan"));
                rm.setNoDokter(rs.getString("do_dokter"));
                rm.setNoPerawat(rs.getString("no_perawat"));
                rm.setNadi(rs.getInt("nadi"));
                rm.setTemperatur(rs.getInt("temperatur"));
                rm.setPernapasan(rs.getInt("pernapasan"));
                rm.setKesadaran(rs.getString("kesadaran"));
                rm.setAnamnesa(rs.getString("anamnesa"));
                rm.setTinggiBdn(rs.getFloat("tinggi_bdn"));
                rm.setBeratBdn(rs.getFloat("berat_bdn"));
                rm.setTensiDarah(rs.getString("tensi_darah"));
                rm.setDiagnosis(rs.getString("diagnosis"));
                rm.setTerapi(rs.getString("terapi"));
                rm.setStatus(rs.getString("status"));
                list.add(rm);
            }
            rs.close();
            s.close();
            return list;
        }catch(SQLException se){
            JOptionPane.showMessageDialog(null, se.getMessage(),"Get All Rekam Medis Gagal!", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}
