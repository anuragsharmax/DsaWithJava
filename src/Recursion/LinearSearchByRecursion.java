package Recursion;

public class LinearSearchByRecursion {
    static void main(String[] args) {
        int[] arr={2,8,4,5,6,3,1};
        int target=1;
        int index=0;
        System.out.println(foundAt(arr,target,index));
    }
    static int foundAt(int[] arr, int target,int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target) {
            return index;
        }

        return foundAt(arr,target,index+1);
    }
}
