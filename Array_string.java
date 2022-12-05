package Array;

import java.util.Scanner;

public class Array_string {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String[] arr= new String[4];
        
        System.out.println("Enter "+arr.length+" names: ");
        
        for (int i = 0; i < arr.length; i++) {
            
            arr[i]= input.nextLine();
            
        }
        
        System.out.println();
        
        for (int i = 0; i < arr.length; i++) {
            
            System.out.println((i+1)+". "+arr[i]);
            
        }
        
    }
    
}
