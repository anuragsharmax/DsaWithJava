package Recursion;

public class RecursionLevel1 {
    public static void main(String[]args){
//        int f=fact(5);
//        System.out.println(f);
        num(9);
    }
    static void num(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        num(n-1);
    }
    static void numRev(int n){
        if(n==0){
            return;
        }
        numRev(n-1);
        System.out.println(n);
    }
    static int fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }
}
