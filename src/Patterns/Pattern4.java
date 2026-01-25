/*

1
1 2
1 2 3
1 2 3 4
1 2 3 4 5

*/
package Patterns;
public class Pattern4 {
    public static void main(String[] args) {
    patt(5);
    }
    static void patt(int n){
        for(int row=1;row<=n;row++){
            for(int column=1;column<=row;column++){
                System.out.print(column);
                
            }System.out.println();
        }
    }
}
