package Sorting;

public class QuickSort {
    public static void main(String[] args){
        int[] arr = { 9, 4, 4, 8, 7, 5, 6};
        quickSort(arr, 0, arr.length - 1);
        for (int i : arr) {
        System.out.println(i);
        }
    }

    static void quickSort(int arr[], int low, int high) {
        int partitionIndex;

        if (low < high) {
            partitionIndex = partition(arr, low, high);
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    static int partition(int arr[], int low, int high) {
        int pivot = arr[low];
        int i = low + 1;
        int j = high;
        int temp;

        do {
            while (arr[i] <= pivot && i < high) {
                i++;
            }
            while (arr[j] > pivot && j> low) {
                j--;
            }
            if (i < j) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        } while (i < j);

        temp = arr[j];
        arr[j] = arr[low];
        arr[low] = temp;
        return j;
    }

}
