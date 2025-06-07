import java.util.*;

/* 
  n=3
    9  8  7 
    6  5  4 
    3  2  1 
*/
public class pattern1{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();

        // without extra var
        System.out.println("Without using extra variable");
        for(int i=n; i>=1; i--){
            for(int j=0; j<n; j++){
                System.out.print((n*i-j)+" ");
            }
            System.out.println();
        }

        System.out.println("\nWith using extra variable");
        for(int i=n; i>=1; i--){
            int val = n*i;
            for(int j=0; j<n; j++){
                System.out.print(String.format("%2d", val)+" ");
                val--;
            }
            System.out.println();
        }
    }
}