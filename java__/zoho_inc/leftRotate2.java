public class leftRotate2 {
    public static void main(String[] args) {
        int num = 12345;
        int rotateBy = 3;    
        int digitsCount = 0;   // no of digits in a gn num
        int n = num;

        while(n>0){
            digitsCount++;
            n/=10;
        }
        int splitPoint = digitsCount-rotateBy;   // digits from the last
        int split =(int) Math.pow(10, splitPoint);     

        int splitedHalf = num%split;
        num/=split;
        int multiplier =(int) Math.pow(10, rotateBy);
        int ans = (splitedHalf*multiplier)+num;

        System.out.println(ans);
    }
}
