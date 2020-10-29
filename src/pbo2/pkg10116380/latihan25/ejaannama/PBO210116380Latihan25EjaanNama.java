/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116380.latihan25.ejaannama;

import java.util.Scanner;

/**
 * @author 
 * NAMA: Zain Achamd Rizqullah
 * KELAS: PBO2
 * NIM: 10116380
 * Deskripsi: Program Ejaan Nama
 */
public class PBO210116380Latihan25EjaanNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         String nameFront;
        int i = 0;
        int j = 1;
        
        Scanner name = new Scanner(System.in);
        
        System.out.print("Masukkan nama depan anda untuk dieja\t : ");
        nameFront = name.next();
        String[] frontName = nameFront.split("");
        
        System.out.println("");
        System.out.println("Ejaan untuk " + nameFront + " adalah : ");
        while (i < frontName.length){
            System.out.println("Huruf ke-" + j + " : " + frontName[i]);
            j = j + 1;
            i = i + 1;
        }
    }
    
}
