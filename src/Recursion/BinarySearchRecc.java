package Recursion;

public class BinarySearchRecc {
    public static void main(String[]args){
        int[] arr={2,3,5,7,8,9};
        int target=8;
        System.out.println(search(arr,target,0,arr.length-1));
    }
    static int search(int[] arr,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(target==arr[mid]){
            return mid;
        }
        else if(target>arr[mid]){
            return search(arr,target,mid+1,end);
        }
        else{
            return search(arr,target,start,mid-1);
        }
    }
}
