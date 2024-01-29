import java.util.Scanner;

public class sum {
    public static void  main(String[] args){
        System.out.println("Enter the first no");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Enter the second no");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("/nthe sum is" +sum);
        sc.close();
    }
    
}
