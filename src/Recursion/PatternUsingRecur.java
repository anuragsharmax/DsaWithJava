/*
    *

 */

package Recursion;

public class PatternUsingRecur {
    static void main(String[] args) {
        print2(0,0,5);
    }
    static void print(int r,int c){
        if(r==0){
            return;
        }
        if(r>c){
            System.out.print('*');
            print(r,c+1);
        }else{
            System.out.println();
            print(r-1,0);
        }
    }
    static void print2(int r,int c,int n){
        if(r==n){
            return;
        }
        if(c<=r){
            System.out.print('*');
            print2(r,c+1,n);
        }else{
            System.out.println();
            print2(r+1,0,n);
        }
    }
    static void triangle(int b,int h,int n){
        if(b<n){
            return;
        }

    }
}
