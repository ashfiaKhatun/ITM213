package basicTutorial;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        
        Scanner input= new Scanner(System.in);
       
        int X, Y;
        
        float total;
        
        X= input.nextInt();
        Y= input.nextInt();
        
        switch (X){
            
            case 1 :
                
                total= 4.00f*Y;
                System.out.printf("Total: R$ %.2f\n", total);
                
                break;
                
            case 2 :
                
                total= 4.50f*Y;
                System.out.printf("Total: R$ %.2f\n", total);
                
                break;
            
            case 3 :
                
                total= 5.00f*Y;
                System.out.printf("Total: R$ %.2f\n", total);
                
                break;
            
            case 4 :
                
                total= 2.00f*Y;
                System.out.printf("Total: R$ %.2f\n", total);
                
                break;
            
            case 5 :
                
                total= 1.5f*Y;
                System.out.printf("Total: R$ %.2f\n", total);
                
                break;
        }               
    }          
}

/* 1040 avg 3
Weighted Average= N*W/W

avg >= 7.0   approved

ave < 5.0   reproved

avg  >= 5.0 && avg <= 6.9    in exam



exam score= N5

new avg = (N5+ WA)/2

new avg >= 5.0    approved

new avg <= 4.9   reproved

final avg = new
*/