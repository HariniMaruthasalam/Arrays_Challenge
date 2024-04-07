import java.util.* ;
import java.io.*; 

public class Solution {

    static int largestElement(int[] arr, int n) {
        // Write your code here.
        int max =arr[0];
        for(int i=1; i<n; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        Solution obj = new Solution();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int result = largestElement(arr, n);
        System.out.println(result);
    }
}
