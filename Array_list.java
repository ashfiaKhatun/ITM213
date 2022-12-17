package array_list;

import java.util.ArrayList;

import java.util.Scanner;

public class Array_list {
    
    public static void main(String[]args){
        
        Scanner input = new Scanner(System.in);
        
        ArrayList<Integer> num = new ArrayList<Integer>();
        
        for (int i = 0; i < 5; i++) {
            
            num.add(input.nextInt());
            
        }
        
        for (int i = 0; i < 5; i++) {
            
            System.out.print(num.get(i)+" ");
            
        }
        
        
        
        
        
        
        
        
        /*while(true){
            
            num.add(input.nextInt());
            
            System.out.println(num);
        }*/
        
        /*System.out.println("Enter 5 numbers: ");
        
     num.add(input.nextInt());
     num.add(input.nextInt());
     num.add(input.nextInt());
     num.add(input.nextInt());
     num.add(input.nextInt());
     
        System.out.println(num);*/
        
        /*num.add(4);
     num.add(65);
     num.add(25);
     
        System.out.println(num);
     
     num.add(2);
     num.add(5);
     
        System.out.println(num);
        
        System.out.println(num.get(4));
        
        for (int i = 0; i < num.size(); i++) {
            
            System.out.println(num.get(i));
            
        }
        
        num.set(1, 95);
        
        System.out.println(num);*/
        
    
    
    }
    
    
}
