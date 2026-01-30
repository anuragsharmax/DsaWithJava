/*
Bubble Sort is a simple comparison-based sorting algorithm that works by repeatedly comparing
adjacent elements and swapping them if they are in the wrong order.
After each pass, the largest element moves to its correct position at the end of the array.

Properties
-Stable: Yes (relative order of equal elements is preserved)
-In-place: Yes (uses constant extra space)
-Adaptive: Yes (optimized version stops early if array is already sorted)

Complexity
-Best Case: O(n) (already sorted, with swap optimization)
-Average Case: O(n²)
-Worst Case: O(n²)
-Space Complexity: O(1)

Key Notes
-Number of passes ≤ n - 1
-After each pass, one largest element is fixed
-Mainly used for learning and interview basics, not production systems
-Bubble Sort is easy to understand but inefficient for large datasets.
*/
package SortingMethods;
import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        int[]arr={6,3,8,9,1,5};
        int[]sortedArray=sortArray(arr);
        System.out.println(Arrays.toString(sortedArray));
    }
    static int[] sortArray(int[]arr){
//        boolean swapped;
        for(int i=0;i<arr.length-1;i++){
//            swapped=false;
            for(int j=0;j<arr.length-1-i;j++){
                // Using i in (arr.length - 1 - i) because it represents the number of passes completed
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    //swapped=true;
                }
            }//if (!swapped) break;
        }
        return arr;
    }
}
