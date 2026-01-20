/*Case-2 each row and column is sorted
Important Assumption:
- The matrix must be rectangular (all rows have the same number of columns).
- Column-wise ordering must be valid for all rows.
T.c.-O(R + C)
Approach-
- The matrix is sorted row-wise (left to right) and column-wise (top to bottom).
- Start from the top-right corner of the matrix.
- If the current element is greater than the target, move left.
- If the current element is smaller than the target, move down.
- Each step eliminates one row or one column.
*/
import java.util.Arrays;

public class BinarySearch2dArraycase2 {
    public static void main(String[] args) {
        int[][]matrix={
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15}
        };
        int target=5;
        int[] ans=searchMatrix(matrix,target);
        System.out.println(Arrays.toString(ans));
    }
    static  int[] searchMatrix(int[][]matrix,int target){
        int row=0;
        int column=matrix[0].length-1;
        while(row<matrix.length&&column>=0){
            if(matrix[row][column]==target){
                return new int[]{row,column};
            }else if (matrix[row][column]>target){
                column--;
            }else{
                row++;
            }
        }
        return new int[]{-1,-1};
    }
}
