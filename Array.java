package main;

import java.util.Scanner;

public class Array {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] age= new int[3];
        String[] name= new String[3];
        
        for (int i = 0; i < age.length; i++) {
            
            name[i]= input.next();
            
            age[i]= input.nextInt();
            
        }
      
        
        for (int i = 0; i < age.length; i++) {
            
            System.out.println(name[i]+" "+age[i]);
            
            }
            
        }
}

    

