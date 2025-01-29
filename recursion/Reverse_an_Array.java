package recursion;

import java.io.*;

public class Reverse_an_Array {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());

        while (tc-- > 0) {
            String str[] = br.readLine().split(" ");
            int arr[] = new int[str.length];

            for (int i = 0; i < str.length; i++)
                arr[i] = Integer.parseInt(str[i]);
            Solution obj = new Solution();

            obj.reverseArray(arr);
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            System.out.println("~");
        }
    }
}

class Solution {
    public int i = 0,n=0, t = 0;

    public void reverseArray(int arr[]) {
        // code here
        if (n==0) {
            n = arr.length;
        }
        if (i >= n/2)
            return;
        t = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = t;
        i++;
        reverseArray(arr);
    }
}
