/*
Cyclic Sort is an in-place sorting technique used when array elements belong to a known fixed range. Instead of comparing elements, each number is placed directly at its correct index using swaps.

Valid Ranges

0 to n-1 → correct index = value
1 to n → correct index = value - 1

Generic Cyclic Sort Code (0 to n-1)
static void cyclicSort(int[] arr){
    int i = 0;
    while(i < arr.length){
        int correct = arr[i];
        if(arr[i] >= 0 && arr[i] < arr.length && arr[i] != arr[correct]){
            swap(arr, i, correct);
        } else {
            i++;
        }
    }
}

Generic Cyclic Sort Code (1 to n)
static void cyclicSort(int[] arr){
    int i = 0;
    while(i < arr.length){
        int correct = arr[i] - 1;
        if(arr[i] >= 1 && arr[i] <= arr.length && arr[i] != arr[correct]){
            swap(arr, i, correct);
        } else {
            i++;
        }
    }
}

Missing Number (0 to n)
static int missingNumber(int[] arr){
    int i = 0;
    while(i < arr.length){
        int correct = arr[i];
        if(arr[i] < arr.length && arr[i] != arr[correct]){
            swap(arr, i, correct);
        } else {
            i++;
        }
    }
    for(int index = 0; index < arr.length; index++){
        if(arr[index] != index) return index;
    }
    return arr.length;
}

Find Duplicate Number
static int findDuplicate(int[] arr){
    int i = 0;
    while(i < arr.length){
        if(arr[i] != i + 1){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            } else {
                return arr[i];
            }
        } else {
            i++;
        }
    }
    return -1;
}

Properties

Stable: ❌ No
In-place: ✅ Yes
Adaptive: ❌ No

Complexity

Time Complexity: O(n)
Space Complexity: O(1)

Key Uses

Used in problems involving missing numbers, duplicates, smallest missing positive, and index-based sorting. Works only when numbers fall within a known continuous range.

Takeaway

Cyclic Sort is not a general sorting algorithm but a powerful linear-time technique for index-value mapping problems.*/
package SortingMethods;
import java.util.Arrays;
public class CyclicSort{
    public static void main(String[] args) {
        int[] arr={0,6,5,2,3,8,10,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        // for(int i=0;i<arr.length;i++){
        //     int correct=arr[i]-1;
        //     if(arr[i]!=arr[correct]){
        //         swap(arr,i,correct);
        //     }else{
        //         i++;
        //     }
        // }
        int i=0;
        while(i<arr.length){
            int currentValue=arr[i];
            if(currentValue>=0&&currentValue<arr.length&&arr[currentValue]!=arr[i]){
                swap(arr,currentValue,i);
            }else {
                i++;
            }
        }
    }
    static void swap(int[]arr,int first , int last){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
}