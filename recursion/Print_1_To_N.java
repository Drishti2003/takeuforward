package recursion;

public class Print_1_To_N {
    public static void main(String[] args) {
        Print_1_To_N obj = new Print_1_To_N();
        obj.printNos(10);
    }

    //  int i=1;
    // public void printNos(int n) {
    //     // Your code here
    //     System.out.print(i+" ");
    //     if(n==i)
    //     return;
    //     i++;
    //     printNos(n);
        
    // }

    public void printNos(int n){
        if(n<1)
        return;
        printNos(n-1);
        System.out.println(n);
    }
}
