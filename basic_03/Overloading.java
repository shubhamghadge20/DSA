//method/function overloading are allow multipe function with same name but different parameter
package basic_03;

public class Overloading {
    public static void main(String[] args) {
        fun(1,2);

        fun("shubh");
        
    }

    public static void fun(int a,int b){
        System.out.println(a+b);

    }

    public static void fun(String name){
        System.out.println("the name is "+ name);

    }
    
}
