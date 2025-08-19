/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab.pkg5;

/**
 *
 * @author PC 32 - LAB R1
 */
public class BAB5 {

    /**
     * @param args the command line arguments
     */
    
    public static void main (String[]args){
        
        Integer sebelum = 20;
        Integer setelah;
        
        System.out.println("Ini sebelum di increment: " + sebelum);
        setelah = ++sebelum;
        System.out.println("Ini sesudah di increment: " + setelah);
        System.out.println("---------------------------");
        
        sebelum = 20;
        
        System.out.println("Ini sebelum di Decrement: " + sebelum);
        setelah = --sebelum;
        System.out.println("Ini sesudah di Decrement: " + setelah);
        System.out.println("---------------------------");
        
        int a = 10;
        int b = 0;
        
        System.out.println("Sebelum negasi : " + a);
        b = -a;
        System.out.println("Setelah negasi : " + b);
        System.out.println("---------------------------");
        

        int a1 =
        10; int a2 =
        2;
        System.out.println("Penambahan 10 + 2 : " + (a1 + a2));

        int b1 =
        10; int b2 =
        2;
        System.out.println("Pengurangan 10 - 2 : " + (b1 - b2));

        int c1 = 16;
        int c2 = 2;
        System.out.println("Perkalian 16 * 2 : " + (c1 * c2));

        int d1 = 16;
        int d2 = 2;
        System.out.println("Pembagian 16 / 2 : " + (d1 / d2));

        int e1 = 16;
        int e2 = 2;
        System.out.println("Sisa bagi 16 dan 2 : " + (e1 %e2));
        System.out.println("---------------------------");
        
        int c = 10;
        int d = 15;
        System.out.println("Variabel a : " + c);
        System.out.println("Variabel b : " + d);
        System.out.println("Apakah 10 kurang dari 15 " + (c < d));
        System.out.println("Apakah 10 kurang dari 15 " + (d < c));
        System.out.println("Apakah 10 kurang dari 10 " + (d < d));
        System.out.println("---------------------------");
        
        int e = 2;
        int f = 3;
        System.out.println("Variabel a : " + e);
        System.out.println("Variabel b : " + f);
        System.out.println("Apakah 2 lebih besar dari 3 " + (e > f));
        System.out.println("Apakah 3 lebih besar dari 2 " + (f < e));
        System.out.println("Apakah 3 lebih besar dari 3 " + (f < f));
        System.out.println("---------------------------");
        
        int g = 4;
        int h = 3;
        System.out.println("Variabel a : = " + g);
        System.out.println("Variabel a : = " + h);
        System.out.println("Apakah " + g + " sama lebih kecil atau sama dengan " + h +  " ? " + (g<=h));
        System.out.println("---------------------------");
        
        int i = 4;
        int j = 3;
        System.out.println("Variabel a : = " + i);
        System.out.println("Variabel a : = " + j);
        System.out.println("Apakah " + i + " lebih besar atau sama dengan " + j +  " ? " + (i>=j));
        System.out.println("---------------------------");
        
        System.out.println("true and true : " + (true && true));
        System.out.println("true and false : " + (true && false));
        System.out.println("false and false : " + (false && false));
        System.out.println("false and true : " + (false && true));
        System.out.println("---------------------------");
        
        System.out.println("true or true : " + (true || true));
        System.out.println("true or false : " + (true || false));
        System.out.println("false or false : " + (false || false));
        System.out.println("false or true : " + (false || true));
        System.out.println("---------------------------");

    }
}
