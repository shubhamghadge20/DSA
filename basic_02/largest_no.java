
import java.util.Scanner;

public class largest_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max =0;

        if (a>b){
            max = a; 
        }else{
            b =max;
        }
        if (c>max){
            max =c;
        }
        System.out.println(max);
    }
    
}
