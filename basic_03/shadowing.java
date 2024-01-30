package basic_03;

public class shadowing {
   static int x = 90;//this will shadowed at line 8
    public static void main(String[] args) {
        System.out.println(x);//90
        int x;//the class variable at lie 4 is shadowed by this
        x =40;
        System.out.println(x);//40

        fun();

        
    } 

   static void fun(){
       System.out.println(x);
    }
    
}
