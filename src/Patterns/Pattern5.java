/*

*
**
***
****
*****
****
***
**
*

*/
package Patterns;
public class Pattern5{
    public static void main(String[] args) {
        patt(5);
    }
    static void patt(int n){
        for(int row=1;row<2*n;row++){
            int stars;
            if(row<=n){
                stars=row;
            }else{
                stars=2*n-row;
            }
            for(int column=1;column<=stars;column++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}