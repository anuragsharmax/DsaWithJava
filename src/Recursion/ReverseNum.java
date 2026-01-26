package Recursion;

public class ReverseNum {
    public static void main(String[] args) {
        int ans=rever(3456);
        System.out.println(ans);
    }

    static int rever(int n) {
        if(n%10==n){
            return n;
        }
        return ((n%10)*10)+rever(n/10);
    }
}
