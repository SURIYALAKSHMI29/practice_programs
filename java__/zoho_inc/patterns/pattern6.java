import java.util.*;

/* 
  n=5
    * * * * *
    * *   * *
    *   *   *
    * *   * *
    * * * * *
*/
public class pattern6{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==1 || i==n || j==1 || j==n || i+j==n+1 || i==j){
                    System.out.print("* ");
                }
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}