    // Input: ‘N’ = 3
    
    // Output: 
    //     A
    //   A B A
    // A B C B A

public class Solution {
    public static void alphaHill(int n) {
        // Write your code here

        for(int i=1; i<=n ;i++){
            for(int j=1; j<2*(n-i); j++)
                System.out.print(" ");
            char ch = 'A';
            int  breakPoint = (2*i)/2;
            for(int j=1; j<(2*i); j++){
                System.out.print(ch+" ");
                if(j>=breakPoint)
                    ch--;
                else
                    ch++;
            }
            System.out.println();
        }
    }
}
