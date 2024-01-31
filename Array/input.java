package Array;

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        
        //input using  for loop
        for(int i=0; i<arr.length;i++){
            arr[i] =sc.nextInt();
        }

    
        for(int i=0; i<arr.length; i++){
         System.out.println(arr[i]);   
        }
    }
    
}
