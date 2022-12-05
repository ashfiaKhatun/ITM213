package Array;

public class ArraySort {
    
    public static void main(String[]args){
        
        //int[] arr= new int[6];
        
        int[] arr= {65, 99, 100, 4, 3, 6};
        
        for (int i = 0; i < arr.length; i++) {
            
            for (int j = i+1; j < arr.length; j++) {
                
                int temp= 0;
                
                if(arr[i]> arr[j]){
                    
                    temp= arr[i];
                    arr[i]= arr[j];
                    arr[j]= temp;
                    
                }
                
            }
            
        }
        
        for (int i = 0; i < arr.length; i++) {
            
            System.out.print(arr[i]+" ");
            
        }
        System.out.println();
        
        
        
        
    }
    
}
