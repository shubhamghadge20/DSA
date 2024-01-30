package basic_03;

import java.util.Arrays;
//variable lenght argument
public class VarArgs {
    public static void main(String[] args) {
        fun(1,2,3,4,5);
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
    
}
