/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suratkaisar1;

import java.util.Scanner;
/**
 *
 * @author Ricco
 */
public class SuratKaisar1 {
    public static StringBuffer encrypt(String text, int s){
        StringBuffer result = new StringBuffer();
        
        int i = 0; 
        while(i < text.length()){
            if (Character.isUpperCase(text.charAt(i)))
            {
                int ascii = (text.charAt(i) + s);
                if(ascii > 90) ascii -= 26;
                result.append((char) ascii);
            }
            else if(Character.isLowerCase(text.charAt(i)))
            {
                int ascii = (text.charAt(i) + s);
                if(ascii > 122) ascii -= 26;
                result.append((char) ascii);
            } else {
                result.append(text.charAt(i));
            }
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        int num = input.nextInt() % 26;
        System.out.println(encrypt(text, num));
    }
}