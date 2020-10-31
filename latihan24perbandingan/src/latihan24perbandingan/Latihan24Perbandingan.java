/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan24perbandingan;

import java.util.Scanner;

/**
 *
 * @author M Hongki Alfikram
 * Kelas : IF10-K
 * NIM :10119915
 */
public class Latihan24Perbandingan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nilai1, nilai2, hasil;
        String pilihan;
        Scanner scanner = new Scanner(System.in);
        System.out.println("=====Program Perbandingan Nilai=====");
        do {
            System.out.print("Masukkan nilai Pertama : ");
            nilai1 = scanner.nextInt();
            System.out.print("Masukkan nilai Kedua : ");
            nilai2 = scanner.nextInt();
            if (nilai1 < nilai2){
                System.out.printf("Hasil : %1$d Lebih Kecil dari %2$d%n", nilai1, nilai2);
            }
            if (nilai1 > nilai2){
                System.out.printf("Hasil : %1$d Lebih Besar dari %2$d%n", nilai1, nilai2);
            }
            if (nilai1 == nilai2){
                System.out.printf("Hasil : %1$d Sama Dengan %2$d%n", nilai1, nilai2);
            }
            System.out.print("Ulangi Aktifitas? Ya/Tidak : ");
            pilihan = scanner.next();
            System.out.println();
        } while (pilihan.equals("ya") || pilihan.equals("Ya"));
    }
    
}
