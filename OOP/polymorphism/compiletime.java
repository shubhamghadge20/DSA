// compile time polymorphism is also known as static plymorphism it is achived by method overloading
//method overloading means same method name but diffrent type,arguments and return

class mathoperation{

      // Method to add two integers
    int add(int a,int b){
      return a+b;
    }
    
      // Method to add three integers
    int add(int a,int b,int c){
        return a+b+c;
    }
    
     // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }
}



public class compiletime {
    public static void main(String[] args) {
        mathoperation m =new mathoperation();
        System.out.println(m.add(5, 10)); 
        System.out.println(m.add(5, 10, 15)); 
        System.out.println(m.add(5.5, 10.5));
    }   
}
