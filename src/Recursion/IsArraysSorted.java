package Recursion;

public class IsArraysSorted {
    static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,8,7};
        System.out.println(isArraysSorted(arr,0));
    }
    static boolean isArraysSorted(int[] arr,int index){
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1]&&isArraysSorted(arr,index+1);
    }
}
