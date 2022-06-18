/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspraktikum6;

/**
 *
 * @author Ricco
 */
public class Manusia{
    private String nama;
    private String NIK;
    private boolean jenisKelamin;
    private boolean menikah;
    private double tunjangan;
    int cetak;
    
    public Manusia(String nama, String NIK, boolean jenisKelamin, boolean menikah) {
        this.nama = nama;
        this.NIK = NIK;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
        cetak++;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setNIK(String NIK) {
        this.NIK = NIK;
    }
    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }
    public String getNama(){
        return nama;
    }
    public String getNIK() {
        return NIK;
    }
    public boolean getJenisKelamin() {
        return jenisKelamin;
    }
    public boolean getMenikah() {
        return menikah;
    }
    public double getTunjangan() {
        if (this.getMenikah() == true) {
            if (this.getJenisKelamin() == true) {
                tunjangan = 25;
            }else{
                tunjangan = 20;
            }
            }else{
            tunjangan = 15;
        }
        return tunjangan;
    }
    public double getPendapatan() {
        double pendapatan = getTunjangan();
        return pendapatan;
    }
    @Override
    public String toString() {
        System.out.println("Nama          : " + this.getNama());
        System.out.println("NIK           : " + this.getNIK());
        System.out.println("Jenis Kelamin : " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Pendapatan    : " + this.getPendapatan() +"$");
        return " ";
    }
}
