package arrayList_2;

import java.util.ArrayList;

import java.util.Scanner;

public class Array_String {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        ArrayList<String> name = new ArrayList<String>();
        
        for (int i = 0; i < 4; i++) {
            
            name.add(input.next());
            
        }
        
        for (int i = 0; i < 4; i++) {
            
            System.out.println(name.get(i));
            
        }
        
    }
    
}
