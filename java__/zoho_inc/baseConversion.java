import java.util.*;
public class baseConversion {
    // static final char[] mapArray = { 'A', 'B', 'C','D','E','F','E',
    //                                 'G','H', 'I', 'J', 'K', 'L', 'M',
    //                                 'N', 'O', 'P', 'Q', 'R', 'S',
    //                                 'T', 'U', 'V', 'W', 'X', 'Y','Z'};
    public static void main(String[] args) {
        int n = 56;
        int base = 16;
        int temp = n;
        StringBuilder ans = new StringBuilder();
        while(temp>=base){
            int rem = temp%base;
            temp = temp/base;
            if(rem>9)
                ans.append((char)(55+rem));
            else
                ans.append(rem);
        }
        ans.append(temp);

        System.out.println(ans.reverse());
    }
}