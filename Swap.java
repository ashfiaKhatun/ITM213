package arrayList_2;

import java.util.Scanner;

import java.util.ArrayList;

public class Swap {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        ArrayList<Integer> num = new ArrayList<Integer>();
        
        System.out.println("Enter two numbers: ");
        
        num.add(input.nextInt());
        num.add(input.nextInt());
        
        for (int i = 1; i >= 0; i--) {
            
            System.out.println(num.get(i));
            
        }
    }
    
}
