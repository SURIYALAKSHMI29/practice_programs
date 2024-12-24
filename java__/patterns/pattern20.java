    // Input: ‘N’ = 3
    
    // Output: 
    // *         *
    // * *     * *
    // * * * * * *
    // * *     * *
    // *         *

public class Solution {
    public static void symmetry(int n) {
        // Write your code here

        int stars = 0;
        int spaces = 2*n -2;
        int breakPoint = n;
        for(int i=1; i<2*n; i++){
            if(i<=breakPoint)
                stars++;
            else
                stars--;
            for(int j=1; j<=stars; j++){
                System.out.print("* ");
            }
            for(int j=1; j<=spaces; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=stars; j++){
                System.out.print("* ");
            }
            System.out.println(); 

            if(i<n)
                spaces-=2;
            else    
                spaces+=2; 
        }

    }
}
