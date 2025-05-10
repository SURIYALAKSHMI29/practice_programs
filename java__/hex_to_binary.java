/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author suriya
 */
import java.util.*;
import java.io.*;
public class hex_to_binary {
    
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        String hex = obj.next();

        int dec = Integer.parseInt(hex, 16);
        System.out.println(Integer.toBinaryString(dec));

        // Time complexity: O(n).

        // The space used by Integer.parseInt() and Integer.toBinaryString() is proportional
        // to the size of the resulting binary string, which is O(n).
        
        // ----------------------------------------------------------------------------------


        int i = 0;
 
        while (i < hex.length()) {
 
            switch (hex.charAt(i)) {
            case '0':
                System.out.print("0000");
                break;
            case '1':
                System.out.print("0001");
                break;
            case '2':
                System.out.print("0010");
                break;
            case '3':
                System.out.print("0011");
                break;
            case '4':
                System.out.print("0100");
                break;
            case '5':
                System.out.print("0101");
                break;
            case '6':
                System.out.print("0110");
                break;
            case '7':
                System.out.print("0111");
                break;
            case '8':
                System.out.print("1000");
                break;
            case '9':
                System.out.print("1001");
                break;
            case 'A':
            case 'a':
                System.out.print("1010");
                break;
            case 'B':
            case 'b':
                System.out.print("1011");
                break;
            case 'C':
            case 'c':
                System.out.print("1100");
                break;
            case 'D':
            case 'd':
                System.out.print("1101");
                break;
            case 'E':
            case 'e':
                System.out.print("1110");
                break;
            case 'F':
            case 'f':
                System.out.print("1111");
                break;
            case '.':
                System.out.print(".");
                break;
            default:
                System.out.print("\nInvalid hexadecimal digit " +hex.charAt(i));
            }
            i++;
        }

        // Time Complexity: O(n) 
        // Space Complexity: O(n) 
    }
}

