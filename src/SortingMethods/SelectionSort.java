/*
Selection Sort is a comparison-based sorting algorithm that works by repeatedly selecting the maximum element from the unsorted part of the array and placing it at its correct position at the end.
With each pass, the sorted portion grows from the right side, while the unsorted portion shrinks.

Properties
-Stable:  No (swapping non-adjacent elements can change relative order)
-In-place:  Yes (uses constant extra space)
-Adaptive:  No (always scans the entire unsorted part)

Complexity
-Best Case: O(n²)
-Average Case: O(n²)
-Worst Case: O(n²)
-Space Complexity: O(1)

Key Notes
-Exactly one swap per pass
-Fewer swaps compared to Bubble Sort
-Sorted region grows from the right
-Useful when swap operations are costly
-Mainly used for learning and interview fundamentals

-Selection Sort minimizes swaps but not comparisons,
 making it simple yet inefficient for large datasets.
*/
package SortingMethods;
import java.util.Arrays;
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={6,5,4,3,2,1};
        int[] sorArr=sortArr(arr);
        System.out.println(Arrays.toString(sorArr));
    }
    static int[] sortArr(int[]arr){

        for(int i=arr.length-1;i>0;i--){
            int maxIndex=0;
            for(int j=1;j<=i;j++){
                if(arr[j]>arr[maxIndex]){
                    maxIndex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[maxIndex];
            arr[maxIndex]=temp;
        }
        return arr;
    }
}
