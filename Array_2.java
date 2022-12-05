package Array;

import java.util.Scanner;

public class Array_2 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); 
        
        int[] arr= new int[3];
        
        System.out.println("Enter the numbers: ");
        
        for (int i = 0; i < 3; i++) {
            arr[i]= input.nextInt();
        }
        
        for (int i = 0; i < 3; i++) {
            if(arr[i]>arr[0]){
                arr[0]=arr[i]; //arr[0]= 4; arr[1]= 6; 
            }
            
        }
        System.out.println("The maximum number is: "+arr[0]);
        
    }
    
}