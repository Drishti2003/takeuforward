import java.sql.Array;
import java.util.Stack;

public class mergeSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,0,0,0};
        int[] arr2 = {2,5,6};
        merge(arr1, arr1.length - arr2.length, arr2, arr2.length);
        for (int i : arr1) {
            System.out.print(i + " ");
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // if (n == 0) {
        //     return;
        // }
        // Stack<Integer> s = new Stack<Integer>();
        // int i = 0, j = 0;
        // while (i < m  && j < n) {
        //     if (nums1[i] < nums2[j]) {
        //         s.push(nums1[i++]);
        //         // i++;
        //     } else if (nums2[j] < nums1[i]) {
        //         s.push(nums2[j++]);
        //         // j++;
        //     } else if (nums1[i] == nums2[j]) {
        //         s.push(nums1[i++]);
        //         s.push(nums2[j++]);
        //         // i++;
        //         // j++;
        //     }
        // }
        // while(i<m){
        //     s.push(nums1[i++]);
        //     // i++;
        // }
        // while(j<n){
        //     s.push(nums2[j++]);
        // }
        // for (int x = nums1.length - 1; x >= 0; x--) {
        //     nums1[x] = (Integer) s.pop();
        // }
                int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    }
}
