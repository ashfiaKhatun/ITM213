package Function;

import java.util.Scanner;

public class compoundInterest {
    
    static void compound(int invest, double r, int year, int compound){
        
        double futureValue;
                
        for (int i = 1; i <= year; i++) {
            
        futureValue= (invest*(Math.pow((1+((r/100)/compound)),(i*compound))));
            
        System.out.println(i+" "+futureValue);
        
        }
        
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int invest= input.nextInt();
        int r= input.nextInt();
        int year= input.nextInt();
        int compound= input.nextInt();
        
        compound(invest, r, year, compound);
        
        
    }
    
    
    
}
