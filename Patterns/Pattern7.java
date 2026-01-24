/*
    *  
   * *
  * * *
 * * * *
* * * * *
 * * * *
  * * *
   * *
    *  

*/

public class Pattern7 {
    public static void main(String[] args) {
        patt(5);
    }   
    static void patt(int n){
        for(int row=1;row<2*n;row++){
            int stars;
            int space;
            if(row<=n){
                stars=row;
                space=n-row;
            }else{
                stars=2*n-row;
                space=row-n;
            }

            for(int s=0;s<space;s++){
                System.out.print(" ");
            }
            for(int st=0;st<stars;st++){
                System.out.print("* ");
            }
            
            
            System.out.println();
            
        }
    } 
}
