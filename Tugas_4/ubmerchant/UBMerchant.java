/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ubmerchant;

import java.util.Scanner;
/**
 *
 * @author Ricco
 */
public class UBMerchant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        DataMerchant.merch = DataMerchant.tambahMerchant(new UB("Bakso Pak Sahid", "Bakso", 8_000));
        DataMerchant.merch = DataMerchant.tambahMerchant(new UB("Nasgor Mblebes", "Nasi Goreng Jawa", 10_000));
        DataMerchant.merch = DataMerchant.tambahMerchant(new UB("Ayam Geprek Kak Ros", "Ayam Kota Ekstra Nasi", 8_000));
        
        System.out.println("==============UB FOOD==============");
        System.out.println("Nama    :Dennis Ricco Hermawan");
        System.out.println("Nim     :215150707111030");
        DataMerchant.tampilData();
        System.out.println();
        
        
        System.out.println("===Tampilan Data Merchant UBFOOD===");
        System.out.print("Nama Merchant : ");
        String merchantNama = input.nextLine();
        System.out.print("Nama Produk   : ");
        String menuNama = input.nextLine();
        System.out.print("Harga         : ");
        double menuHarga = input.nextDouble();
        input.nextLine();
        
        DataMerchant.merch = DataMerchant.tambahMerchant(new UB(merchantNama, menuNama, menuHarga));
        System.out.println();
        
        System.out.println("===Tampilan Data Merchant UBFOOD===");
        DataMerchant.tampilData();
        System.out.println();
        
        DataMerchant.updateMerchant(DataMerchant.cariMerchant("Nagor Mblebes"),"Nasgor Mblebes", "Nasi Goreng Gila", 20_000);
        
        System.out.println("Nama    :Dennis Ricco Hermawan");
        System.out.println("NIM     :215150707111030");
        System.out.println();
        System.out.println("===========UPDATE UB FOOD==========");
        DataMerchant.tampilMerchant(DataMerchant.cariMerchant("Nasgor Mblebes"));


    }
    
}
