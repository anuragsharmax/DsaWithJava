/* Case1- Each row is sorted.
- Works even for unequal length rows.
 T.c. = O(R log C)
Approach:
- Each row in the matrix is individually sorted.
 - Since there is no guarantee of column-wise ordering, we cannot eliminate rows or columns globally.
- We iterate through each row and apply standard binary search on that row.
*/
package BinarySearch;
import java.util.*;
public class BinarySearch2dArrayCase1 {
    public static void main(String[] args) {
        int[][] matrix={
        {2,3,4,5,6,7,8},
        {9,10,23,45},
        {12,22,33,47,53,61}};
        int target=47;
        int[] ans=searchMatrix(matrix,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] searchMatrix(int[][]matrix,int target){
        for(int row=0;row<matrix.length;row++){
            int start=0;
            int end=matrix[row].length-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(matrix[row][mid]==target){
                    return new int[]{row,mid};
                }else if(matrix[row][mid]>target){
                    end=mid-1;
                }else if(matrix[row][mid]<target){
                    start=mid+1;
                }
            }
        }return new int[]{-1,-1};
    }
}
