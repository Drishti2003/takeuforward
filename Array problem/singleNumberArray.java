public class singleNumberArray {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 1 };
        System.out.println(singleNumber(arr));

    }

    public static int singleNumber(int[] nums) {
        int num = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            num = nums[i];
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == num) {
                    count++;
                }
            }
            if (count == 1) {
                break;
            } else {
                count = 0;
            }
        }
        return num;
    }
}
