/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isseldechecker;

import java.util.Scanner;

/**
 *
 * @author Ricco
 */
public class IsSeldeChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        
        if(isSelde(number)){
            System.out.println(number + " adalah selde.");
        }
        else{
             System.out.println(number + " bukan selde.");
        }
    }
    private static boolean isSelde(int number){
        int s = 0;
        int original = number;
        while(number != 0){
            int i = number % 10;
            s = (s * 10) + i;
            number = number/10;
                    }        
            
            if(original == s){
             return true;
            }
            return false;
                    }
    }
    

