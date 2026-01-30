package Recursion;
import java.util.*;
public class multipleOcurrence {
    static void main(String[] args) {
        int[]arr={2,4,5,6,7,8,7,7,9};
        int target=7;
        int index=0;
        ArrayList<Integer> list= new ArrayList<>();
        findAll(arr,target,index,list);
        System.out.println(list);
    }

    static void findAll(int[]arr,int target,int index,ArrayList<Integer> list){

        if(index==arr.length){
            return ;
        }
        if(arr[index]==target){
            list.add(index);
        }
        findAll(arr,target,index+1,list);
    }

}
