/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PerpustakaanDigital;

/**
 *
 * @author NAILONG
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Buku> daftarBuku = new ArrayList<>();
        Peminjaman peminjaman = new Peminjaman();

        int pilihan;

        do {
            System.out.println("\n=== SISTEM PERPUSTAKAAN DIGITAL ===");
            System.out.println("1. Input Data Buku");
            System.out.println("2. Tampilkan Daftar Buku");
            System.out.println("3. Pinjam Buku");
            System.out.println("4. Kembalikan Buku");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan: ");

            try {
                pilihan = sc.nextInt();
                sc.nextLine(); // buang enter
            } catch (Exception e) {
                System.out.println("Input harus angka!");
                sc.nextLine();
                pilihan = -1;
            }

            switch (pilihan) {

                case 1:
                    System.out.print("ID Buku     : ");
                    String id = sc.nextLine();

                    System.out.print("Judul Buku  : ");
                    String judul = sc.nextLine();

                    System.out.print("Penulis     : ");
                    String penulis = sc.nextLine();

                    Buku buku = new Buku(id, judul, penulis);
                    daftarBuku.add(buku);

                    System.out.println(">> Buku berhasil ditambahkan");
                    break;

                case 2:
                    if (daftarBuku.isEmpty()) {
                        System.out.println(">> Data buku masih kosong");
                    } else {
                        System.out.println("\nDaftar Buku:");
                        for (Buku b : daftarBuku) {
                            System.out.println("- " + b.getInfo());
                        }
                    }
                    break;

                case 3:
                    System.out.print("Masukkan ID Buku yang dipinjam: ");
                    String idPinjam = sc.nextLine();
                    boolean ditemukan = false;

                    for (Buku b : daftarBuku) {
                        if (b.getId().equalsIgnoreCase(idPinjam)) {
                            peminjaman.tambahBuku(b);
                            peminjaman.pinjam();
                            ditemukan = true;
                            break;
                        }
                    }

                    if (!ditemukan) {
                        System.out.println(">> Buku tidak ditemukan");
                    }
                    break;

                case 4:
                    peminjaman.kembalikan();
                    break;

                case 0:
                    System.out.println("Program selesai. Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 0);

        sc.close();
    }
    
}
