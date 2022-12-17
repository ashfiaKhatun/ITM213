package arrayList_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_List {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> num = new ArrayList<Integer>();
        
        Scanner input = new Scanner(System.in);
        
        /*num.add(20);
        num.add(12);
        num.add(124);
        num.add(2);*/
        
        /*num.add(input.nextInt());
        num.add(input.nextInt());
        num.add(input.nextInt());*/
        
        System.out.print("Enter three numbers: ");
        
        for (int i = 0; i < 3; i++) {
            
            num.add(input.nextInt());
            
        }
        
        /*while(true){
            
            num.add(input.nextInt());
            
            System.out.println("Size: "+num.size());
            
            System.out.println("Values are: "+num);
        }*/
        
        System.out.println("Size: "+num.size());
        
        System.out.println("Third value is "+num.get(2));
        
        System.out.println("Values are: "+num);
        
        for (int i = 0; i < num.size(); i++) {
            
            System.out.println(num.get(i));
        }
        
    }
    
}
