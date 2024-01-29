
public class typecasting {
      //type casting - converting the value of single datatype into another datatype
      //implict((automatic)) and explicit are two of typecasting
    public static void main(String [] args){
        int num = (int) (45.5);
        System.out.println(num);

       
        int a = 257;
        byte b = (byte) (a);
        System.out.println(b);

        byte c = 42;
        char d = 'a';
        short s = 1024;
        int i =50000;
        float f = 5.64f;
        double m = 0.1234;
        double result = (f *c) + (i / d) - (m -s);
        System.out.println(result);


        }
    
}
