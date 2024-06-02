// File: Test.java
 class Test {

    // Implementing a method
    public void method() {
        System.out.println("Method 1");
    }
}

// File: GFG.java
 class GFG extends Test {

    // Overriding the parent method
    @Override
    public void method() {
        System.out.println("Method 2");
    }
}

// File: RuntimeDemo.java
public class runtime {
    public static void main(String[] args) {
        Test test = new GFG();
        test.method();  // This will print "Method 2" due to method overriding
    }
}
