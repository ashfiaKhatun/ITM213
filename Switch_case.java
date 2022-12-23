package main;

import java.util.Scanner;

public class Switch_case {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int day;
        
        System.out.print("Enter any number between 1 to 7: ");
        
        day= input.nextInt();
        
        switch(day){
            
            case 1:
                System.out.println("Monday");
                
                break;
            case 2:
                System.out.println("Tuesday");
                
                break;
            case 3:
                System.out.println("Wednesday");
                
                break;
            case 4:
                System.out.println("Thursday");
                
                break;
            case 5:
                System.out.println("Fryday");
                
                break;
            case 6:
                System.out.println("Saturday");
                
                break;
            case 7:
                System.out.println("Sunday");
                
                break;
                
        default:
        System.out.println("Error");
        }
        
    }
    
}
