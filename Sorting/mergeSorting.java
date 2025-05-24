package Sorting;

public class mergeSorting {

    public static void main(String[] args) {
        int[] arr = { 8528, 9208, 808};
        mergeSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    static void mergeSort(int arr[], int l, int h) {
        // code here
        int mid;
        if (l < h) {
            mid = (l + h) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, h);
            merge(arr, l, mid, h);
        }
    }

    static void merge(int[] arr, int l, int mid, int h) {
        int i = l, j = mid + 1, k = l;
        int[] b = new int[h + 1];
        while (i <= mid  && j <= h) {
            if (arr[i] < arr[j]) {
                b[k] = arr[i];
                i++;
            } else {
                b[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            b[k] = arr[i];
            k++;
            i++;
        }
        while (j <= h) {
            b[k] = arr[j];
            k++;
            j++;
        }
        for (int x= l;x<=h;x++) {
            arr[x]=b[x];
        }
    }
}