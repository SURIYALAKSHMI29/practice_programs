public class leftRotation {
    static void rightRotate(int num, int rotateBy){
        int split =(int) Math.pow(10, rotateBy);   // 10^2 = 100 (last 2 digits)

        int splitedHalf = num%split;
        num/=split;

        int remHalf = num;
        int remDigitsCount = 0;
        while(num>0){
            remDigitsCount++;
            num/=10;
        }
        int multiplier = (int) Math.pow(10, remDigitsCount);   // rem digits = 3, multiplier = 1000
        num = (splitedHalf*multiplier) + remHalf;   
        System.out.println(num);
    }
    public static void main(String[] args) {
        int num = 12345;
        int rotateBy = 2;    
        int digitsCount = 0;
        int n = num;

        while(n>0){
            digitsCount++;
            n/=10;
        }
        int newRotateBy = digitsCount-rotateBy;
        rightRotate(num, newRotateBy);
    }   
}
