import java.util.*;

/*
n = 5
    1 1 1 1 1 
    1 2 2 2 1 
    1 2 3 2 1 
    1 2 2 2 1 
    1 1 1 1 1 
 */
public class pattern17{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        
        for(int i=1; i<=n; i++){
            int top = i;
            int bottom = (n-i+1);
            int outerMin = Math.min(top, bottom);
            for(int j=1; j<=n; j++){
                int left = j;
                int right = (n-j+1);
                System.out.print(Math.min( Math.min(left, right), outerMin)+" ");
            }
            System.out.println();
        }
    }
}
