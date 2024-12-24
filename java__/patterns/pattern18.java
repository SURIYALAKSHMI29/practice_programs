    // Input: ‘N’ = 3
    
    // Output: 
    // C
    // C B 
    // C B A

public class Solution {
    public static void alphaTriangle(int n) {
        // Write your code here
        for(int i=1; i<=n; i++){

            char ch = (char) ('A'+n-1);
            for(int j=1;j<=i; j++){
                System.out.print(ch+" ");
                ch--;
            }
            System.out.println();
        }
    }
} 


