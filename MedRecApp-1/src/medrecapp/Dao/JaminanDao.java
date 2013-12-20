/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package medrecapp.Dao;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import medrecapp.Entity.Jaminan;
import medrecapp.Interfaces.JaminanInterface;

/**
 *
 * @author Hady
 */
public class JaminanDao implements JaminanInterface{

     private Connection connection;

    private final String insertJaminan = "INSERT INTO jaminan VALUES(?,?,?)";
    private final String updateJaminan =
            "UPDATE jaminan SET nm_jaminan=?, ket_jaminan=? WHERE id_jaminan=?";
    private final String deleteJaminan = "DELETE FROM jaminan WHERE id_jaminan=?";
    private final String getAllJaminan = "SELECT * FROM jaminan";

    public JaminanDao(Connection connection) {
        this.connection = connection;
    }
    
    public void insertJaminan(Jaminan j) throws SQLException {
        try{
            PreparedStatement ps = (PreparedStatement) connection.prepareStatement(insertJaminan);
            ps.setString(1, j.getIdJaminan());
            ps.setString(2, j.getNmJaminan());
            ps.setString(3, j.getKetJaminan());
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Data jaminan berhasil ditambah!", "Insert Jaminan", JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException se){
            JOptionPane.showMessageDialog(null, se.getMessage(),"Insert Jaminan Gagal!",JOptionPane.ERROR_MESSAGE);
        }
    }

    public void updateJaminan(Jaminan j, String idJaminan) throws SQLException {
        try{
            PreparedStatement ps = (PreparedStatement) connection.prepareStatement(updateJaminan);
            ps.setString(1, j.getNmJaminan());
            ps.setString(2, j.getKetJaminan());
            ps.setString(3, idJaminan);
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Data jaminan berhasil diubah","Update Jaminan", JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException se){
            JOptionPane.showMessageDialog(null, se.getMessage(),"Update Jaminan Gagal",JOptionPane.ERROR_MESSAGE);
        }
    }

    public void deleteJaminan(String idJaminan) throws SQLException {
        try{
            PreparedStatement ps = (PreparedStatement) connection.prepareStatement(deleteJaminan);
            ps.setString(1, idJaminan);
            ps.executeUpdate();
            ps.close();
            JOptionPane.showMessageDialog(null, "Data jaminan berhasil dihapus","Delete jaminan",JOptionPane.INFORMATION_MESSAGE);
        }catch(SQLException se){
            JOptionPane.showMessageDialog(null, se.getMessage(),"Hapus jaminan gagal!",JOptionPane.ERROR_MESSAGE);
        }
    }

    public List getAllJaminan() throws SQLException {
        try{
            List list = new ArrayList();
            Statement s = (Statement) connection.createStatement();
            ResultSet rs = s.executeQuery(getAllJaminan);
            while(rs.next()){
                Jaminan j = new Jaminan();
                j.setIdJaminan(rs.getString("id_jaminan"));
                j.setNmJaminan(rs.getString("nm_jaminan"));
                j.setKetJaminan(rs.getString("ket_jaminan"));
            }
            rs.close();
            s.close();
            return list;
        }catch(SQLException se){
            JOptionPane.showMessageDialog(null, se.getMessage(),"Get All Jaminan Gagal", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
}
