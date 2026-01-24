public class Pattern3 {
    public static void main(String[] args) {
        patt(5); 
    }
    static void patt(int n){
        for(int row=1;row<=n;row++){
            for(int column=1;column<=n+1-row;column++){
                System.out.print("*");
            }System.out.println();
        }
    }

}
