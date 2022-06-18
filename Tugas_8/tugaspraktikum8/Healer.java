/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspraktikum8;

/**
 *
 * @author Ricco
 */
public class Healer extends Character {
    private int defense;
    private int attack;
    private int HP;
    
    Healer(int defense, int attack, int HP){
        super(defense, attack, HP);
        this.defense = defense;
        this.attack = attack;
        this.HP = HP;
    }
    public boolean attack(){
        double Hit = Math.random();
            if(Hit < 0.85) {
            return true;
    }
    return false;
    }
    public void Heal(){
        System.out.println("Menggunakan skill heal");
    }
    public int getHp(){
        return this.HP + 25;
    }
    public void setHp(int HP){
    System.out.println(this.HP);
    }
}
