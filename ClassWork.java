package basicTutorial;

import java.util.Scanner;

public class ClassWork {
    
    public static void main(String[] args){
        
        Scanner input= new Scanner(System.in);
        
        double A, B, result;
        
        System.out.print("Enter the first number: ");
        
        A= input.nextDouble();
        
        System.out.print("Enter the second number: ");
        
        B= input.nextDouble();
        
        System.out.print("Enter operator ('+', '-', '*', '/'): ");
        
        char operator= input.next().charAt(0);
        
        switch(operator){
            
            case '+' :
                result= A+B;
                
                System.out.printf("%.0f + %.0f = %.0f\n", A, B, result);
                
                break;
            
            case '-' :
                result= A-B;
                
                System.out.printf("%.0f - %.0f = %.0f\n", A, B, result);
                
                break;
            
            case '*' :
                result= A*B;
                
                System.out.printf("%.0f * %.0f = %.0f\n", A, B, result);
                
                break;
            
            case '/' :
                result= A/B;
                
                System.out.printf("%.0f / %.0f = %f\n", A, B, result);
                
                break;
                
            default :
                
                System.out.println("This is not an operator.");
                                                               
        }
    }
    
}
