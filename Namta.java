package main;

import java.util.Scanner;

public class Namta {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num;
        
        System.out.print("Enter a number: ");
        
        num= input.nextInt();
        
        for (int i = 1; i <= num; i++) {
            
            for (int k = num; k >= i ; k--) {
                
                System.out.print(" ");
                
            }
            
            for (int j = 1; j <= i; j++) {
                
                System.out.print(j+" ");
                
            }
            System.out.println();
            
        }
    }
    
}
