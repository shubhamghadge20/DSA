package basic_03;
public class scope {
    public static void main(String[] args) {
        int a = 20;
        int b = 12;
        //System.out.println(num);
        //above we can not access num here becausebnm is part of demo function we cant access it outside the function
        //so this called as function scope
    }

    public static void demo(){
        int num = 23;
    }
}
