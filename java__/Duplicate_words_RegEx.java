/*
In this challenge, we use regular expressions (RegEx) to remove instances of words that are repeated more than once,but retain the 
first occurrence of any case-insensitive repeated word. For example, the words love and to are repeated in the sentence I love Love to To tO code. 
Can you complete the code in the editor so it will turn I love Love to To tO code into I love to code?
*/

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {

    public static void main(String[] args) {

        String regex ="\\b(\\w+)\\b(\\s+\\1\\b)+";  
  // explanation: \b ->word bound; \w+ -> words with any no.of alphanumeric; \s+ -> any no.of whitespaces; \1 -> 1st group of words matched (i.e) /w+
        Pattern p = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
  
        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        
        while (numSentences-- > 0) {
            String input = in.nextLine();
            
            Matcher m = p.matcher(input);
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(0),m.group(1));
          /*
          for ex, input: Hello hello
          Matcher m returns, 
          m.group(0): Returns the entire matched substring, which is "Hello hello".
          m.group(1): Returns the first captured group, which is "Hello".
          */
              
            }
            
            // Prints the modified sentence.
            System.out.println(input);
        }
        
        in.close();
    }
}
