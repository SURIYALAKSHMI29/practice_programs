    // Input: ‘N’ = 3
    
    // Output: 
    
    // 1
    // 2 3
    // 4 5 6


public class Solution {
    public static void nNumberTriangle(int n) {
        // Write your code here
       
        int start = 1;
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(start+" ");
                start++;
            }
            System.out.println();
        }
    }
}
