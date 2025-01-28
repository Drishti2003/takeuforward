package recursion;

import java.util.ArrayList;

public class Factorials_Less_than_or_Equal_to_n {
    public static void main(String[] args) {
        System.out.println(factorialNumbers(10));
    }

    // static ArrayList<Long> factorialNumbers(long n) {
    // ArrayList<Long> factorialList = new ArrayList<Long>();
    // // code here
    // long factorial=1;
    // for(int i=1;i<=n;i++){
    // factorial*=i;
    // if(factorial>n)
    // break;
    // factorialList.add(factorial);
    // }
    // return factorialList;
    // }

    static ArrayList<Long> factorialList = new ArrayList<>();
    static long factorial = 1, baseN = 0;

    static ArrayList<Long> factorialNumbers(long n) {
        if (n >= baseN) {
            baseN = n;
        }
        if (factorial > n) {
            return factorialList;
        }
        factorialNumbers(n - 1);
        factorial *= n;
        if (factorial <= baseN)
            factorialList.add(factorial);
        return factorialList;
    }
}
