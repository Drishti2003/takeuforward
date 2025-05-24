package Sorting;

import java.lang.reflect.Array;

// public class Bubble_Sort {
//     public static void main(String[] args) {
//         int[] arr = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
//         bubbleSort(arr);
//         for (int i : arr) {
//             System.out.println(arr[i]);
//         }
//     }

//     public static void bubbleSort(int arr[]) {
//         // code here
//         int temp;
//         for (int i = arr.length - 1; i >= 1; i--) {
//             int didSwap = 0;
//             for (int j = 0; j < i; j++) {
//                 if (arr[j] > arr[j + 1]) {
//                     temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                     didSwap++;
//                 }
//             }
//             if (didSwap == 0) {
//                 break;
//             }
//         }
//     }
// }

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            System.out.print("Pass : " + (i + 1) + "\t");
            for (int x : arr) {
                System.out.print(x + ", ");
            }
            System.out.println();
        }

    }
}