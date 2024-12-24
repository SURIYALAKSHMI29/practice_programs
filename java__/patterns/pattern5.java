    // Input: ‘N’ = 3
    
    // Output: 
    // * * *
    // * *
    // *

public class Solution {
    public static void seeding(int n) {
        // Write your code here
        for(int i=0; i<n; i++){
            for(int j=n-i; j>0; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
