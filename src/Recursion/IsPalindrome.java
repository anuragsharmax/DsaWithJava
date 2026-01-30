package Recursion;

public class IsPalindrome {
    static void main(String[] args) {
        int n=12321;
         int reversedNum=rev(n);
        System.out.println(reversedNum==n);

    }
//    static boolean isPalindrome(int n){
//        return false;
//    }
    static int  helper(int n, int digits){
        if(n==0){
            return 0;
        }
        return n%10 * (int)Math.pow(10,digits-1) + helper(n/10,digits-1);
    }
    static int rev(int n){
        int digits=(int)Math.log10(n)+1;
        return( helper(n,digits));
    }
}
