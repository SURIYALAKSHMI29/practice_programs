    // Input: ‘N’ = 3
    
    // Output: 
    
    //   *
    //  ***
    // *****
    // *****
    //  ***
    //   *

public class Solution {
    public static void nStarDiamond(int n) {
        // Write your code here
        for(int i=1; i<=n; i++){
            for(int j=i;j<n; j++)
                System.out.print(" ");
            for(int j=0; j<i*2-1; j++)
                System.out.print("*");
            
            System.out.println();
        }
        for(int i=n; i>0; i--){
            for(int j=i;j<n; j++)
                System.out.print(" ");
            for(int j=i*2-1; j>0; j--)
                System.out.print("*");
             System.out.println();
        }
    }
}
