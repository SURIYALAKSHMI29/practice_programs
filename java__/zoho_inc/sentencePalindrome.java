public class sentencePalindrome {
    static boolean checkPalindrome(String sentence){
        int n = sentence.length()-1;
        int left = 0, right =n;
        int startingIndex = left;

        while(left<right){ 
            if(sentence.charAt(left)!=' '){
                left++;
            }
            else{
                int start = left-1;
                while(startingIndex<=start){
                    if(sentence.charAt(start)==sentence.charAt(right)){
                        right--;
                        start--;
                    }else{
                        return false;
                    }
                }
                if(sentence.charAt(right)!=' '){
                    return false;
                }
                right--;
                left++;
                startingIndex = left;
            }

        }
        System.out.println("Gn sentence: "+sentence+"\nPalindrome");
        return true;
    }
    public static void main(String[] args) {
        String sentence1 = "I read a story book";
        String sentence2 = "hello world hello";

        System.out.println(checkPalindrome(sentence1));
        System.out.println(checkPalindrome(sentence2));
    }
}
