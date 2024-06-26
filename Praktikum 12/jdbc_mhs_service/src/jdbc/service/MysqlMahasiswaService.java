/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.service;
import java.sql.*;
import java.util.*;
import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;
/**
 *
 * @author LENOVO
 */
public class MysqlMahasiswaService {
    Connection koneksi = null;
    public MysqlMahasiswaService() {
        koneksi = MysqlUtility.getConnection();
    }

    
    public Mahasiswa makeMhsObject() {
     
        return new Mahasiswa();
    }

    
    public void add(Mahasiswa mhs) {
        try {
            String query = "INSERT INTO mahasiswa (id, nama) VALUES (?, ?)";
            PreparedStatement statement = koneksi.prepareStatement(query);
            statement.setInt(1, mhs.getId());
            statement.setString(2, mhs.getNama());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /** Update data mahasiswa */
    public void update(Mahasiswa mhs) {
        try {
            String query = "UPDATE mahasiswa SET nama = ? WHERE id = ?";
            PreparedStatement statement = koneksi.prepareStatement(query);
            statement.setString(1, mhs.getNama());
            statement.setInt(2, mhs.getId());
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /** Delete data mahasiswa sesuai id */
    public void delete(int id) {
        try {
            String query = "DELETE FROM mahasiswa WHERE id = ?";
            PreparedStatement statement = koneksi.prepareStatement(query);
            statement.setInt(1, id);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /** Ambil mahasiswa sesuai id */
    public Mahasiswa getById(int id) {
        Mahasiswa mhs = null;
        try {
            String query = "SELECT * FROM mahasiswa WHERE id = ?";
            PreparedStatement statement = koneksi.prepareStatement(query);
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                mhs = new Mahasiswa(rs.getInt("id"), rs.getString("nama"));
            }
            rs.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return mhs;
    }

    /** Ambil semua isi tabel mahasiswa */
    public List<Mahasiswa> getAll() {
        List<Mahasiswa> listMhs = new ArrayList<>();
        try {
            String query = "SELECT * FROM mahasiswa";
            Statement statement = koneksi.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                Mahasiswa mhs = new Mahasiswa(rs.getInt("id"), rs.getString("nama"));
                listMhs.add(mhs);
            }
            rs.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listMhs;
    }
    
}
