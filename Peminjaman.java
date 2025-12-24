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

public class Peminjaman implements IPeminjaman, Serializable {
    private List<Buku> daftarBuku = new ArrayList<>();

    public void tambahBuku(Buku buku) {
        daftarBuku.add(buku);
    }

    @Override
    public void pinjam() {
        System.out.println("Buku dipinjam:");
        for (Buku b : daftarBuku) {
            System.out.println(b.getInfo());
        }
    }

    @Override
    public void kembalikan() {
        System.out.println("Buku dikembalikan");
        daftarBuku.clear();
    }
}
