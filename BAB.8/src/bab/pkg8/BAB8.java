/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab.pkg8;

/**
 *
 * @author PC 32 - LAB R1
 */
import javax.swing.JOptionPane;

public class BAB8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World");
        }
        System.out.println("-----------");

        for (int a = 2; a < 12; a += 2) {
            System.out.println("Bilangan genap :" + " " + a);
        }
        System.out.println("-----------");

        int baris = 5;

        for (int i = 0; i <= baris; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("-----------");

        int jumlahKelas = 0;
        boolean inputValid = false;
        while (!inputValid) {
            try {
                String input = JOptionPane.showInputDialog(null,
                        "Masukan jumlah kelas : ",
                        "Input",
                        JOptionPane.INFORMATION_MESSAGE);
                if (input == null) { // Jika user klik cancel
                    System.out.println("Input dibatalkan.");
                    return; // Keluar dari program
                }
                jumlahKelas = Integer.parseInt(input);
                if (jumlahKelas < 0) {
                    JOptionPane.showMessageDialog(null, "Jumlah kelas tidak boleh negatif. Masukkan angka positif.");
                } else {
                    inputValid = true;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Input tidak valid! Masukkan angka untuk jumlah kelas.");
            }
        }


        String isiKelas[][] = new String[jumlahKelas][];
        for (int kelas = 0; kelas < jumlahKelas; kelas++) { // Awal loop kelas
            String namaKelas = JOptionPane.showInputDialog(null, "Nama Kelas :", "Masukan Nama Kelas",
                    JOptionPane.INFORMATION_MESSAGE);
            if (namaKelas == null) { // Jika user klik cancel
                System.out.println("Input nama kelas dibatalkan.");
                break; // Keluar dari loop kelas
            }
            if (namaKelas.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Nama kelas tidak boleh kosong. Silakan masukkan nama kelas.");
                kelas--; // Ulangi input untuk kelas yang sama
                continue;
            }

            int jumlahKursi = 0;
            inputValid = false;
            while (!inputValid) {
                try {
                    String input = JOptionPane.showInputDialog(null, "Jumlah murid masing - masing kelas " + namaKelas + ": ",
                            "Input",
                            JOptionPane.INFORMATION_MESSAGE);
                    if (input == null) { // Jika user klik cancel
                        System.out.println("Input jumlah murid dibatalkan untuk kelas " + namaKelas + ".");
                        // Opsi: bisa juga break dari loop kelas atau kembali ke input nama kelas
                        jumlahKursi = 0; // Set ke 0 agar tidak error saat inisialisasi array
                        inputValid = true; // Keluar dari loop input jumlahKursi
                        break; // Keluar dari loop while untuk input jumlahKursi
                    }
                    jumlahKursi = Integer.parseInt(input);
                    if (jumlahKursi < 0) {
                        JOptionPane.showMessageDialog(null, "Jumlah murid tidak boleh negatif. Masukkan angka positif.");
                    } else {
                        inputValid = true;
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Input tidak valid! Masukkan angka untuk jumlah murid.");
                }
            }
            
            // Jika input jumlahKursi dibatalkan, lompat ke kelas berikutnya atau keluar
            if (!inputValid) {
                continue; // Lanjutkan ke kelas berikutnya jika input jumlahKursi dibatalkan
            }


            isiKelas[kelas] = new String[jumlahKursi];
            System.out.println("Kelas " + namaKelas
                    + " : ");
            for (int kursi = 0; kursi < jumlahKursi; kursi++) { // Awal loop kursi
                String namaSiswa = JOptionPane.showInputDialog(null,
                        "Nama Siswa", "Kelas " + namaKelas + " (Siswa ke-" + (kursi + 1) + ")",
                        JOptionPane.INFORMATION_MESSAGE);
                if (namaSiswa == null) { // Jika user klik cancel
                    System.out.println("Input nama siswa dibatalkan untuk kelas " + namaKelas + ".");
                    // Isi sisa kursi dengan null atau string kosong jika dibatalkan
                    for (int k = kursi; k < jumlahKursi; k++) {
                        isiKelas[kelas][k] = null; // atau "";
                    }
                    break; // Keluar dari loop siswa
                }
                if (namaSiswa.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Nama siswa tidak boleh kosong. Silakan masukkan nama siswa.");
                    kursi--; // Ulangi input untuk siswa yang sama
                    continue;
                }
                isiKelas[kelas][kursi] = namaSiswa;
                System.out.println("Nama Siswa " +
                        isiKelas[kelas][kursi]);
            } // Akhir loop kursi
        } // Akhir loop kelas

    } // Akhir method main

} // Akhir class BAB8
