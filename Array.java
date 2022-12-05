package Array;

import java.util.Scanner;

public class Array {
    
    public static void main(String[] args) {
        
        Scanner input= new Scanner (System.in);
        
        System.out.println("Input the size of array: ");
        int n= input.nextInt();
        
        int sum=0;
        int[] arr= new int[n];
        
        System.out.println("Insert the numbers: ");
        
        for (int i = 0; i < n; i++) {
            
            arr[i]= input.nextInt();
            
        }
        
        System.out.println();
        for (int i = 0; i < n; i++) {
            
            sum += arr[i];
                        
        }
                 
        System.out.println("Total= "+sum);
        
        double avg= sum/arr.length;
        
        System.out.println("Average= "+avg);

        
        
        System.out.println("The size of the array is: "+arr.length);
        
    }
    
}
