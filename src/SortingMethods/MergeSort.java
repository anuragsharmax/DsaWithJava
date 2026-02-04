/*
Merge Sort (Divide and Conquer)

Idea:
- Divide the array into two halves until each subarray has one element.
- Merge the sorted halves back together in sorted order.
- Uses a temporary array to merge two sorted subarrays.

Properties:
- Stable sorting algorithm (preserves relative order of equal elements).
- Not in-place (requires extra space for merging).
- Time Complexity (Best, Average, Worst): O(n log n)
- Space Complexity: O(n) (temporary array).

Used when:
- Stable sorting is required.
- Guaranteed O(n log n) performance is needed.
- Sorting linked lists or large datasets.
*/

package SortingMethods;
import java.util.*;

public class MergeSort {
    public static void main(String[] args) {
        int[]arr={4,2,6,8,3,5,1};
        mergesort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void mergesort(int[] arr, int left, int right) {
        if(left>=right){
            return;
        }
        int mid = left + (right - left) / 2;
        mergesort(arr, left, mid);
        mergesort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    static void merge(int[] arr, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= right) {
            if (arr[i] > arr[j]) {
                temp[k++] = arr[j++];
            } else {
                temp[k++] = arr[i++];
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= right) {
            temp[k++] = arr[j++];
        }
        for(int b=0;b<temp.length;b++){
            arr[left+b]=temp[b];
        }
    }
}