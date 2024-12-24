    // Input: ‘N’ = 3
    
    // Output: 
    
    //   *
    //  ***
    // *****

public class Solution {
    public static void nStarTriangle(int n) {
        // Write your code here
        for(int i=1; i<=n; i++){
            for(int j=n-i; j>0; j--)
                System.out.print(" ");
            for(int j=1; j<=i*2-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
