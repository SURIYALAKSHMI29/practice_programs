    // Input: ‘N’ = 3
    
    // Output: 
    
    // 1         1
    // 1 2     2 1
    // 1 2 3 3 2 1


public class Solution {
    public static void numberCrown(int n) {
        // Write your code here.
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            for(int j=1; j<=(n-i)*2; j++)
                System.out.print(" ");
            for(int j=i; j>0; j--){
                System.out.print(j+" ");
            }

            System.out.println();
        }
    }
}
