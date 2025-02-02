package Hashing;

public class Frequency_of_the_Most_Frequent_Element {
    public static void main(String[] args) {
        Frequency_of_the_Most_Frequent_Element f = new Frequency_of_the_Most_Frequent_Element();
        int[] arr = { 9930, 9923, 9983, 9997, 9934, 9952, 9945, 9914, 9985, 9982, 9970, 9932, 9985, 9902, 9975, 9990,
                9922, 9990, 9994, 9937, 9996, 9964, 9943, 9963, 9911, 9925, 9935, 9945, 9933, 9916, 9930, 9938, 10000,
                9916, 9911, 9959, 9957, 9907, 9913, 9916, 9993, 9930, 9975, 9924, 9988, 9923, 9910, 9925, 9977, 9981,
                9927, 9930, 9927, 9925, 9923, 9904, 9928, 9928, 9986, 9903, 9985, 9954, 9938, 9911, 9952, 9974, 9926,
                9920, 9972, 9983, 9973, 9917, 9995, 9973, 9977, 9947, 9936, 9975, 9954, 9932, 9964, 9972, 9935, 9946,
                9966 };
        System.out.println(f.maxFrequency(arr, 3056));
    }

    public int maxFrequency(int[] nums, int k) {
        int temp = 0, count = 1, kcopy = k;
        ;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                temp = nums[i];
                nums[i] = nums[i + 1];
                nums[i + 1] = temp;
                i = -1;
            }
        }
        temp = 0;
        for (int j = 0; j <= nums.length - 1; j++) {
            for (int i = j + 1; i <= nums.length - 1; i++) {
                // if (count > (nums.length - 1) - i) {
                // return count;
                // }
                if (nums[j] - nums[i] <= k) {
                    k -= nums[j] - nums[i];
                    count++;
                }
            }
            if (count > temp) {
                temp = count;
            }
            if (count > (nums.length - 1) - j) {
                return temp;
            }
            count = 1;
            k = kcopy;
        }
        return temp;
    }
}