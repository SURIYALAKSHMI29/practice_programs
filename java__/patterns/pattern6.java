    // Input: ‘N’ = 3
    
    // Output: 
    
    // 1 2 3
    // 1 2
    // 1

public class Solution {
    public static void nNumberTriangle(int n) {
        // Write your code here
        for(int i=0; i<n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
