

public class BinarySearch {

    public static void main(String[] args) {
        int arr [] ={2,3,4,5,6,15,22,45,67,89};
        int target = 22;
        int ans = binarysearch(arr, target);
        System.out.println(ans);
        
    }
    //retuen index
    //return -1 if it does not exist
    static int binarysearch(int arr [], int target){
        int start =0;
        int end = arr.length - 1;

        while (start <= end) {
            //find middle element
            // int mid = start + end/2; might be possible that start+end can exceed
            int mid = start + (end -start)/2;

            if (target < arr[mid]) {
                end = mid -1;
            }else  if (target > arr[mid]) {
                start = mid+1;
            }else{
                return mid;
            }
            
        }
        return -1;
    }
    
}
