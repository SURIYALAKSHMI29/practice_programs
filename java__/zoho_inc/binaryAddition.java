public class binaryAddition {
    public static void main(String[] args) {
        int a = 1000, b = 1100, sum = 0, carry = 0;
        int a_last, b_last, value;
        int multiplier = 1;

        while(a>0 || b>0){
            a_last = a%10;
            b_last = b%10;
            value = a_last+b_last+carry;  
            carry = 0;
            if(value==2){
                carry = 1;
                value = 0;  
            }
            else if(value>2){
                carry =1;
                value=1;
            }
            sum = (value*multiplier)+sum;
            a/=10;
            b/=10;
            multiplier*=10;
        }
        if(carry!=0){
            sum = (carry*multiplier) + sum;
        }

        System.out.println(sum);

    }
}
