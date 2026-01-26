package Recursion;

public class ProductOfDigits {
    public static void main(String[]args) {
        int ans=product(462);
        System.out.println(ans);
    }
    static int sum(int n){
        if(n==0){
            return 0;
        }

        return n%10+sum(n/10);
    }
    static int product(int n){
        if(n>0&&n<10){
            return n;
        }
        return (n%10)*product(n/10);
    }
}

