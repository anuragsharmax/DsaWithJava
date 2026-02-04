package Recursion;

public class Permutation {
    static void main(String[] args) {
        System.out.println(countPermutations("abcd",""));
        arrange("abcd","");
    }
    static void arrange(String up,String p){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        for(int i=0;i<up.length();i++){
            char currChar=up.charAt(i);
            arrange(up.substring(0,i)+up.substring(i+1),p+currChar);
        }
    }
    static int countPermutations(String up,String p){
        if(up.isEmpty()){
            return 1;
        }
        int count=0;
        for(int i=0;i<up.length();i++){
            char currChar=up.charAt(i);
            count=count+countPermutations(up.substring(0,i)+up.substring(i+1),p+currChar);
        }
        return count;
    }
}
