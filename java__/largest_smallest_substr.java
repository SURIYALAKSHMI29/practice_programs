package javaapplication3;
import java.util.*;

/*
for a given string(s) and length of substring(K)
Find smallest & largest substr that can be formed from the gn word(s) in the length of K.
*/

public class largest_smallest_substr {
    
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
         smallest = s.substring(0,k);
        largest = s.substring(0,k);
        
        for(int i=1;i<=s.length()-k;i++){
            String substr = s.substring(i,i+k);
           for(int j=0; j<substr.length(); j++){
                if(substr.charAt(j) < smallest.charAt(j)){
                    smallest = substr;
                    break;
                }
                else if(substr.charAt(j) > smallest.charAt(j)){    
                    break;
                }
           }
           for(int j=0; j<substr.length(); j++){
                if(substr.charAt(j) > largest.charAt(j)){
                    largest = substr;
                    break;
                }
                else if(substr.charAt(j) < largest.charAt(j)){
                    break;
                }
            }
        }
        return smallest + "\n" + largest;
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String s = obj.next();
        int k = obj.nextInt();
        obj.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}

// Time Complexity: O(n * k), where n is the length of the string and k is the length of the substring.
// Space Complexity: O(k)
