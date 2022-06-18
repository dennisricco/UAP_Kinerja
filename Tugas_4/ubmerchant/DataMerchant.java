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
public class DataMerchant {
    static Scanner in = new Scanner(System.in);
    static UB[] merch = new UB [0];
    
    public static UB[] tambahMerchant(UB merchant){
       UB[] mrch = new UB [DataMerchant.merch.length + 1];
       int i = 0;
       while(i < DataMerchant.merch.length){
            mrch[i] = merch[i];
            i++;
        }
        mrch[DataMerchant.merch.length] = merchant;
        return mrch;
    }
    public static void tampilData(){
        for(UB mrch1 : DataMerchant.merch){
        System.out.println("===Tampilan Data Merchant UBFOOD===");
            System.out.println("Nama Merchant   : " + mrch1.getmerchantNama());
            System.out.println("Nama Produk     : " + mrch1.getmenuNama());
            System.out.println("Harga           : " + (int) mrch1.gethargaMenu());
        }
    }
    public static UB cariMerchant (String nama){
        int index = 0;
        int i = 0;
        while(i < DataMerchant.merch.length){
            if(nama == DataMerchant.merch[i].getmerchantNama()){
                index = i;
                break;
            }
        i++;
        }
        return merch[index];
    }
    public static void tampilMerchant(UB merchant){
        System.out.println("===Tampilan Data Merchant UBFOOD===");
        System.out.println("Nama Merchant   : " + merchant.getmerchantNama());
        System.out.println("Nama Produk     : " + merchant.getmenuNama());
        System.out.println("Harga           : " + (int)merchant.gethargaMenu());
    }
    public static void updateMerchant(UB merchant, String merchantNama, String menuNama, double menuHarga){
        merchant.setmerchantNama(merchantNama);
        merchant.setmenuNama(menuNama);
        merchant.sethargaMenu(menuHarga);
    }
}
