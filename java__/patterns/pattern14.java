    // Input: ‘N’ = 3
    
    // Output: 
    
    // A
    // A B
    // A B C

public class Solution {
    public static void nLetterTriangle(int n) {
        // Write your code here
        for(int i=0; i<n; i++){

            char ch = 'A';
            for(int j=0; j<=i; j++){
                System.out.print((char)(ch+j)+" ");
            }
            System.out.println();
        }
    }
}
