public class subarraySumEqualsK {
    public static void main(String[] args) {
        int [] arr = {1,2,3};
        System.out.println(subarraySum(arr, 3));
        
    }
    public static int subarraySum(int[] nums, int k) {
        int cnt=0,sum=0;
        for(int i = 0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                // if(sum>k){
                //     sum=0;
                //     break;
                // }
                if( sum==k){
                    cnt++;
                    // sum=0;
                    // break;
                }
            }
            sum=0;
        }

        return cnt;
    }
}
