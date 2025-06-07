public class stringCompression {
    public static void main(String[] args) {
        String input = "AAAABBCRR";
        compress(input);
    }
    static void compress(String input ){
        StringBuilder ans = new StringBuilder();
        int count = 1;
        char prev = input.charAt(0);
        int strLength = input.length();
        for(int i=1; i<strLength; i++){
            if(prev==input.charAt(i))
                count++;
            else{
                if(count>1){
                    ans.append(count);
                }
                ans.append(prev);
                prev = input.charAt(i);
                count = 1;
            }
        }
        if(count>1){
            ans.append(count);
        }
        ans.append(prev);
        System.out.println(ans);

        // for(int i=1; i<strLength; i++){
        //     if(input.charAt(i-1)==input.charAt(i))
        //         count++;
        //     else{
        //         if(count>1){
        //             ans.append(count);
        //         }
        //         ans.append(input.charAt(i-1));
        //         System.out.println(ans+" "+i);
        //         count = 1;
        //     }
        // }
        // if(count>1){
        //     ans.append(count);
        // }
        // ans.append(input.charAt(strLength-1));

        // System.out.println(ans);
    }
}
