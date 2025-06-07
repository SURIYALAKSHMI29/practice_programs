import java.util.*;
public class longestSubstrOfConsonants {
    // static final char[] vowels = {'a','e','i','o','u','A','E','I', 'O','U'};

    static boolean isVowel(char ch){
        return ch=='a' || ch=='A' || ch=='e' || ch=='E' ||
                ch == 'i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U';
    }

    static boolean isGreater(int currStart, int currEnd, int start, int end){
        return (currEnd-currStart) > (end-start);
    }

    static void longestSubstr(String input){
        int start = -1;     // starting index of the longest substring part as far now 
        int end = -1;       // ending index of the longest substring part as far now 
        int strLength = input.length();
        int currStart = -1;     // starting index of the current substring part 
        int currEnd = -1;       // ending index of the current substring part 

        for(int i=0; i<strLength; i++){
            if(isVowel(input.charAt(i))){
                if(isGreater(currStart, currEnd, start, end)){      // current substr length > longest substr length ?
                    start = currStart;
                    end = currEnd;
                }
                currStart = -1;
                currEnd = -1;
            }
            else if(currStart == -1){
                currStart = i;
                currEnd = i;
            }
            else{
                currEnd++;
            }
        }
         if(isGreater(currStart, currEnd, start, end)){
            start = currStart;
            end = currEnd;
        }
        
        System.out.println("for given input: "+input);
        System.out.println(input.substring(start, end+1));
    }
    public static void main(String[] args) {
        longestSubstr("amjlkiqi");
        longestSubstr("amjlkq");
    }

}
