package basic_03;

//method

import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        main();
    }
    static void main(){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter first no");
         int a = sc.nextInt();

         System.out.println("Enter second no");
         int b= sc.nextInt();

         int c = a + b;
         System.out.println("The sum is " +c);

         sc.close();
    
         //return type name(argument){
            //body
            //return statement;
        // }
    }
    
}
