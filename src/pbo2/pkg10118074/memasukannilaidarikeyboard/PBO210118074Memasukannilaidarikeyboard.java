/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118074.memasukannilaidarikeyboard;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA : FikriMaulana
 * KELAS : IF-2
 * NIM : 10118074
 */
public class PBO210118074Memasukannilaidarikeyboard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.print("Masukan nama anda: ");
        Scanner scanner = new Scanner(System.in);
        
        String nama = scanner.next();
        System.out.println("Nama anda adalah " + nama );
    }
    
}
