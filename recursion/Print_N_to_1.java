package recursion;

public class Print_N_to_1 {
    public static void main(String[] args) {
        Print_N_to_1 p = new Print_N_to_1();
        p.printNos(10);
    }
     void printNos(int N) {
        // code here
        if(N==1)
        return;
        System.out.print(N+" ");
        printNos(N-1);
    }
}
