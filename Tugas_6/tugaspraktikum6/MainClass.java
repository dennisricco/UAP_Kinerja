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
public class MainClass {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manusia man1 = new Manusia("Aku", "3923842934",true,true);
        System.out.println(man1.toString());
        Manusia man2 = new Manusia("Dwiwoi", "380331311008",true,false);
        System.out.println(man2.toString());
        Manusia man3 = new Manusia("Oura", "4320194174",true,true);
        System.out.println(man3.toString());
        
        MahasiswaFilkom mhs1 = new MahasiswaFilkom("Ni Nengah Putri", "351923848239", false,false, "205150601111018",3.70);
        System.out.println(mhs1.toString());
        MahasiswaFilkom mhs2 = new MahasiswaFilkom("I Komang Dwi A", "357821050679", true,false, "21456749765223300",3.70);
        System.out.println(mhs2.toString());
        MahasiswaFilkom mhs3 = new MahasiswaFilkom("Sebastian Sugianto", "351923848239", true,true, "193456789122345",3.70);
        System.out.println(mhs3.toString());
        
        Pekerja pekerja1 = new Pekerja(7, 22,"215456432213", "Amrozi", "3704568211", true,true);
        System.out.println(pekerja1.toString());
        Pekerja pekerja2 = new Pekerja(9, 20,"195432344112", "Imam Samudra", "3513434562", true,true);
        System.out.println(pekerja2.toString());
        Pekerja pekerja3 = new Pekerja(18, 22,"302127654332", "Aman Abdurrahman", "32134565677", true,false);
        System.out.println(pekerja3.toString());
        
        Manajer manajer1 = new Manajer(12,22,"204837283728", "Sukiyem", "351707384392",false, false, 1500);
        System.out.println(manajer1.toString());
        Manajer manajer2 = new Manajer(12, 15,"312566677888", "Amarzoni", "3578234566767",true, false, 2400);
        System.out.println(manajer2.toString());
        Manajer manajer3 = new Manajer(6, 25,"444235677789", "Vegetta", "234543235676",true, true, 800);
        System.out.println(manajer3.toString());
        
        System.out.println("=========TOTAL YANG TERDAFTAR==========");
        System.out.println("=======================================");
        System.out.println("Jumlah Manusia  : "+ (man1.cetak+man2.cetak+man3.cetak)+"\nJumlah Mahasiswa: "+(mhs1.cetak+mhs2.cetak+mhs3.cetak)+"\nJumlah Pekerja  : " + (pekerja1.cetak+pekerja2.cetak+pekerja3.cetak)+"\nJumlah Manager  : " + (manajer1.cetak+manajer2.cetak+manajer3.cetak));

        
    }
    
}
