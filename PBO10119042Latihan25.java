/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanpbo;

import java.util.Scanner;

/**
 *
 * @author Stks
 */
public class IF110119042Latihan25 {
    public static void main(String[] args){
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Masukan Nama depan untuk di eja : ");
        String nama= Scanner.next();
        System.out.println();
        System.out.printf("Ejaan untuk \"%s\" adalah : %n", nama);
        for (int i = 0; i< nama.length(); i++) {
         System.out.printf("Huruf ke-%d : %c%n", i+1, nama.charAt(i));
        }
    }
    
    
}
