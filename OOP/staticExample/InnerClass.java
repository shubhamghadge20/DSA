
// inner classs is a class that is inside the class
//outside classes can not be static but inside class can be static

public class InnerClass {
 

    static class Test {
        String name;
        public Test(String name) {
            this.name = name;
        }
        @Override
        public String toString() {
            return name;
        }
    } 
    public static void main(String[] args) {
         Test a = new Test("Kunal");
        Test b = new Test("Rahul");

        System.out.println(a);
        System.out.println(b);

        
    }
    
}
