package Recursion;

public class ReverseNum {
    public static void main(String[] args) {
//        int ans=rever(3456);
//        System.out.println(ans);
        reverf(5643);
    }

//    static int rever(int n) {
//        if(n%10==n){
//            return n;
//        }
//        return ((n%10)*10)+rever(n/10);
//    }
    static void reverf(int n){
        int digits=countDigit(n);
        System.out.println( helper(n,digits));
    }

    private static int countDigit(int n) {
        if(n==0){
            return 0;
        }
        return 1+countDigit(n/10);
    }

    static int helper(int n,int digits){
        if(n==0){
            return 0;
        }
        return (n%10)*(int)(Math.pow(10,digits-1))+ helper(n/10,digits-1);
    }
}
