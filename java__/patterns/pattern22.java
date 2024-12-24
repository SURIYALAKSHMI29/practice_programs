    // Input: ‘N’ = 4
    
    // Output: 
    
    // 4444444
    // 4333334
    // 4322234
    // 4321234
    // 4322234
    // 4333334
    // 4444444


public class Solution {
    public static void getNumberPattern(int n) {

        for(int i=0; i<2*n-1; i++){
            for(int j=0; j<2*n-1; j++){
                int top = i;
                int left = j;
                int right = (2*n-2)-j;
                int bottom = (2*n-2)-i;

                int val = n - (Math.min( Math.min(top, left), Math.min(right, bottom)));
                System.out.print(val);
            }
            System.out.println();
        }
    }
}
