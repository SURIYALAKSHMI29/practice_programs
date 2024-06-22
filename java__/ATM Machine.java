/*There is an ATM machine. Initially, it contains a total of 𝐾 units of money. 𝑁 people (numbered 1 through 𝑁) want to withdraw money; for each valid i, the i-th person wants to 
withdraw Ai units of money.The people come in and try to withdraw money one by one, in the increasing order of their indices. Whenever someone tries to withdraw money, 
if the machine has at least the required amount of money, it will give out the required amount. Otherwise, it will throw an error and not give out anything; in that case, 
this person will return home directly without trying to do anything else.
For each person, determine whether they will get the required amount of money or not.*
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner obj = new Scanner(System.in);
		
		int t= obj.nextInt();
		int n, amt,r;
		
		for(int i=0;i<t;i++){
		    n = obj.nextInt();
		    amt = obj.nextInt();
		    
		    for(int j=1;j<=n;j++){
		       r = obj.nextInt();
		       if(r<=amt){
		           System.out.print("1");
		           amt-=r;
		       }
		       else
		            System.out.print("0");
		    }
		    System.out.println();
		}
	}
}
