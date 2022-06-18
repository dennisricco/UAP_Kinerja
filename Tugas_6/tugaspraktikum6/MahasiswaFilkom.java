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
public class MahasiswaFilkom extends Manusia{
    private String NIM;
    private double IPK;
    
    public MahasiswaFilkom(String nama, String NIK, boolean jenisKelamin, boolean menikah, String NIM, double IPK) {
        super(nama, NIK, jenisKelamin, menikah);
        this.NIM = NIM;
        this.IPK = IPK;
    }    
    public void setIPK(double IPK) {
        this.IPK = IPK;
    }
    public void setNIM(String NIM) {
        this.NIM = NIM;
    }
    public double getIPK() {
        return IPK;
    }
    public String getNIM() {
        return NIM;
    }
    public String getStatus() {
        String angkatan = "";
        String jurusan = "";
        angkatan = "20" + NIM.substring(0, 2);

        switch (NIM.substring(6, 7)) {
            case "2":
                jurusan = "Teknik Meniup Gelembung";
                break;
            case "3":
                jurusan = "Teknik Berburu Ubur Ubur";
                break;
            case "4":
                jurusan = "Sistem Perhamburgeran";
                break;
            case "6":
                jurusan = "Pendidikan Chum Bucket";
                break;
            case "7":
                jurusan = "Teknologi Telepon Kerang";
                break;
        }
        return jurusan + "," + angkatan;
    }
    public double getBeasiswa() {
        double beasiswa;
        if (IPK >= 3.0 && IPK <= 3.5) {
            beasiswa = 50;
        } else if (IPK > 3.5 && IPK <= 4) {
            beasiswa = 75;
        } else {
            beasiswa = 0;
        }
        return beasiswa;
    }
    @Override
    public String toString() {
        System.out.println("Nama          : " + this.getNama());
        System.out.println("NIK           : " + this.getNIK());
        System.out.println("Jenis Kelamin : " + (this.getJenisKelamin() ? "Laki-laki" : "Perempuan"));
        System.out.println("Pendapatan    : " +(this.getBeasiswa() + this.getTunjangan())+"$");
        System.out.println("IPK           : " + this.getIPK());
        System.out.println("NIM           : " + this.getNIM());
        System.out.println("Status        : " + this.getStatus());
        return "";
    }
}
