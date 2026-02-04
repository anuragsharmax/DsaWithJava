package Recursion;

import java.util.Arrays;

public class Subset {
    public static void main(String[]args){
//        allSubSet("","abc");
        String input="122";
        char[]arr=input.toCharArray();
        Arrays.sort(arr);
        subsetHandlingDuplicates("",arr,0);
    }
//    static void allSubSet(String ans,String que){
//        if(que.isEmpty()){
//            System.out.println(ans);
//            return;
//        }
//
//        char ch=que.charAt(0);
//        allSubSet(ans+ch,que.substring(1));
//        allSubSet(ans,que.substring(1));
//    }
    static void subsetHandlingDuplicates(String ans,char[]arr,int index){
        System.out.println(ans);
        for(int i=index;i<arr.length;i++){
            if(i>index&&arr[i]==arr[i-1]){
                continue;
            }else{
                subsetHandlingDuplicates(ans+arr[i],arr,i+1);
            }
        }
    }
}
