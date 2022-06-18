/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitungluas;

import java.util.Scanner;
/**
 *
 * @author Ricco
 */
public class HitungLuas {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Persegi persegi0 = new Persegi();
    Segitiga segitiga0 = new Segitiga();
    Lingkaran lingkaran0 = new Lingkaran();
    
    int a,s,r,t;
    int menuPilihan = input.nextInt();
    
        if(menuPilihan==1){    
            s = input.nextInt();
            persegi0.hitungLuasPersegi(s);
            }
        else if(menuPilihan==2){
            a = input.nextInt();
            t = input.nextInt();
            segitiga0.hitungLuasSegitiga(a,t);
            }
        else if(menuPilihan==3){
            r = input.nextInt();
            lingkaran0.hitungLuasLingkaran(r);
        }
        else{
            System.out.print("Input yang anda masukan tidak sesuai");
        }
        
    }
    
}
