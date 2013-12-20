/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package medrecapp.Dao;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import medrecapp.Entity.Pasien;
import medrecapp.Interfaces.PasienInterface;

/**
 *
 * @author Fachrul Pralienka BM
 */
public class PasienDao implements PasienInterface{

    private Connection connection;

    private final String insertPasien = "INSERT INTO pasien VALUES (?,?,?,?,?,?)";
    private final String updatePasien =
            "UPDATE pasien SET nm_pas=?, jk_pas=?, tgl_lahir=?, agama=?, alamat_pas=? WHERE no_rm=?";
    private final String deletePasien = "DELETE FROM pasien WHERE no_rm=?";
    private final String getAllPasien = "SELECT * FROM pasien";

    public PasienDao(Connection connection) {
        this.connection = connection;
    }

    public void insertPasien(Pasien p) throws SQLException {
        try{
            PreparedStatement ps = (PreparedStatement) connection.prepareStatement(insertPasien);
            ps.setString(1, p.getNoRm());
            ps.setString(2, p.getNmPas());
            ps.setString(3, p.getJkPas());
            ps.setString(4, p.getTglLahir());
            ps.setString(5, p.getAgama());
            ps.setString(6, p.getAlamatPas());
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Data pasien berhasil ditambah!", "Insert Pasien", JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException se){
            JOptionPane.showMessageDialog(null, se.getMessage(),"Insert Pasien Gagal!",JOptionPane.ERROR_MESSAGE);
        }
    }

    public void updatePasien(Pasien p, String noRm) throws SQLException {
        try{
            PreparedStatement ps = (PreparedStatement) connection.prepareStatement(updatePasien);
            ps.setString(1, p.getNmPas());
            ps.setString(2, p.getJkPas());
            ps.setString(3, p.getTglLahir());
            ps.setString(4, p.getAgama());
            ps.setString(5, p.getAlamatPas());
            ps.setString(6, noRm);
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Data pasien berhasil diubah!", "Update Pasien", JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException se){
            JOptionPane.showMessageDialog(null, se.getMessage(),"Update Pasien Gagal!",JOptionPane.ERROR_MESSAGE);
        }
    }

    public void deletePasien(String noRm) throws SQLException {
        try{
            PreparedStatement ps = (PreparedStatement) connection.prepareStatement(deletePasien);
            ps.setString(1, noRm);
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Data pasien berhasil dihapus!","Delete Pasien",JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException se){
            JOptionPane.showMessageDialog(null, se.getMessage(),"Delete Pasien Gagal!",JOptionPane.ERROR_MESSAGE);
        }
    }

    public List getAllPasien() throws SQLException {
        try{
            List list = new ArrayList();
            Statement s = (Statement) connection.createStatement();
            ResultSet rs = s.executeQuery(getAllPasien);
            while(rs.next()){                
                Pasien p = new Pasien();
                p.setNoRm(rs.getString("no_rm"));
                p.setNmPas(rs.getString("nm_pas"));
                p.setJkPas(rs.getString("jk_pas"));
                p.setTglLahir(rs.getString("tgl_lahir"));
                p.setAgama(rs.getString("agama"));
                p.setAlamatPas(rs.getString("alamat_pas"));
                list.add(p);
            }
            rs.close();
            s.close();
            return list;
        }catch(SQLException se){
            JOptionPane.showMessageDialog(null, se.getMessage(),"Get All Pasien Gagal!", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

}
