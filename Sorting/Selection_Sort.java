package Sorting;

public class Selection_Sort {
    public static void main(String[] args) {
        int[] arr = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        Selection_Sort s = new Selection_Sort();
        s.selectionSort(arr);
        for (int i : arr) {
            System.out.println(arr[i]);
        }
    }

    void selectionSort(int[] arr) {
        // code here
        for (int i = 0; i <= arr.length - 2; i++) {
            int minimum = i, temp = 0;
            for (int j = i; j <= arr.length - 1; j++) {
                if (arr[j] < arr[minimum]) {
                    minimum = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[minimum];
            arr[minimum] = temp;
        }
    }
}
