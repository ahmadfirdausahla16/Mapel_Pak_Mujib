/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bab.pkg4;

/**
 *
 * @author PC 32 - LAB R1
 */
public class BAB4 {

    public static String variabel1;
    public static int variabel2;

    public static void main(String[] args) {
        
        // Code from the first main method
        System.out.println("Varibel1 -> " + variabel1);
        System.out.println("Variabel -> " + variabel2);
        System.out.println("Setelah di isi dengan value");
        variabel1 = "Ahmad";
        variabel2 = 16;
        System.out.println("Variabel1 -> " + variabel1);
        System.out.println("Variabel2 -> " + variabel2);
        System.out.println("---------------------------");

        // Code from the second main method
        String var1 = "12345";
        String var2 = "1.2";
        String var3 = "1";
        
        System.out.println("var1 -> " + var1);
        System.out.println("var2 -> " + var2);
        System.out.println("var3 -> " + var3);
        System.out.println("setelah di konversikan : ");

        int bulat = Integer.parseInt(var1);
        double pecahan = Double.parseDouble(var2);
        short bulat2 = Short.parseShort(var3);
        
        System.out.println("konversi ke integrer -> " + bulat);
        System.out.println("konversi ke integrer -> " + pecahan);
        System.out.println("konversi ke integrer -> " + bulat2);
        

        // Code from the third main method
        System.out.println("---------------------------");
        
        String Var1 = "5";
        String Var2 = "2";
            
        int var1H = Integer.parseInt(Var1);
        int var2H = Integer.parseInt(Var2);
            
        System.out.println(Var1 + " + " + Var2 + " = " + (var1H + var2H));
        }
        
}