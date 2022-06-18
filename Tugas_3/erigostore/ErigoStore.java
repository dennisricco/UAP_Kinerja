/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erigostore;

import java.util.Scanner;
/**
 *
 * @author Ricco
 */
public class ErigoStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input =  new Scanner(System.in);
    
    erigoKasir jaket = new erigoKasir();
    
    System.out.println("================================================= ERIGO STORE =================================================== ");
    System.out.println("List Jaket yang kami jual :");
    System.out.println("Jaket A dengan harga satuan Rp.100.000");
    System.out.println("Jaket B dengan harga satuan Rp.125.000");
    System.out.println("Jaket C dengan harga satuan Rp.175.000");
    System.out.println("================================================================================================================= ");
    
    System.out.print("Masukkan jenis jaket yang ingin anda beli = ");
    String namaBarang = input.next();
    
    if (namaBarang.equalsIgnoreCase("A")) {
            System.out.print("Masukkan jumlah yang ingin anda beli = ");
            int jumlahBarang = input.nextInt();
            jaket.setjumlahBarang(jumlahBarang);
            jaket.hargaBarangA();
        }
        else if (namaBarang.equalsIgnoreCase("B")) {
            System.out.print("Masukkan jumlah yang ingin anda beli = ");
            int jumlahBarang = input.nextInt();
            jaket.setjumlahBarang(jumlahBarang);
        }
        else if (namaBarang.equalsIgnoreCase("C")) {
            System.out.print("Masukkan jumlah yang ingin anda beli = ");
            int jumlahBarang = input.nextInt();
            jaket.setjumlahBarang(jumlahBarang);
        }
     System.out.println();
     System.out.println("====================================== TERIMA KASIH TELAH BERBELANJA ============================================ ");
    
    
        
        }
    }
    

