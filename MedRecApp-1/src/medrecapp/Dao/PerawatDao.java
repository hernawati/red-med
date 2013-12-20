/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
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
import medrecapp.Entity.Perawat;
import medrecapp.Interfaces.PerawatInterface;

/**
 *
 * @author Hady
 */
public class PerawatDao implements PerawatInterface{
    private Connection connection;

    private final String insertPerawat = "INSERT INTO perawat VALUES(?,?,?,?)";
    private final String updatePerawat =
            "UPDATE perawat SET nm_perawat=?, tgl_kerja_per=?, id_unit_rs=? WHERE no_perawat=?";
    private final String deletePerawat = "DELETE FROM perawat WHERE no_perawat=?";
    private final String getAllPerawat = "SELECT * FROM perawat";

    public PerawatDao(Connection connection) {
        this.connection = connection;
    }

    public void insertPerawat(Perawat pr) throws SQLException {
        try{
            PreparedStatement ps = (PreparedStatement) connection.prepareStatement(insertPerawat);
            ps.setString(1, pr.getNoPerawat());
            ps.setString(2, pr.getNmPerawat());
            ps.setString(3, pr.getTglKerjaPer());
            ps.setString(4, pr.getIdUnitRs());
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Data perawat berhasil ditambah!", "Insert Perawat", JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException se){
            JOptionPane.showMessageDialog(null, se.getMessage(),"Insert Perawat Gagal!",JOptionPane.ERROR_MESSAGE);
        }
    }

    public void updatePerawat(Perawat pr, String noPerawat) throws SQLException {
        try{
            PreparedStatement ps = (PreparedStatement) connection.prepareStatement(updatePerawat);
            ps.setString(1, pr.getNmPerawat());
            ps.setString(2, pr.getTglKerjaPer());
            ps.setString(3, pr.getIdUnitRs());
            ps.setString(4, noPerawat);
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Data perawat berhasil diubah!", "Update Perawat", JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException se){
            JOptionPane.showMessageDialog(null, se.getMessage(),"Update Perawat Gagal!",JOptionPane.ERROR_MESSAGE);
        }
    }

    public void deletePerawat(String noPerawat) throws SQLException {
        try{
            PreparedStatement ps = (PreparedStatement) connection.prepareStatement(deletePerawat);
            ps.setString(1, noPerawat);
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Data perawat berhasil dihapus!","Delete Perawat",JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException se){
            JOptionPane.showMessageDialog(null, se.getMessage(),"Delete Perawat Gagal!",JOptionPane.ERROR_MESSAGE);
        }
    }

    public List getAllPerawat() throws SQLException {
        try{
            List list = new ArrayList();
            Statement s = (Statement) connection.createStatement();
            ResultSet rs = s.executeQuery(getAllPerawat);
            while(rs.next()){
                Perawat pr = new Perawat();
                pr.setNoPerawat(rs.getString("no_perawat"));
                pr.setNmPerawat(rs.getString("nm_perawat"));
                pr.setTglKerjaPer(rs.getString("tgl_kerja_per"));
                pr.setIdUnitRs(rs.getString("id_unit_rs"));
                list.add(pr);
            }
            rs.close();
            s.close();
            return list;
        }catch(SQLException se){
            JOptionPane.showMessageDialog(null, se.getMessage(),"Get All Perawat Gagal!", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}
