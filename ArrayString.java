package array_list;

import java.util.ArrayList;

import java.util.Scanner;

public class ArrayString {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
    
        ArrayList<String> name= new ArrayList<String>();
        
        name.add("Ashfia");
        name.add("Sohely");
        name.add("Shewly");
        name.add("Meem");
        name.add("Rakib");
        
        String user= input.nextLine();
        
        for (int i = 0; i < name.size(); i++) {
            
            if(user.equals(name.get(i))){
                
                System.out.println("Matched");
                
                break;
            }
            
            
            
        }
    
    
    
    
    }
    
}
