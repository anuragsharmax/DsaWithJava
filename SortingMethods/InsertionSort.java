/*
Insertion Sort is a simple comparison-based sorting algorithm that builds the sorted array one element at a time.
It works by taking an element from the unsorted part and inserting it into its correct position in the already sorted part.

The left portion of the array is always kept sorted, similar to how we sort playing cards in our hand.

#How It Works (Simple)
-Assume the first element is already sorted
-Pick the next element (key)
-Shift all larger elements in the sorted part one position to the right
-Insert the key into the correct position

#Properties
-Stable: ✅ Yes (relative order of equal elements is preserved)
-In-place: ✅ Yes (uses constant extra space)
-Adaptive: ✅ Yes (runs faster on nearly sorted arrays)

#Complexity
-Best Case: O(n) (already sorted array)
-Average Case: O(n²)
-Worst Case: O(n²)
-Space Complexity: O(1)

#Key Notes
-Uses shifting, not swapping
-Very efficient for small datasets
-Performs well on nearly sorted arrays
-Used internally in advanced algorithms like TimSort

Insertion Sort is simple, stable, and efficient for small or nearly sorted inputs, but inefficient for large datasets.
*/

import java.util.*;
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={5,6,4,3,2,1};
        int[] sortedArr=sortArr(arr);
        System.out.println(Arrays.toString(sortedArr));

    }
    static int[] sortArr(int[]arr){
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0&&arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }arr[j+1]=key;
        }
        return arr;
    }
}
