/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ResponsiPBO;

/**
 *
 * @author Nayla
 */
public class Main {
    public static void main(String[] args) {

        // === Output Produk ===
        Produk produk1 = new Elektronik("Laptop", 18000000, 2);
        produk1.tampilkanInfo();

        System.out.println();

        // === Output Pegawai ===
        Pegawai pegawai1 = new PegawaiTetap("Wangsa", 5000000, 1000000);
        pegawai1.tampilkanInfo();

        System.out.println();

        // === Output Polimorfisme ===
        Produk produkPoli = new Makanan("Beng-Beng", 15000, "2025-12-23");
        Pegawai pegawaiPoli = new PegawaiKontrak("Arza", 3000000, 12);

        produkPoli.tampilkanInfo();
        System.out.println();
        pegawaiPoli.tampilkanInfo();
    }
}