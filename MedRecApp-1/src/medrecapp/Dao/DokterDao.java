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
import medrecapp.Entity.Dokter;
import medrecapp.Interfaces.DokterInterface;

/**
 *
 * @author Fachrul Pralienka BM
 */
public class DokterDao implements DokterInterface{
    
    private Connection connection;

    private final String insertDokter = "INSERT INTO dokter VALUES(?,?,?,?,?)";
    private final String updateDokter =
            "UPDATE dokter SET nm_dokter=?, id_spesialis=?, tgl_kerja_dok=?, alamat_dok=? WHERE no_dokter=?";
    private final String deleteDokter = "DELETE FROM dokter WHERE no_dokter=?";
    private final String getAllDokter = "SELECT * FROM dokter";

    public DokterDao(Connection connection) {
        this.connection = connection;
    }

    public void insertDokter(Dokter d) throws SQLException {
        try{
            PreparedStatement ps = (PreparedStatement) connection.prepareStatement(insertDokter);
            ps.setString(1, d.getNoDokter());
            ps.setString(2, d.getNmDokter());
            ps.setString(3, d.getIdSpesialis());
            ps.setString(4, d.getTglKerjaDok());
            ps.setString(5, d.getAlamatDok());
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Data dokter berhasil ditambah!", "Insert Dokter", JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException se){
            JOptionPane.showMessageDialog(null, se.getMessage(),"Insert Dokter Gagal!",JOptionPane.ERROR_MESSAGE);
        }
    }

    public void updateDokter(Dokter d, String noDokter) throws SQLException {
        try{
            PreparedStatement ps = (PreparedStatement) connection.prepareStatement(updateDokter);
            ps.setString(1, d.getNmDokter());
            ps.setString(2, d.getIdSpesialis());
            ps.setString(3, d.getTglKerjaDok());
            ps.setString(4, d.getAlamatDok());
            ps.setString(5, noDokter);
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Data dokter berhasil diubah!", "Update Dokter", JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException se){
            JOptionPane.showMessageDialog(null, se.getMessage(),"Update Dokter Gagal!",JOptionPane.ERROR_MESSAGE);
        }
    }

    public void deleteDokter(String noDokter) throws SQLException {
        try{
            PreparedStatement ps = (PreparedStatement) connection.prepareStatement(deleteDokter);
            ps.setString(1, noDokter);
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Data dokter berhasil dihapus!","Delete Dokter",JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException se){
            JOptionPane.showMessageDialog(null, se.getMessage(),"Delete Dokter Gagal!",JOptionPane.ERROR_MESSAGE);
        }
    }

    public List getAllDokter() throws SQLException {
        try{
            List list = new ArrayList();
            Statement s = (Statement) connection.createStatement();
            ResultSet rs = s.executeQuery(getAllDokter);
            while(rs.next()){
                Dokter d = new Dokter();
                d.setNoDokter(rs.getString("no_dokter"));
                d.setNmDokter(rs.getString("nm_dokter"));
                d.setIdSpesialis(rs.getString("id_spesialis"));
                d.setTglKerjaDok(rs.getString("tgl_kerja_dok"));
                d.setAlamatDok(rs.getString("alamat_dok"));
                list.add(d);
            }
            rs.close();
            s.close();
            return list;
        }catch(SQLException se){
            JOptionPane.showMessageDialog(null, se.getMessage(),"Get All Dokter Gagal!", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

}
