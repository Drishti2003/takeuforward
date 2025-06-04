import java.lang.reflect.Array;

public class rearrangeArrayElementsbySign {
    public static void main(String[] args) {
       int[] arr = {28,-41,22,-8,-37,46,35,-9,18,-6,19,-26,-37,-10,-9,15,14,31};
        arr = rearrangeArray(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    public static int[] rearrangeArray(int[] nums) {
        // int[] sortedArr = new int[nums.length];
        // int indexp=0,indexn=nums.length/2;
        // for(int i = 0 ;i<nums.length;i++){
        //     if(nums[i]>0){
        //         sortedArr[indexp++] = nums[i];
        //     }
        //     else if(nums[i]<0){
        //         sortedArr[indexn++] = nums[i];
        //     }
        // }
        // indexn=nums.length/2;
        // indexp=0;
        // for(int i = 0;i<nums.length;i++){
        //     if(i%2==0){
        //         nums[i] = sortedArr[indexp++];
        //     }
        //     else {
        //         nums[i] = sortedArr[indexn++];
        //     }
        // }
        // return nums;

        int indexp=0,indexn=1;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>0 && i%2==0){
                indexp+=2;
            }
            else if(nums[i]>0 && i%2!=0){
                int temp = nums[i];
                nums[i] = nums[indexp];
                nums[indexp]=temp;
                indexp+=2;
            }
            else if(nums[i]<0 && i%2!=0){
                indexn+=2;
            }
            else if(nums[i]<0&& i%2==0){
                int temp = nums[i];
                nums[i] = nums[indexn];
                nums[indexn] = temp;
                indexn+=2;
            }
        }
        return nums;
    }
}
