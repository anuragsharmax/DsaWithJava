/*
Case-3 : Entire matric is sorted means 
Time Complexity:
- O(log (R * C))
Space Complexity:
- O(1)
-Last element of a row < first element of next row

Approach:
- The matrix is fully sorted such that:
  - Each row is sorted.
  - The first element of each row is greater than the last element of the previous row.
- Treat the 2D matrix as a virtual 1D sorted array.
- Apply binary search on indices from 0 to (rows * columns - 1).
- Convert the 1D index to 2D using:
  row = index / numberOfColumns
  column = index % numberOfColumns

  When to use:
- Use only when the matrix is sorted as a whole, not just row-wise.
*/
import java.util.Arrays;

public class BinarySeaxg2dArraycase3 {
    public static void main(String[] args) {
        int[][]matrix={
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15}
        };
        int target=12;
        int[]ans=searchBinary(matrix, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] searchBinary(int[][]matrix,int target){
        int row=matrix.length;
        int column=matrix[0].length;
        int tEl=row*column;
        int start=0;
        int end=tEl-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            int r=mid/column;
            int c=mid%column;

            if(matrix[r][c]==target){
                return new int[]{r,c};
            }else if(matrix[r][c]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return new int[]{-1,-1};
    }
}
