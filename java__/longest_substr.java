package javaapplication3;
import java.util.*;

public class longest_substr {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        String str = obj.next();
        int[] freq = new int[26];

        for(int i=0; i<26; i++){
            freq[i] = -1;
        }

        int start = 0, end = 0, maxLength = 0;

        while(end<str.length()){
            char ch = str.charAt(end);
            if(freq[ch-'a']!=-1 && freq[ch-'a']>=start){
                start = freq[ch-'a']+1;
            }
            freq[ch-'a'] = end;
            maxLength = Math.max(maxLength, end-start+1);
            end++;
        }

        System.out.println(maxLength);
    }    
}

// Time Complexity: O(n)
// Space Complexity: O(1), due to fixed size array freq
