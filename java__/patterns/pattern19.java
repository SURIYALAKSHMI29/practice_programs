    // Input: ‘N’ = 3
    
    // Output: 
    // * * * * * * 
    // * *     * * 
    // *         * 
    // *         * 
    // * *     * * 
    // * * * * * * 


public class Solution {
    public static void symmetry(int n) {
        // Write your code here

        for(int i=0; i<n; i++){
            for(int j=0; j<n-i; j++)
                System.out.print("* ");
            
            for(int j=0; j<2*i; j++)
                System.out.print(" ");

            for(int j=0; j<n-i; j++)
                System.out.print("* ");  
            
            System.out.println();
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++)
                System.out.print("* ");
            
            for(int j=0; j<2*(n-i); j++)
                System.out.print(" ");

            for(int j=0; j<=i; j++)
                System.out.print("* ");  
            
            System.out.println();
            
        }
        
    }
}
