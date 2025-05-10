package javaapplication3;
import java.util.*;

public class add_Digit_Until_A_Single_Digit{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();

        System.out.println("Gn: "+n);
        int ans = 0;
        while(n>9){    // outer loop
            while(n>0){     // inner loop
                ans+= n%10;
                n/=10;
            }
            // System.out.println(n+" "+ans);
            n = ans;
            ans = 0;
        }

       System.out.println("Ans: "+n);

       // The inner loop runs in O(d) where d = number of digits in n, which is O(log n) 
       // (since the number of digits in a number n is proportional to log₁₀(n)).
       
       // The outer loop runs very few times. In practice, it's at most 2–3 times for any number,
       // because the digit sum shrinks quickly.
       
       // ✅ Final Complexity:
       // Even though it looks like a nested loop, the total work done across all iterations 
       // is still proportional to the number of digits in the original number, not multiplied.
       
       // So the total time complexity is: O(log n)
       // And the space complexity is: O(1)

       // ------------------------------------------------------------------------------------------------


       // Method 2

       if(n!=0 && n%9==0)
       {
           System.out.println(9);
       }
       else
       {
           System.out.println(n%9);
       }

       // Time complexity: O(1)
       // Space Complexity: O(1)

    }
    
}


