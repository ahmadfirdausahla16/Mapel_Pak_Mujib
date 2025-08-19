/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab.pkg6;

import javax.swing.JOptionPane;
/**
 *
 * @author PC 32 - LAB R1
 */
public class BAB6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String temp = JOptionPane.showInputDialog(null, "Masukan Angka! : ", "Mengecek angka ganjil atau genap", JOptionPane.QUESTION_MESSAGE);
        int input = Integer.parseInt(temp);
        System.out.println((input % 2)==0);
        if ((input % 2)== 0){
            JOptionPane.showMessageDialog(null, "Angka : " + input + " adalah bilangan genap", "Information", JOptionPane.INFORMATION_MESSAGE);
        }else if ((input%2)==1){
            JOptionPane.showMessageDialog(null, "Angka : " + input + " adalah bilangan ganjil", "Information", JOptionPane.INFORMATION_MESSAGE);
        }
        
        String umur = JOptionPane.showInputDialog(null, "Masukan umurmu : ", "Verifikasi usia", JOptionPane.QUESTION_MESSAGE);
        int kategori = Integer.parseInt(umur);
        if ((kategori<=5)){
            JOptionPane.showMessageDialog(null, "Maff, Anda masih balita", "Udah boleh ngedugem?", JOptionPane.INFORMATION_MESSAGE);
        }else if((kategori <= 10 & >=5))
            JOptionPane.showMessageDialog(null, "Maff, Anda masih balita", "Udah boleh ngedugem?", JOptionPane.INFORMATION_MESSAGE);
    }
    
}   
