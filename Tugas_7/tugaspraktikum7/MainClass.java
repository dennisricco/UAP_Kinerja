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
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("\t\t Pegawai Tetap\n");
        System.out.println("=================================="+ "=================");
        PegawaiTetap pgt1 = new PegawaiTetap("Subur","351707384392",2000000);
        System.out.println(pgt1.toString()+"\n");
        PegawaiTetap pgt2 = new PegawaiTetap("Gavin Magnussen","3578234566767",3400000);
        System.out.println(pgt2.toString()+"\n");
        PegawaiTetap pgt3 = new PegawaiTetap("Stewart Henry","234543235676",2500000);
        System.out.println(pgt3.toString()+"\n");
        System.out.println("=================================="+ "=================");
        System.out.println("\t\t Pegawai Harian\n");
        System.out.println("=================================="+ "=================");
        PegawaiHarian pgh1 = new PegawaiHarian("Doni Agus Salim","3704568211",10000,60);
        System.out.println(pgh1.toString()+"\n");
        PegawaiHarian pgh2 = new PegawaiHarian("Roberto Bazry","351923848239",8500,80);
        System.out.println(pgh2.toString()+"\n");
        PegawaiHarian pgh3 = new PegawaiHarian("Toni Chihuahua","351707384392",6500,100);
        System.out.println(pgh3.toString()+"\n");
        System.out.println("=================================="+ "=================");
        System.out.println("\t\t Sales\n");
        System.out.println("=================================="+ "=================");
        Sales sl1 = new Sales("Iwan Setiawan","32134565677",45,15000);
        System.out.println(sl1.toString()+"\n");
        Sales sl2 = new Sales("Leonardo Brutu","357821050679",90,20000);
        System.out.println(sl2.toString()+"\n");
        Sales sl3 = new Sales("Aji Purnama","3513434562",50,25000);
        System.out.println(sl3.toString()+"\n");
        System.out.println("=================================="+ "=================");
    }
    
}
