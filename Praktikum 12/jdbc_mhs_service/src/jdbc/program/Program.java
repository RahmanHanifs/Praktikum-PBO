/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc.program;

import java.util.*;
import jdbc.service.MysqlMahasiswaService;
import jdbc.model.Mahasiswa;
/**
 *
 * @author LENOVO
 */
public class Program {
    static MysqlMahasiswaService service = new MysqlMahasiswaService();
    public static void main(String[] args) {
        List<Mahasiswa> listmhs = new ArrayList<>();
        System.out.println(" ");
        
        //Insert
        System.out.println("===insert");
        Mahasiswa mhsAdd = new Mahasiswa(1, "Nina");
        service.add(mhsAdd);
        Mahasiswa mhsAdd2 = new Mahasiswa(2, "Rudi");
        service.add(mhsAdd2);
        Mahasiswa mhsAdd3 = new Mahasiswa(3, "Beni");
        service.add(mhsAdd3);
        Mahasiswa mhsAdd4 = new Mahasiswa(5, "Haryo");
        service.add(mhsAdd4);
        System.out.println("berhasil insert: " + mhsAdd);
        displayAll();
        
        //Update
        System.out.println("===update");
        Mahasiswa mhsUpdate = service.getById(5);
        System.out.println("Akan diupdate data lama: " + mhsUpdate);
        service.update(mhsUpdate);
        displayAll();
        
        //Delete
        System.out.println("===delete");
        System.out.println("akan didelete: " + service.getById(5));
        service.delete(5);
        displayAll();
    }
    
    public static void displayAll() {
        List<Mahasiswa> listMhs = service.getAll();
        System.out.println("===displayAll");
        for (Mahasiswa mhs : listMhs) {
            System.out.println(mhs);
        }
    }
}

