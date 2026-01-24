/*

*
* *
* * *
* * * *
* * * * * 

*/

public class Pattern1 {
    public static void main(String[] args) {
        pat(5);
    }
    static void pat(int n){
        for(int row=1;row<=n;row++){
            for(int column =1;column<=row;column++){
                System.out.print("*");
            }System.out.println();
        }
    }
}
