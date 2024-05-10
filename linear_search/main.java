package linear_search;

public class main {

    public static void main(String[] args) {
        int num[] = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target = 19;
        int ans = linearSearch(num, target);
        System.out.println(ans);
    }

    static int linearSearch(int arr[], int target) {
        // if arr length is 0 then does not exist for that below condition
        if (arr.length == 0) {
            return -1;
        }

        // run for loop
        for (int index = 0; index < arr.length; index++) {
            // check for element at every index if it is equal to the target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        
        
        return -1;
    }
}
