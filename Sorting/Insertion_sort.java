package Sorting;

public class Insertion_sort {
    public static void main(String[] args) {
        int[] arr = { 7, 4, 1, 5, 3 };
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j >= 0; j--) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                } else
                    break;
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}