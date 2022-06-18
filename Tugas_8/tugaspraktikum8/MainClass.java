/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspraktikum8;

import java.util.Scanner;
/**
 *
 * @author Ricco
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Magician mage = new Magician(10, 60, 100);
        Healer support = new Healer(10, 10, 70);
        Warrior fighter = new Warrior(30, 40, 100);
        Titan monster = new Titan(0, 45, 200);
 
        System.out.println("Selamat datang di game Defense FILKOM !");
        System.out.print("Silahkan masukkan nama player : ");
        String nama = input.nextLine();
        int choose = 0;
        do{
            try{
                System.out.println("Silahkan pilih karakter yang anda inginkan :");
                String[] Role = {"1. Magician", "2. Healer", "3. Warrior"};
                for(String Hero : Role) {
                    System.out.println(Hero);
                }
                choose = input.nextInt();
                
                if (choose < 1 || choose > 3) throw new NumberFormatException();
                }catch (Exception e){
                if(e instanceof NumberFormatException) {
                    System.out.println("Silahkan masukan angka 1 - 3");
                }
                else{
                    System.err.println("Silahkan masukkan angka !!!");
                    input.next();
                }
             }
        }while (choose == 0);
            System.out.println("Selamat datang, " + nama);
 
        switch(choose){
            case 1 :
                int i = 1;
                mage.info();
                while(mage.getHp() != 0 && monster.getHp() != 0){
                    System.out.println("==============" + " TURN " + i + " ==============");
                    
                    if(mage.attack()){
                        monster.receiveDamage(mage.getAttack());
                    }
                    if(monster.attack()){
                        mage.receiveDamage(monster.getAttack()); 
                    }
                    System.out.println("Enemy's HP\t: " + monster.getHp());
                    System.out.println(nama +"'s HP\t: " + mage.getHp());
                    i++;
                }
                System.out.println("====================================");
                if(monster.getHp() == 0) {
                System.out.println(nama + " menang\n");
                }
                if(mage.getHp() == 0) {
                System.out.println("Titan menang\n");
                }
                System.out.println("============== PLAYER ==============");
                mage.info();
                System.out.println();
                System.out.println("============== MUSUH ==============");
                monster.info();
            break;
 
            case 2 :
                int j = 1;
                support.info();
                while(support.getHp() != 0 && monster.getHp() != 0){
                System.out.println("==============" + " TURN " + j + " ==============");
                if(j % 2 == 0) {
                support.Heal();
                }
                if(support.attack()){
                monster.receiveDamage(support.getAttack());
                }
                if(monster.attack()){
                support.receiveDamage(monster.getAttack()); 
                }
                System.out.println("Enemy's HP\t: " + monster.getHp());
                System.out.println(nama +"'s HP\t: " + support.getHp());
                j++;
                }
                System.out.println("====================================");
                if(monster.getHp() == 0) System.out.println(nama + " menang\n");
                if(support.getHp() == 0) System.out.println("Titan menang\n");
                System.out.println("============== PLAYER ==============");
                support.info();
                System.out.println();
                System.out.println("============== MUSUH ==============");
                monster.info();
            break;
 
            case 3 :
                int k = 1;
                fighter.info();
                while(fighter.getHp() != 0 && monster.getHp() != 0){
                System.out.println("==============" + " TURN " + k + " ==============");
                if(fighter.attack()){
                monster.receiveDamage(fighter.getAttack());
                }
                if(monster.attack()){
                fighter.receiveDamage(monster.getAttack()); 

                }
                System.out.println("Enemy's HP\t: " + monster.getHp());
                System.out.println(nama +"'s HP\t: " + fighter.getHp());
                k++;
                }
                System.out.println("====================================");
                if(monster.getHp() == 0) System.out.println(nama + " menang\n");
                if(fighter.getHp() == 0) System.out.println("Titan menang\n");
                System.out.println("============== PLAYER ==============");
                fighter.info();
                System.out.println();
                System.out.println("============== MUSUH ==============");
                monster.info();
                break;
            }
    }
    
}
