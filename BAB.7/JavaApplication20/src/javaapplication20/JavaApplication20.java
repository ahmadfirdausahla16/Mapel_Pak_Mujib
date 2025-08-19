/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication20;

/**
 *
 * @author PC 32 - LAB R1
 */
import javax.swing.JOptionPane;
public class JavaApplication20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama[] = new String[3];
        nama[0] = JOptionPane.showInputDialog(null,"Nama pertama :","index : 0", JOptionPane.INFORMATION_MESSAGE);
        nama[1] = JOptionPane.showInputDialog(null,"Nama kedua :","index : 1", JOptionPane.INFORMATION_MESSAGE);
        nama[2] = JOptionPane.showInputDialog(null,"Nama ketiga :","index : 2", JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showMessageDialog(null, nama[0]+", "+nama[1]+", "+nama[2]);
        
        
        String umur[][] = new String[2][2];
        umur[0][0] = "Budi";
        umur[0][1] = "20";
        umur[1][0] = "Andi";
        umur[1][1] = "45";

        System.out.println("Nama : "+umur[0][0]+" umur : "+umur[0][1]);
        System.out.println("Nama : "+umur[1][0]+" umur : "+umur[1][1]);

    }
    
}