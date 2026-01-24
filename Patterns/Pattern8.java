/*
    1
   212
  32123
 4321234
543212345

*/

public class Pattern8 {
    public static void main(String[] args) {
        patt(5);
    }
    static void patt(int n){
        for(int row=0;row<n;row++){
            int space=n-row-1;
            int num=2*row+1;
            for (int s = 0; s<space ; s++) {
                System.out.print(" ");
            }
            for(int column=row+1;column>=1;column--){
                System.out.print(column);
            }
            for(int column2=2;column2<=row+1;column2++){
                System.out.print(column2);
            }
            System.out.println();        }
    }
}
