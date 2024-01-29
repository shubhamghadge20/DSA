public class CountNums {
    public static void main(String[] args) {
        int n = 45536;

        int cont = 0;

        while (n>0) {
            int  rem = n%10;  //find the last no
            if (rem==5) {
                cont ++;
            }
            n= n / 10;
        }
        System.out.println(cont);
    }
    
}
