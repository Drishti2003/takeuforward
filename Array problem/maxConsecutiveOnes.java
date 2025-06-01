public class maxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = { 1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, maxCount = 0, i =0;
        while(i<nums.length){
            if(nums[i]==1){
                count++;
                maxCount = Math.max(maxCount, count);
            }
            else{
                    count = 0;
            }
            i++;
        }
        return count>maxCount?count:maxCount;
    }
}