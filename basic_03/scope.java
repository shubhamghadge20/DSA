package basic_03;
public class scope {
    public static void main(String[] args) { 
        int a = 20;
        int b = 12;
        //System.out.println(num);
        //above we can not access num here because num is part of demo function we cant access it outside the function
        //so this called as function scope
        //below type called block scope
        {
            // int a =20; alresdy initialized  outside the block in same method, you can mot initialized in  block
            a =78; //you can update the value
            int c=99;
            //value initialized in block, will remain in the block
        }
        //anything intialized outside the block can access inside the block but anything initialized inside the block can't access outside the block
        //System.out.println(c); yo can not acces outside the block
    }

    public static void demo(){
        int num = 23;
        //this type is functional block
    }
}
