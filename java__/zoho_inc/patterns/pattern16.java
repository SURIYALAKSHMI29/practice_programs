import java.util.*;
/*
n=5
    1 
    2 3
    4 5 6
    7 8
    9
 */
public class pattern16 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        
        int val = 1;
        for(int i=0; i<n; i++){
            int colLimit = Math.min(i+1, (n-i));
            for(int j=0; j<colLimit; j++){
                System.out.print(val+" ");
                val++;
            }
            System.out.println();
        }
    }
}
