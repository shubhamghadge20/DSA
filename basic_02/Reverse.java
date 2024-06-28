public class Reverse {
    public static void main(String[] args) {
        int num = 121;
        int orignalno = num;

        int ans =0;

        while (num>0) {
            int rem = num % 10;
            num = num/10;

            ans = ans *10+rem;
            
        }
        
        if (orignalno == ans) {
            System.out.println("Given no is palindrome");
        }else{
            System.out.println("is not palindrome");
        }
    }
    
}
