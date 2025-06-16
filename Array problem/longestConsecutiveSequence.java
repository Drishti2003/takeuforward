import java.util.Arrays;

public class longestConsecutiveSequence {
    public static void main(String[] args) {
        int arr[] = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(arr));
    }
    public static int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int longest=1,cnt=0,lastSmaller = Integer.MIN_VALUE;
        for(int i = 0 ;i<nums.length;i++){
            if(nums[i]-1 == lastSmaller){
                cnt++;
                lastSmaller = nums[i];
            }
            else if(lastSmaller!=nums[i]){
                cnt= 1;
                lastSmaller = nums[i];
            }
            longest = Math.max(longest, cnt);
        }
        return longest;
    }
}
