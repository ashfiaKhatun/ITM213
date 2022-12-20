package Function;

import java.util.Scanner;

public class Function {
    
    static double sumation(double x, double y){
        
        double sum= x+y;
        return sum;
        
    }
    
    static double substraction(double x, double y){
        
        double sub= x-y;
        return sub;
        
    }
    static double multiplication(double x, double y){
        
        double multi= x*y;
        return multi;
        
    }
    static double division(double x, double y){
        
        double div= x/y;
        return div;
        
    }
    
    
        
        
    
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double a= input.nextInt();
        double b= input.nextInt();
        
        double sum= sumation(a, b);
        double sub= substraction(a, b);
        double multi= multiplication(a, b);
        double div= division(a, b);
        
        
        
        System.out.println("Sum= "+sum+", sub= "+sub+", multi= "+multi+", div= "+div);


         
    }
    
}
