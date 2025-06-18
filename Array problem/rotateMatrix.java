import java.util.Arrays;

public class rotateMatrix {
    public static void main(String[] args) {
    int[][] arr = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
    rotate(arr);
        
    }   
    public static void rotate(int[][] matrix) {
        for(int i = 0;i<matrix.length-1;i++){
            for(int j = i+1;j<matrix.length;j++){
                if(i!=j){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }    
        for(int i = 0 ; i<matrix.length;i++){
            for(int j = 0 ;j<matrix[i].length/2;j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[i][matrix.length-1-j] ;
                matrix[i][matrix.length-1-j] = temp;
            }
        }
    } 
}
