import java.util.*;

/* 
  n=3
        *
      * *
    * * *
    * * *
      * *
        *
    
*/
public class pattern7{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=n; j>i; j--){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1; i<=n; i++){
            for(int j=1; j<i; j++){
                System.out.print("  ");
            }
            for(int j=i; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}