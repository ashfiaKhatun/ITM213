package main;

import java.util.Scanner;

public class Cube {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num, product;
        
        num= input.nextInt();
        
        for (int i = 1; i <= num; i++) {
            
            product= i*i*i;
            
            System.out.println("Number is : "+i+" and the cube of "+i+" is : "+product);
            
        }
        
    }
    
}
