package main;

import java.util.Scanner;

public class Method {
    
    static void summation(int a, int b){
        
        int sum= a+b;
        System.out.println(sum);        
    }
    
    public static void main(String[]args){
        
        Scanner input = new Scanner(System.in);
        
        int a= input.nextInt();
        int b= input.nextInt();
        
        summation(a,b);
        
    }
    
}


