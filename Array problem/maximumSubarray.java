public class maximumSubarray {
    public static void main(String[] args) {
        // int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
                int[] arr = {-1};

        System.out.println(maxSubArray(arr));
    }
    public static int maxSubArray(int[] nums) {
        int arrSum=0,maxSum=Integer.MIN_VALUE;
        for(int i = 0 ; i<nums.length ;i++){
            arrSum += nums[i];

            if(arrSum>maxSum){
                maxSum=arrSum;
            }

            if(arrSum<0){
                
                arrSum=0;
            }
        }
        return maxSum;
    }    
}
