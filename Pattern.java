package basicTutorial;

import java.util.Scanner;

public class Pattern {
    
    public static void main(String[] args){
        
        Scanner input= new Scanner(System.in);
        
        System.out.print("Enter any number: ");
        
        int row, col, num;
        num= input.nextInt();
        
        /*pattern 7
        for(row=1; row<= num; row++){
            
            for(col=1; col<= row; col++){
                System.out.print("*");
            }
            
            System.out.println();
        }*/
        
        /*pattern 8
        for(row=1; row<= num; row++){
            
            for(col=1; col<= row; col++){
                System.out.print("#");
            }
            
            System.out.println();
        }*/
        
        /*pattern 1
        for(row=1; row<= num; row++){
            
            for(col=1; col<= row; col++){
                System.out.print(col);
            }
            
            System.out.println();
        }*/
        
        /*pattern 2
        for(row=1; row<= num; row++){
            
            for(col=1; col<= row; col++){
                System.out.print(row);
            }
            System.out.println();
        }*/
        
        /*pattern 9 mirror
        for(row=1; row<= num; row++){
            
            for(int space= num-1; space>= row; space--){
                System.out.print(" ");
            }
            
            for(col=1; col<= row; col++){
                System.out.print("*");
            }
            
            System.out.println();
        }
        */
        
        /*pattern 10 mirror
        for(row=1; row<= num; row++){
            
            for(int space= num-1; space>= row; space--){
                System.out.print(" ");
            }
            
            for(col=1; col<= row; col++){
                System.out.print("* ");
            }
            
            System.out.println();
        }*/
        
    }
    
}
