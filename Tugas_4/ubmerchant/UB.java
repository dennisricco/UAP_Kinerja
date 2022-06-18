/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ubmerchant;

/**
 *
 * @author Ricco
 */
public class UB {
    private String merchantNama;
    private String menuNama;
    private double hargaMenu;
    
    public UB (String merchantNama, String menuNama, double hargaMenu){
        this.merchantNama = merchantNama;
        this.menuNama = menuNama;
        this.hargaMenu = hargaMenu;
    }
    void setmerchantNama(String merchantNama){
        this.merchantNama = merchantNama;
    }
    public String getmerchantNama(){
        return merchantNama;
    }
    void setmenuNama(String menuNama){
        this.menuNama = menuNama;
    }
    public String getmenuNama(){
        return menuNama;
    }
    void sethargaMenu(double hargaMenu){
        this.hargaMenu = hargaMenu;
    }
    public double gethargaMenu(){
        return hargaMenu;
    }
}
