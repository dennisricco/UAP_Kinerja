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
public class Manajer extends Pekerja{
    private int lamaKerja;


    public Manajer(int jamKerja, int hariKerja, String NIP, String nama, String NIK,boolean jenisKelamin, boolean menikah, int lamaKerja) {
        super(jamKerja, hariKerja, NIP, nama, NIK, jenisKelamin, menikah);
        this.lamaKerja = lamaKerja;
    }
    public void setLamaKerja(int lamaKerja) {
        this.lamaKerja = lamaKerja;
    }
    public int getLamaKerja() {
        return lamaKerja;
    }
    @Override
    public String toString() {
        System.out.println("Nama          : " + this.getNama());
        System.out.println("NIK           : " + this.getNIK());
        System.out.println("Jenis Kelamin : " + (this.getJenisKelamin() ? "Laki-laki" : "Perempuan"));
        System.out.println("Pendapatan    : " + (this.getGaji() + (this.getBonus() + (this.getBonus() * 0.3)) + (this.getTunjangan())+15)+"$");
        System.out.println("Bonus         : " + (this.getBonus() + (this.getBonus() * 0.3)+"$"));
        System.out.println("Gaji          : " + this.getGaji()+"$");
        System.out.println("Status        : " + this.getStatus());
        System.out.println("Lama Kerja    : " + this.getLamaKerja() + " hari");
     
        return "";
    }
}
