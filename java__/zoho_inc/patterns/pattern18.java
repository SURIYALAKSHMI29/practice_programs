import java.util.*;
/* 
   n = 5
    5 5 5 5 5 
    5 4 4 4 5 
    5 4 3 4 5 
    5 4 4 4 5 
    5 5 5 5 5 
*/

public class pattern18{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        
        for(int i=1; i<=n; i++){
            int outerMax = Math.max(i, (n-i+1));
            int innerMax = n;
            int diff = -1;
            for(int j=1; j<=n; j++){
                System.out.print(Math.max(outerMax, innerMax)+" ");
                innerMax+=diff;
                if(j>=n/2)   
                    diff = 1;
                // System.out.print(Math.max( Math.max((n-j+1), j), outerMax)+" ");
            }
            
            System.out.println();
        }
    }
}
