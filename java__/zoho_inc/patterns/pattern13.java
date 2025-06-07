import java.util.*;
/* 
4
1 8 9 16 
2 7 10 15 
3 6 11 14 
4 5 12 13 

*/
public class pattern13 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();

        for(int i=1; i<=n; i++){
            int prev = 2*(n-i)+1;
            int val = i;
            for(int j=1; j<=n; j++ ){
                System.out.print(val+" ");
                val = val+prev;
                prev = (2*n)-prev;
            }
            System.out.println();
        }
    }
}
