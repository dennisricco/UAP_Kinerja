/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package erigostore;

/**
 *
 * @author Ricco
 */
public class erigoKasir {
    String namaBarang;
    final float jaketErigoA = 100_000;
    final float jaketErigoB = 125_000;
    final float jaketErigoC = 175_000;
    private int jumlahBarang;
    private float hargaTotal;
    
    void hargaTotal(float hargaTotal){
        this.hargaTotal = hargaTotal;
    }
    void setjumlahBarang(int jumlahBarang){
        this.jumlahBarang = jumlahBarang;
    }
    void hargaBarangA(){
        if(jumlahBarang>100){
            hargaTotal = jumlahBarang * 95000;
            System.out.println("Harga satuan\t\t\t : Rp." + 100000);
            System.out.println("Selamat anda mendapatkan potongan harga Rp 5.000 per pcs dikarenakan membeli dengan jumlah lebih dari 100 pcs");
            System.out.println("Jadi anda harus membayar sebesar : Rp. 95.000 per pcs");
            System.out.printf("Harga total\t\t\t : Rp %,.2f" , hargaTotal);
        }
        else{
            hargaTotal = jumlahBarang * jaketErigoA;
            System.out.println("Harga satuan\t\t\t : Rp." + jaketErigoA);
            System.out.println("Jadi anda harus membayar sebesar :");
            System.out.printf("Harga total\t\t\t : Rp %,.2f" , hargaTotal);
        }
    }
    void hargaBarangB(){
        if(jumlahBarang>100){
            hargaTotal = jumlahBarang * 120000;
            System.out.println("Harga satuan\t\t\t : Rp." + 125000);
            System.out.println("Selamat anda mendapatkan potongan harga Rp 5.000 per pcs dikarenakan membeli dengan jumlah lebih dari 100 pcs");
            System.out.println("Jadi anda harus membayar sebesar : Rp.120.000 per pcs");
            System.out.printf("Harga total\t\t\t : Rp %,.2f" , hargaTotal);
        }
        else{
            hargaTotal = jumlahBarang * jaketErigoB;
            System.out.println("Harga satuan\t\t\t : Rp." + jaketErigoB);
            System.out.println("Jadi anda harus membayar sebesar :");
            System.out.printf("Harga total\t\t\t : Rp %,.2f" , hargaTotal);
        }
    }
    void hargaBarangC(){
        if(jumlahBarang>100){
            hargaTotal = jumlahBarang * 160000;
            System.out.println("Harga satuan\t\t\t : Rp." + 175000);
            System.out.println("Selamat anda mendapatkan potongan harga Rp 15.000 per pcs dikarenakan membeli dengan jumlah lebih dari 100 pcs");
            System.out.println("Jadi anda harus membayar sebesar : Rp. 160.000 per pcs");
            System.out.printf("Harga total\t\t\t : Rp %,.2f" , hargaTotal);
        }
        else{
            hargaTotal = jumlahBarang * jaketErigoC;
            System.out.println("Harga satuan\t\t\t : Rp." + jaketErigoC);
            System.out.println("Jadi anda harus membayar sebesar :");
            System.out.printf("Harga total\t\t\t : Rp %,.2f" , hargaTotal);
        }
    }
    }
    

