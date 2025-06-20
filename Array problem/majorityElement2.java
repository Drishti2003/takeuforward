import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class majorityElement2 {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 3 };
        List<Integer> numArr = new ArrayList<Integer>(arr.length);
        numArr = majorityElement(arr);
        System.out.println(numArr);
    }

    public static List<Integer> majorityElement(int[] nums) {
        int el1=Integer.MIN_VALUE,el2=Integer.MIN_VALUE,cnt1 = 0,cnt2 = 0;
        for(int i = 0;i<nums.length;i++){
            if(cnt1==0 && el2!=nums[i]){
                cnt1++;
                el1=nums[i];
            }
            else if(cnt2==0 && el1!=nums[i]){
                cnt2++;
                el2=nums[i];
            }
            else if(el1==nums[i]){
                cnt1++;
            }
            else if(el2==nums[i]){
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }
        List<Integer> arr = new ArrayList<>();
        cnt1=0;
        cnt2=0;
        int mini = (int)(nums.length/3)+1;
        for(int i=0;i<nums.length;i++){
        if(el1==nums[i]){
            cnt1++;
        }
        else if(el2==nums[i]){
            cnt2++;
        }
        }
        if(cnt1>=mini){
            arr.add(el1);
        }
        if(cnt2>=mini){
            arr.add(el2);
        }
        return arr;
    }
}
