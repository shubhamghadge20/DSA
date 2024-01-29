import java.net.Socket;
import java.util.Scanner;

public class nested_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empId = sc.nextInt();
        String department = sc.nextLine();
         
        switch (empId) {
            case 1:
                System.out.println("Shubham Ghadge");
                break;

                case 2:
                System.out.println("James Bond");
                break;

                case 3:
                  System.out.println("Emp no 3");
                switch(department){
                    case "IT":
                    System.out.println("it department");
                    break;

                    case "ENTC":
                    System.out.println("Entc department");
                    break;

                    default:
                    System.out.println("no dep");
                }

            default:
                System.out.println("Enter correct employee");
        }
        }
    
}
