/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PerpustakaanDigital;

/**
 *
 * @author LENOVO
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Perpustakaan implements Serializable {
    private List<Anggota> daftarAnggota = new ArrayList<>();

    public void tambahAnggota(Anggota a) {
        daftarAnggota.add(a);
    }

    public void tampilkanAnggota() {
        for (Anggota a : daftarAnggota) {
            System.out.println(a.getNama());
        }
    }
}
