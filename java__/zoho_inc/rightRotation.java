public class rightRotation {
    public static void main(String[] args) {
        int num = 12345;
        int rotateBy = 2;
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
}
// static int reverse(int n){
//     int reversedN = 0;
//     while(n>0){
//         int rem = n%10;
//         reversedN = (reversedN*10)+rem;
//         n/=10;
//     }
//     return reversedN;
// }
// public static void main(String[] args) {
//     int num = 12345;
//     int rotateBy = 2;

//     int splitedHalf = 0;

//     while(rotateBy>0){
//         int rem = num%10;
//         splitedHalf = (splitedHalf*10)+rem;
//         num/=10;
//         rotateBy--;
//     }
//     splitedHalf = reverse(splitedHalf);
//     int remHalf = num;
//     int multiplier = 1;
//     while(num>0){
//         multiplier*=10;
//         num/=10;
//     }
//     num = (splitedHalf*multiplier)+remHalf;

//     System.out.println(num);
// }
