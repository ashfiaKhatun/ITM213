package basicTutorial;

import java.util.Scanner;

public class Multiplication {
    
    public static void main(String[] args){
        
        Scanner input= new Scanner(System.in);
        
        int num, i, j;
        
        System.out.print("Enter any number: ");
        
        num= input.nextInt();
        
        for(i= 1; i<=num; i++){
            
            System.out.println();
            
            for(j=1; j<=10; j++){
                System.out.println(i+ " X " +j+ " = " +i*j);
            }
        }
        
        
    }
    
}
