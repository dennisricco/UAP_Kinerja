/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hitungluas;

/**
 *
 * @author Ricco
 */
   class Persegi{ 
           void hitungLuasPersegi(int s){
           int luAs = s*s;
           System.out.print(luAs);
       }
   }
   
   class Segitiga{ 
           void hitungLuasSegitiga(int a,int t){
           int luAs = (a * t)/2;
           System.out.print(luAs);
       }
   }
   class Lingkaran{
       void hitungLuasLingkaran(double r){
           if(r==7){
                double luasLingkaran = 22/7 * r * r;
                int luAs = (int)luasLingkaran;
                System.out.print((double)luAs);
           }
           else{
                double luasLingkaran = 3.14 * r * r;
                int luAs = (int)luasLingkaran;
                System.out.print((double)luAs);
           }
       }
   }

