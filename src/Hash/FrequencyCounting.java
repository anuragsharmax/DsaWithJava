package Hash;

import java.util.HashMap;

public class FrequencyCounting {
    public static void main(String[] args) {
        int[]arr={2,3,4,5,6,3,4,9};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:arr){
            if(!map.containsKey(num)){
                map.put(num,1);
            }else{
                map.put(num,map.get(num)+1);
            }
        }
        System.out.println(map);
    }
}
