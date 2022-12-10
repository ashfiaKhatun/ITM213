package basicTutorial;

import java.util.Scanner;

public class Condition {
    
    public static void main(String[] args){
        
        Scanner input= new Scanner(System.in);
       
        System.out.print("Enter any Number: ");
        
        int num= input.nextInt();
        
        if(num>0){
            System.out.println("The number is possitive");
        }
        
        else if(num<0){
            System.out.println("The number is negative");
        }
        else
            System.out.println("The number is Zero");
    }
    
}
