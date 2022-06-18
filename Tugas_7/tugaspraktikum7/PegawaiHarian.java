/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspraktikum7;

/**
 *
 * @author Ricco
 */
public class PegawaiHarian extends Pegawai {
    private double upahPerjam;
    private int totalJam;
    
        public PegawaiHarian(String nama, String noKTP, double upahPerjam,int totalJam){
            super(nama, noKTP);
            this.upahPerjam = upahPerjam;
            this.totalJam = totalJam;
        }
        public double getUpahPerjam() {
            return upahPerjam;
        }
        public void setUpahPerjam(double upahPerjam) {
             this.upahPerjam = upahPerjam;
        }
        public int getTotalJam() {
            return totalJam;
        }
        public void setTotalJam(int totalJam) {
            this.totalJam = totalJam;
        }
        @Override
        public double gaji(){
        if (this.totalJam <= 40){
        return (getUpahPerjam()*getTotalJam());
        }
        else{
        return ((getUpahPerjam()*40)+(getTotalJam()-40)*getUpahPerjam()*1.5); 
        }
        }
        @Override
        public String toString(){
            return "Pegawai Harian\t : "+getNama() + "\nNo. KTP \t : " +getNoKTP()+ "\nUpah/jam\t : "+getUpahPerjam() + "\nTotal jam kerja\t : " +getTotalJam() +"\nPendapatan\t : Rp."+(int)gaji();
        }
}
