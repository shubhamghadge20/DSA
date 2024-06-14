/**
 * RevserString
 */
public class RevserString {

    public static void main(String[] args) {
        char[] s ="hello".toCharArray();

        int start =0;
        int end = s.length-1;

        while (start <= end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;

            start++;
            end--;
            
        }
        System.out.println(s);
    }
}