package Recursion;

public class BinarySearchByRecursion {
    static void main(String[] args) {
        int [] arr={2,3,4,5,6,7,8};
        int target=6;
        int start=0;
        int end=arr.length-1;
        System.out.println(foundAt(arr,target,start,end));
    }
    static int foundAt(int[]arr,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;

        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]>target){
            return foundAt(arr,target,start,mid-1);
        }
        return foundAt(arr,target,mid+1,end);
    }
}

