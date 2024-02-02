package linear_search;

import Array.input;

public class EvenDigits {
    public static void main(String[] args) {
        int nums [] = {12,345,2,6,7896};
        
        System.out.println(findNumbers(nums));
        
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    //function to check given number contain even digit or not
    static boolean even(int num) {
        int numberOfDigits = digit(num);
       
        return numberOfDigits % 2 == 0;
    }
     // count number of digits in a number
     static int digit(int num){
        int count =0;
        while (num >0) {
            count++;
            num =num/10;
        }
        return count;
     }
    
}