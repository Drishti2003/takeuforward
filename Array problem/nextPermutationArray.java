import java.lang.reflect.Array;
import java.util.Arrays;

public class nextPermutationArray {
    public static void main(String[] args) {
        int arr[] = { 1,2,3 };
        nextPermutation(arr);
        for (int i : arr) {
            System.out.print(i);
        }

    }

    public static void nextPermutation(int[] nums) {
        int index = -1;
        for (int i = nums.length-2; i >=0 - 1; i--) {
            if (nums[i] < nums[i + 1]) {
                index = i;
                break;
            }
        }
        if(index==-1){
            Arrays.sort(nums);
            return ;
        }
        for (int i = nums.length - 1; i > index; i--) {
            if (nums[i] > nums[index]) {
                int temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
                break;
            }
        }
        Arrays.sort(nums, index + 1, nums.length);
    }
}
