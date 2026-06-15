package src.com.sorting;

public class Pyramid {
    public static void main(String[] args){
        int[] a = {2,1,0,99,43,12};
        for(int i=1;i<10;i++){
            for(int j=1;j<=i;j++){
                  System.out.print("*");
                 if(j==i){
                     System.out.print("\n");
                 }
            }
            System.out.println();
        }
    }
}
