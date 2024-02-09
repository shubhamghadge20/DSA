//ceiling greatest no >= target for given ceiling no is 34 here target no is 25 and celin is 34
package binary_search.Questions;

public class ceiling {
    public static void main(String[] args) {
        int arr [] = {2,12,23,34,56,66,78};
        int target = 25;
        int ans = ceiling_element(arr, target);
        System.out.println(ans);
        
    }

    static int ceiling_element(int arr [], int target){
        //but ig target no is greater than greatest no in the arry fo given e.g target is 78 for that given condition
        if (target > arr[arr.length -1]) {
            return -1;
        }
     int start =0;
     int end = arr.length -1;

     while (start <= end) {
        int mid = start + (end - start)/2;

        if (target <= arr[mid]) {
            end = mid -1;
        } 
        else if (target >= arr[mid]) {
            start = mid +1;

        }else{
                return mid;
            }
        }  
        return start; 
    }   
        
     
 }
    

