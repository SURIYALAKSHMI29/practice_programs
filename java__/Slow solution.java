/*
Chef is trying to solve a problem having 𝑇 test cases, where, for each test case he is given a single integer 𝑁.
Chef has an algorithm which takes exactly 𝑁² iterations for a test case with value 𝑁.

The constraints of the problem are as follows:
  1≤T≤maxT
  1≤N≤maxN
  Sum of 𝑁 over all test cases does not exceed sumN.
Given the values maxT,maxN, and sumN, determine the maximum number of iterations Chef's algorithm can take for any valid input file satisfying all the constraints.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner obj = new Scanner(System.in);
        
        int t,max_t, max_n, sum, itr,j;
        t = obj.nextInt();
        
        for(int i=0;i<t;i++){
            max_t= obj.nextInt();
            max_n= obj.nextInt();
            sum= obj.nextInt();
            
            itr=0;
            j=0;
            
            while(sum>=max_n && j<max_t){
                itr+= Math.pow(max_n, 2);
                sum-=max_n;
                j++;
            }
            if(sum!=0 && j<max_t)
                itr+=Math.pow(sum,2);
                
            System.out.println(itr);
        }
	}
}
