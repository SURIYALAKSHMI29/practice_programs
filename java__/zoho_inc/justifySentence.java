public class justifySentence {
    static int countSpaces(String str){
        int count = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==' '){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "I play cricket every evening";
        int size = 33;
        int length = str.length();
        int req = size-length;
        System.out.println("string length "+length);
        if(length>=size){
            System.out.println(str);
            return;
        }
        int spaces = countSpaces(str);  // total spaces in the sentence
        int extraSpaces = req/spaces;   // equal spaces needs to be added
        int additional = req%spaces;    // no of words gets additional spaces

        for(int i=0; i<length; i++){
            if(str.charAt(i)==' '){
                for(int j=0; j<extraSpaces; j++){
                    System.out.print("_");
                }
                if(additional>0){
                    System.out.print("_");
                    additional--;
                }
            }
            System.out.print(str.charAt(i));
        }
        
    }
}
