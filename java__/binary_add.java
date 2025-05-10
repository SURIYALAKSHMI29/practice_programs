package javaapplication3;
import java.util.*;
import java.io.*;
import java.sql.Time;

public class binary_add {

    static int binaryToDecimal(String binary){
        int decimal = 0;
        int base = 1;
        for(int i = binary.length() - 1; i >= 0; i--){
            if(binary.charAt(i) == '1'){
                decimal += base;
            }
            base *= 2;
        }
        return decimal;
    }

    static String decimalToBinary(int decimal){
        if (decimal == 0) 
            return "0";
        StringBuilder result = new StringBuilder();
        while(decimal!=0){
            int rem = decimal%2;
            if(rem>=10)
                result.append((char)(rem+55));
            else    
                result.append((char)(rem+48));
            decimal = decimal/2;
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String a = obj.next();
        String b = obj.next();


        // Method 1
        int a_dec = Integer.parseInt(a, 2);
        int b_dec = Integer.parseInt(b, 2);
        int sum = a_dec + b_dec;
        String result = Integer.toBinaryString(sum);
        System.out.println(result);  
        
        //Time Complexity: O(n) where n = length of input binary string.
        // Internally, parseInt and toBinaryString iterate over the string.
        // Space Complexity: O(n)

        // --------------------------------------------------

        // Method 2
        int dec_A = binaryToDecimal(a);
        int dec_B = binaryToDecimal(b);
        int sum_dec = dec_A + dec_B;
        String result_dec = decimalToBinary(sum_dec);
        System.out.println(result_dec);

        // binaryToDecimal: Scans string right to left → O(n)
        // decimalToBinary: Repeated division → O(log m) where m = decimal sum, which can go up to 2^(n) in worst case
        // But since input length n corresponds to log m, overall:

        // Time Complexity: O(n)
        // Space Complexity: O(n) (result string)

        // --------------------------------------------------

        // Method 3
        StringBuilder result_bin = new StringBuilder();
        int carry = 0;
        int n = a.length()-1;
        int m = b.length()-1;
        int index = 0;
        while(n>=0 || m>=0 || carry>0){
            int total =carry;
            if(n>=0){
                total+=  (a.charAt(n) - '0');
            }
            if(m>=0){
                total+= (b.charAt(m) - '0');
            }
            carry = total / 2;
            total = total % 2;
            result_bin.append(total);
            n--;
            m--;
            index++;
        }
        System.out.println(result_bin.reverse().toString());

        // Time Complexity: O(max(n, m))
        // Space Complexity: O(max(n, m))
    }
}
