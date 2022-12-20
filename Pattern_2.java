package basicTutorial;

import java.util.Scanner;

public class Pattern_2 {
    
    public static void main(String[] args){
        
        
        Scanner input= new Scanner(System.in);
        
        int row, col, num;
        
        System.out.print("Enter a number: ");
        
        num= input.nextInt();
       
        /*pattern 3
        for(row=1; row<= num; row++){
            
            for(col=1; col<= row; col++){
                if(col%2==1){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            
            System.out.println();
        }*/
        
        /*pattern 4
        
        for(row=1; row<=num; row++){
            
            for(col=1; col<=row; col++){
                if(row%2==1){
                    System.out.print("1");   
                }
                else{
                    System.out.print("0");
                }
                
            }
            
            System.out.println();
        }*/
        
    }
    
}
        
        