/*
Easy Pronunciation
Words that contain many consecutive consonants, like "schtschurowskia", are generally considered somewhat hard to pronounce. We say that a word is hard to pronounce if it contains 4 or more consonants in a row;
otherwise it is easy to pronounce. For example, "apple" and "polish" are easy to pronounce, but "schtschurowskia" is hard to pronounce.
You are given a string 𝑆 consisting of 𝑁 lowercase Latin characters. Determine whether it is easy to pronounce or not based on the rule above — print YES if it is easy to pronounce and NO otherwise.
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
        int t = obj.nextInt();
        int n,i,j,count;
        char s;
        
        StringBuffer sb = new StringBuffer();
        for(i=0;i<t;i++){
            n = obj.nextInt();
            sb.setLength(0);
            sb.append(obj.next());
            
            count=0;
            for(j=0;j<n;j++){
                s = sb.charAt(j);
                if(s=='a' || s=='e' || s=='i' || s=='o' || s=='u')
                    count=0;
                else
                    count++;
                    //System.out.println(s+" "+count);
                
                if(count==4)
                    break;
            }
            
            if(count>=4)
                System.out.println("no");
            else
                System.out.println("yes");
        }
	}
}
