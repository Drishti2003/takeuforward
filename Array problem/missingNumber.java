public class missingNumber {
    public static void main(String[] args) {
        int[] arr = {3,0,1};
        System.out.println(missingNumber(arr));
    }
        public static int missingNumber(int[] nums) {
        int count = -1;
        for(int i = 0 ; i<=nums.length;i++){
            for(int j = 0 ; j<nums.length;j++){
                if(nums[j] == i){
                    count++;
                    break;
                }
            }
            if(count != i){
            count = i;
            break;}
        }
        return count;
    }
}
