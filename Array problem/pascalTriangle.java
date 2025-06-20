import java.util.ArrayList;
import java.util.List;

public class pascalTriangle {

    public static void main(String[] args) {
        List<List<Integer>> pascalTri = new ArrayList<List<Integer>>();
        pascalTri = generate(5);
        
    }
    public static List<List<Integer>> generate(int numRows) {
    List<List<Integer>> pascalTr = new ArrayList<List<Integer>>();
    for(int i = 1 ;i<=numRows;i++){
        List<Integer> arr = new ArrayList<Integer>(i);            
        int res = 1;
        arr.add(res);
        for(int j = 1;j<i;j++){
            res = res*(i-j);
            res= res/j;
            arr.add(res);
        }
        pascalTr.add(arr);
    }
    return pascalTr;
    }
}