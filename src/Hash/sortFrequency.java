package Hash;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class sortFrequency {
    public static void main(String[] args) {
        int[] arr={2,2,2,5,6,7,3,2,4,4,};
        HashMap<Integer,Integer>freq=new HashMap<>();
        HashMap<Integer,Integer>index=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(freq.containsKey(arr[i])){
                freq.put(arr[i],freq.get(arr[i])+1);
            }else{
                freq.put(arr[i],1);
                index.put(arr[i],i);
            }
        }
        Integer[]nums=new Integer[arr.length];
        for(int i=0;i<arr.length;i++){
            nums[i]=arr[i];
        }
        Arrays.sort(nums,new Comparator<Integer>()
        {
            public int compare(Integer a ,Integer b){
                if(freq.get(a)!=freq.get(b)){
                    return freq.get(b)-freq.get(a);
                }
                return index.get(b)-index.get(a);
            }
        });
        for(int n:nums){
            System.out.print(n+" ");
        }

    }
}
