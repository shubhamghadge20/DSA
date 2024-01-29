package basic_03;

import java.util.Arrays;

public class change_no {

    public static void main(String[] args) {
        int arr [] = {12,3,4,56,7};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void change(int arr []){
        arr [0] =34;
    }
    
}
