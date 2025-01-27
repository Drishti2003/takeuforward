package recursion;

public class Print_GFG_n_times {
    public static void main(String[] args) {
        Print_GFG_n_times p = new Print_GFG_n_times();
        p.printGfg(5);
    }
     public int i=1;
    void printGfg(int N) {
        // code here
        if(i>N)
        return;
        System.out.print("GFG"+" ");
        i++;
        printGfg(N);
    }
}
