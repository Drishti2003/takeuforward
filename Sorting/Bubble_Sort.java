package Sorting;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        bubbleSort(arr);
        for (int i : arr) {
            System.out.println(arr[i]);
        }
    }

    public static void bubbleSort(int arr[]) {
        // code here
        int temp;
        for (int i = arr.length - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
