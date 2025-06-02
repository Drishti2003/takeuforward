public class majorityElementArray {
    public static void main(String[] args) {
    int[] arr = {8,8,7,7,7};
    System.out.println(majorityElement(arr));
    }
    public static int majorityElement(int[] nums) {
        int majority = nums.length/2,count=0;
        boolean flag=true;
        for(int i = 0;i<nums.length && flag==true;i++){
            for(int j = 0;j<nums.length;j++){
                if(nums[j]==nums[i]){
                    count++;
                }
            }
            if(count>majority){
                majority = nums[i];
                flag =false;
                break;
            }
            count = 0;
        }
        return majority;
    }
}
