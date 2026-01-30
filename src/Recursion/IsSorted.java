package Recursion;

public class IsSorted {
    static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int start=0;
        int second=start+1;
        System.out.println(isSorted(arr,start,second));
    }
    static boolean isSorted(int[] arr,int start,int second){
        if (arr[start]>arr[second]) {
            return false;
        }
        return isSorted(arr,start+1,second+1);

    }
}
