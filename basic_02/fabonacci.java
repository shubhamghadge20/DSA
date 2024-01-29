import java.util.Scanner;

public class fabonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int cont = 2;

        while (cont<= n) {
            int temp =b;
            b = b+a;
            a = temp;
            cont++;
            
            sc.close();
        }
        System.out.println(b);
    }
    
}
