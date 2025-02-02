package Sorting;

public class Insertion_sort {
    public static void main(String[] args) {
        Insertion_sort i = new Insertion_sort();
        int[] arr = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        i.insertionSort(arr);
        for (int j : arr) {
            System.out.println(arr[j]);
        }
    }

    public void insertionSort(int arr[]) {
        // code here
        int temp;
        for (int i = 0; i <= arr.length - 1; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
    }
}
