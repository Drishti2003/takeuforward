package recursion;

public class Sum_of_first_n_terms {

    public static void main(String[] args) {
        Sum_of_first_n_terms s = new Sum_of_first_n_terms();
        System.out.println(s.sumOfSeries(5));
    }
    int sumOfSeries(int n) {
        // code here
        if(n<1)
        return 0;
        else 
        return n*n*n+sumOfSeries(n-1);

    }
}