package Hash;
import java.util.*;
public class TwoSum {
    public static void main(String[] args) {
        int[]arr={2,3,4,5,6,7,9,8};
        int target=12;
        allIndex(arr,target);
    }
    public static void onePairIndex(int[]arr,int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(target-arr[i])){
                System.out.println("pairs is found at index ("+map.get(target-arr[i])+","+i+")");
                return;
            }else{
                map.put(arr[i],i);
            }
        }
    }
    public static void allIndex(int[]arr,int target){
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int curr=arr[i];
            int comp=target-arr[i];
            if(map.containsKey(comp)){
                ArrayList<Integer>list=map.get(comp);
                for(int j:list){
                    System.out.println("pairs ("+j+","+i+")");
                }
            }
            if(!map.containsKey(curr)){
                map.put(curr,new ArrayList<>());
            }
            map.get(curr).add(i);
        }
    }
}
