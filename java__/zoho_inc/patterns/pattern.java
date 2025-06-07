import java.util.*;

/* 
n=5
        5 
      9 4 
    12 8 3 
  14 11 7 2 
15 13 10 6 1 
*/
public class pattern{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();

        int x = n;
        for(int i=n-1; i>=0; i--){
            for(int j=0; j<i; j++){
                System.out.print("  ");
            }
            int val = x;
            for(int j=i+1; j<=n; j++){
                System.out.print(val+" ");
                val-=(j+1);
            }
            System.out.println();
            x+=i;
        }
    }
}
