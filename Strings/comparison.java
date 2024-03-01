package Strings;

public class comparison {
    public static void main(String[] args) {
        // below string is in string pool and  a=>b=> ram
        String a ="Ram";
        String b ="Ram";
        System.out.println(a==b);
      
        //below string is in heap and  name1=> Raj ,name2 => Raj
        String name1 = new String("Raj");
        String name2 = new String("Raj");
        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));
        //string methods = equals()
        //below we get output false becase we create new object 
    }
    
}
