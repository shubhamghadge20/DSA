package linear_search;

public class searchInstring {

    public static void main(String[] args) {
        String name = "shubham";
        char target = 'u';
        System.out.println(search(name, target));
    }

    static Boolean search(String str , char target){

        if (str.length() == 0) {
            return false;
            
        }

        for(int i =0; i<str.length();i++){
                if (target == str.charAt(i)) {
                    return true;
                    
                }
        }

       return false;
    }
    
}
