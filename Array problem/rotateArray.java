import java.util.Arrays;

public class rotateArray {
    public static void main(String[] args) {
        // int[] arr = { 1,2,3,4,5,6,7};
        int[] arr = {-1};
        // rotateArrayByOne(arr);
        rotate(arr, 2);
        for (int i : arr) {
            System.out.println(i+" ");
        }
    }

    public static void rotateArrayByOne(int[] nums) {
        int temp;
        for (int i = 0; i < nums.length - 1; i++) {
            temp = nums[i];
            nums[i] = nums[i + 1];
            nums[i + 1] = temp;
        }
    }
    public static void rotate(int[] nums, int k) {
        if(k%nums.length==0){
            return;
        }
        int[] temp =  new int[k];
        for(int i= 0;i<k;i++){
            temp[i] = nums[(nums.length-k)+i];
        }
        for(int i = nums.length-1;i>=k;i--){
            nums[i] = nums[i-k];
        }
        for(int i = 0;i<k;i++){
            nums[i] = temp[i];
        }
    }
}
