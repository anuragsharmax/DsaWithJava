/*
Quick Sort (Divide and Conquer)

Idea:
- Pick one element as pivot.
- Place pivot at its correct sorted position.
- Move all elements smaller than pivot to left side.
- Move all elements greater than pivot to right side.
- Recursively apply the same steps to left and right subarrays.

Properties:
- In-place sorting algorithm (no extra array used).
- Not stable (relative order of equal elements may change).
- Average & Best Time Complexity: O(n log n)
- Worst Time Complexity: O(n^2) (poor pivot selection).
- Space Complexity: O(log n) on average (recursion stack).

Used when:
- In-place sorting is required.
- Average performance is more important than worst case.
*/

package SortingMethods;

import java.util.Arrays;

public class QuickSort {
    static void main(String[] args) {
        int[]arr={8,5,6,7,7,7,4,2,3,1};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[]arr,int low,int high){
        if(low>=high){
            return;
        }
        int pivotIndex=partition(arr,low,high);
        sort(arr,low,pivotIndex-1);
        sort(arr,pivotIndex+1,high);
    }
    static int partition(int[] arr,int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr,i+1,high);
        return i+1;
    }
    static void swap(int []arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
