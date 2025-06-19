import java.util.ArrayList;
import java.util.List;

public class spiralMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
         List<Integer> arrOrder = new ArrayList<Integer>(arr.length*arr[0].length);
         arrOrder = spiralOrder(arr);
        
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> order = new ArrayList<Integer>(matrix.length*matrix[0].length);
        int top=0,left=0,right=matrix[0].length-1,bottom=matrix.length-1;
        while(top<=bottom && left<=right){
            for(int i = left;i<=right;i++){
                order.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                order.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i = right;i>=left;i--){
                    order.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i = bottom;i>=top;i--){
                    order.add(matrix[i][left]);
                }
                left++;
            }
        }
        return order;
    }
}
