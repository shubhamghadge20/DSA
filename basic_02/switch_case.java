import java.util.Scanner;

public class switch_case {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.nextLine();

        switch (fruit) {
            case ("Mango"):
                 System.out.println("king of fruit");
                break;

                case("apple"):
                System.out.println("A sweet fruit");
                break;

                case("Orange"):
                System.out.println("Round fruit");
                break;

                case("graps"):
                System.out.println("small fruit");
                break;
        
            default:
                break;
        }
    }
    
}
