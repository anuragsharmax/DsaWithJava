/*
    *
   **
  ***
 ****
*****

*/
public class Pattern6 {
    public static void main(String[] args) {
        patt(5);  
    } 
    static void patt(int n){
        for(int row=1;row<=n;row++){
            for(int space=0;space<=n-row;space++){
                System.out.print(" ");
            }
            for (int stars = 1; stars <=row; stars++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
