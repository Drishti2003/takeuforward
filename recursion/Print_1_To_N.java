package recursion;

public class Print_1_To_N {
    public static void main(String[] args) {
        Print_1_To_N obj = new Print_1_To_N();
        obj.printNos(10);
    }

    public int i = 1;

    public void printNos(int n) {
        // Your code here
        if (n == i)
        return;
        System.out.print(i + " ");
        printNos(i++);

    }
}
