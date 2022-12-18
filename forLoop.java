package basicTutorial;

import java.util.Scanner;

public class forLoop {
    public static void main(String[] args){
        
        Scanner input= new Scanner(System.in);
       
        int x, i, sum= 0;
        
        System.out.print("Enter any number: ");
        x= input.nextInt();
        
        for(i=1; i<=x; i++){
            
            if(i%2==0){
                
                System.out.println(i);
                sum+=i;
            }
            
        }
        System.out.println("Total= " +sum);
        
        
    }
    
}
