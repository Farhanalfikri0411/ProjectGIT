/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

/**
 *
 * @author Ryan
 */
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Ryan 
 */
public class BinarySearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int nilai;
      int indek;
      


      Scanner s = new Scanner(System.in);
      System.out.println("Masukkan Jumlah Value");
      int n = s.nextInt();

      int nilaiInt[] = new int[n];


      for(int x = 0; x < n; x++){
        System.out.println("Masukkan Angka ke - " + (x+1));
        nilaiInt[x] = s.nextInt();
      }

      System.out.println("Masukkan Angka yang ingin di cari");
      nilai = s.nextInt();

      
      // Mendeklarasikan, membuat, menginisialisasi
      // dan menampilkan elemen larik
      
        System.out.println("Menampilkan nilai sesuai urutan aslinya : ");
        System.out.print("[");
      for (int x = 0; x < nilaiInt.length; x++){
            System.out.print(nilaiInt[x]);
            if(x < nilaiInt.length-1){
              System.out.print(", ");
            }
            }
  
        System.out.println("]");
      // Menampilkan larik setelah diurutkan
      Arrays.sort(nilaiInt);
        System.out.println("Menampilkan nilai setelah di urut : ");
        System.out.print("[");        
      for (int x = 0; x < nilaiInt.length; x++){
            System.out.print(nilaiInt[x]);
            if(x < nilaiInt.length-1){
              System.out.print(", ");
            }
            }
      System.out.print("]");
      // Nilai elemen dicari dan pemanggilan metoda
      
      indek = mencariDenganBS(nilaiInt, nilai);      
      
        System.out.println("");
        System.out.println("nilai elemen yang dicari : " + nilai);
        System.out.println("nilai indek yang dicari : " + indek);
        System.out.println("urutan angka yang dicari : " + (indek+1));
      
    }
       // Metode dengan pendekatan binary search
   public static int mencariDenganBS(int[] larikC, int nilaiDicari) {
       
      int bawah = 0;
      int atas =larikC.length - 1;
 
      while (atas >= bawah) {
         int tengah = (bawah + atas) / 2;
         if (nilaiDicari < larikC[tengah])
            atas = tengah - 1;
         else if (nilaiDicari == larikC[tengah])
            return tengah;
         else
            bawah = tengah + 1;
      }
       
      return -1;
 
   } // Akhir blok metoda mencariDenganBS


}


