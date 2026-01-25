/*
can also done by using             
System.out.println("*".repeat(n)); 
instead of for loop for column.
*/
package Patterns;
public class pattern2 {
    public static void main(String[]args){
        patt(4);
    }
    static void patt(int n){
        for(int row=1;row<=n;row++){
            for(int column=1;column<=n;column++){
            System.out.print('*');
            }System.out.println();
        }
    }
}
