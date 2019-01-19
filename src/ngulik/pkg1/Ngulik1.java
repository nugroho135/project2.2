/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ngulik.pkg1;

import java.util.Scanner;

/**
 *
 * @author Spider
 */
public class Ngulik1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int harga,porsi,total;
        System.out.println("Toko Jual Ayam \n =======================");
        System.out.println("Silahkan Pilih Ayam nya");
        System.out.println("1. Ayam Aja = 5000");
        System.out.println("2. Ayam nya gede = 10000");
        System.out.println("3. Ayam nya import = 15000");
        System.out.println("4. Ayam nya gede import = 20000 \n ===============");
        
        Scanner ss  = new Scanner(System.in);
        
        harga = Integer.parseInt(ss.next());
        
        switch (harga) {
            case 1:
                harga = 5000;
                break;
            case 2:
                harga = 10000;
                break;
            case 3:
                harga = 15000;
                break;
            case 4:
                harga = 20000;
                break;
            default:
                System.out.println("Kaga ada bro nomer segitu");
                harga = 0;
                break;
        }
        
        System.out.println("berapa ekor nih ayamnya?");
        porsi = Integer.parseInt(ss.next());
        total = harga * porsi;
        System.out.println("Total nya Rp." + String.valueOf(total));
    }
    
}
