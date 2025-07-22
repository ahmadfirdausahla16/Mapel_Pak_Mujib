/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyekbaru;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Axioo
 */
public class ProyekBaru {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        System.out.println("Hallo" + " " + "World");
        System.out.println(2 + " " + 5);
        System.out.println(2 + 5);
        System.out.println("Angka" + " " + 5);
        System.out.println("2+5" + "=" + 2 + 5);
        System.out.println("2+5" + "=" + (2 + 5));
        System.out.println(" ");

        String namaDepan = "";
        String namaBelakang = "";
        Scanner input = new Scanner(System.in);
        System.out.println("Nama depan =");
        namaDepan = input.next();
        System.out.println("Nama Belakang=");
        namaBelakang = input.next();
        System.out.println("Jadi namamu adalah");
        System.out.println(namaDepan + " " + namaBelakang);
        System.out.println(" ");

        String namadepan = "";
        String namabelakang = "";

        //buat project dari inputstream
        InputStreamReader ireader
                = new InputStreamReader(System.in);

        //buat objek buffereader
        BufferedReader breader
                = new BufferedReader(ireader);
        System.out.println("Nama Depan : ");

        //membaca inputan user
        namadepan
                = breader.readLine();
        System.out.println("Nama Belakang : ");

        //membaca inputan user
        namabelakang
                = breader.readLine();
        System.out.println("Nama saya adalah : ");
        System.out.println(namadepan + " " + namabelakang);
        System.out.println("");

        String nama
                = JOptionPane.showInputDialog("Masukan Nama: ");
        System.out.println("Nama : " + nama);

        String a
                = JOptionPane.showInputDialog("Masukan nilaiuntuk variabel a : ");

        String b
                = JOptionPane.showInputDialog("Masukan nilaiuntuk variabel b : ");

        System.out.println("Hasil :"
                + (Integer.parseInt(a)
                * Integer.parseInt(b)));
        
        String Nama = "Budi";
        String jurusan = "Sistem Informasi";
        JOptionPane.showMessageDialog(null, "Halo " + Nama + ",jurusan Kamu " + jurusan);
        
        JOptionPane.showMessageDialog(
        null, "Sebuah Informasi.","Informasi",
        JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showMessageDialog(
        null, "Sebuah Error !","Error",
        JOptionPane.ERROR_MESSAGE);
        
        JOptionPane.showMessageDialog(
        null, "Sebuah Peringatan.","Peringatan",
        JOptionPane.WARNING_MESSAGE);
        
        JOptionPane.showMessageDialog(
        null, "Sebuah Pertanyaan.", "Pertanyaan",
        JOptionPane.QUESTION_MESSAGE);
        
        JOptionPane.showMessageDialog(
        null, "Sebuah Plain Message.","Plain Message",
        JOptionPane.PLAIN_MESSAGE);
        
        int pertanyaan =JOptionPane.showConfirmDialog(null, "Pilih Yes atau No?", "Pertanyaan",JOptionPane.YES_NO_OPTION);

        if(JOptionPane.YES_OPTION == pertanyaan){
        JOptionPane.showMessageDialog(null, "Kamu memilih Yes.");
        }else if(JOptionPane.NO_OPTION == pertanyaan){
        JOptionPane.showMessageDialog(null, "Kamu memilih No.");
        }
    }
}