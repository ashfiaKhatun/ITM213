package basicTutorial;

import java.util.Scanner;

public class WhileLoop {
    
    public static void main(String[] args){
        
        Scanner input= new Scanner(System.in);
        
        int r, digit, sum=0;
        
        System.out.print("Enter any digit: ");
        
        digit= input.nextInt();
        
        /*while(digit != 0){
            
            r= digit%10;
            
            System.out.println(r);
            
            digit /= 10;
            
            sum+= r;
          
        }
        System.out.println(sum);*/
        
        System.out.print("The reverse number is: ");
        
        while(digit != 0){
            r= digit%10;
            
            System.out.print(r);
            
            digit /=10;
        }
        System.out.println();
        
    }
    
}
