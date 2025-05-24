package Sorting;

// public class Selection_Sort {
//     public static void main(String[] args) {
//         int[] arr = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
//         Selection_Sort s = new Selection_Sort();
//         s.selectionSort(arr);
//         for (int i : arr) {
//             System.out.println(arr[i]);
//         }
//     }

//     void selectionSort(int[] arr) {
//         // code here
//         for (int i = 0; i <= arr.length - 2; i++) {
//             int minimum = i, temp = 0;
//             for (int j = i; j <= arr.length - 1; j++) {
//                 if (arr[j] < arr[minimum]) {
//                     minimum = j;
//                 }
//             }
//             temp = arr[i];
//             arr[i] = arr[minimum];
//             arr[minimum] = temp;
//         }
//     }
// }

public class Selection_Sort {
    public static void main(String[] args) {
        int[] arr = { 8, 0, 7, 1, 3 };
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }

            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}