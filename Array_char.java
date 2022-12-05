package Array;

import java.util.Scanner;

public class Array_char {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        char[] letter= new char[3];
        
        for (int i = 0; i < letter.length; i++) {
            
            letter[i]= input.nextLine().charAt(0); //Ashfia Khatun
        }
        System.out.println();
        for (int i = 0; i < letter.length; i++) {
            
            System.out.println(letter[i]);
            
        }
        
    }
    
}
