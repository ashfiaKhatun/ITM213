package Array;

import java.util.Scanner;

public class Array_3 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int[] serial= new int[3];
        String[] name= new String[3];
        String[] gender= new String[3];
        
        for (int i = 0; i < 3; i++) {
            
            serial[i]= input.nextInt();
            name[i]= input.next();
            gender[i]= input.next();
            
        }
        
        System.out.println();
           
        for (int i = 0; i < 3; i++) {
            
            System.out.println(serial[i]+" "+name[i]+" "+gender[i]);
            
        }
    
    }
}
