public class sortColorsArray {
    public static void main(String[] args) {
        int[] arr = { 2, 0, 2, 1, 1, 0 };
        sortColors(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void sortColors(int[] nums) {
        int countOne = 0, countTwo = 0, countZero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                countZero++;
            } else if (nums[i] == 1) {
                countOne++;
            } else {
                countTwo++;
            }
        }
        int index = 0;
        while (countZero > 0) {
            nums[index] = 0;
            index++;
            countZero--;
        }
        while (countOne > 0) {
            nums[index] = 1;
            index++;
            countOne--;
        }
        while (countTwo > 0) {
            nums[index] = 2;
            index++;
            countTwo--;
        }
    }
}
