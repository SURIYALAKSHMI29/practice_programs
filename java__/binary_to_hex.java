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
public class binary_to_hex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner obj = new Scanner(System.in);
        
        String binary = obj.next();
        HashMap<String, Character> map = new HashMap<>();
        map.put("0000",'0');
        map.put("0001",'1');
        map.put("0010",'2');
        map.put("0011",'3');
        map.put("0100",'4');
        map.put("0101",'5');
        map.put("0110",'6');
        map.put("0111",'7');
        map.put("1000",'8');
        map.put("1001",'9');
        map.put("1010",'A');
        map.put("1011",'B');
        map.put("1100",'C');
        map.put("1101",'D');
        map.put("1110",'E');
        map.put("1111",'F');
        
        String[] parts = binary.split("\\.");
        
        StringBuilder left = new StringBuilder(parts[0]);
        StringBuilder right =  new StringBuilder( parts.length>1? parts[1] : ""); 
        
        while(left.length()%4!=0){
            left.insert(0,'0');
        }
        while(right.length()%4!=0){
            right.append("0");
        }
        
        System.out.println("left "+left);
        System.out.println("right: "+right);
        
        StringBuilder hex = new StringBuilder();
        
        for(int i=0; i<left.length(); i+=4){
            String chunk = left.substring(i,i+4);
            hex.append(map.get(chunk));
        }
        
        if(right.length()!=0){
            hex.append('.');
            for(int i=0; i<right.length(); i+=4){
                String chunk = right.substring(i,i+4);
                hex.append(map.get(chunk));
            }
        }
        
        System.out.println(hex.toString());
        
    }
    
}



// n = length of left part
// m = length of right part

// Time Complexity:
// Padding: O(n + m)

// Splitting into chunks and map lookup: O(n/4 + m/4) → still linear

// Overall Time Complexity = O(n + m)

// Space Complexity:
// Storing padded strings and result → O(n + m)

// HashMap size is constant (16 entries)

// Overall Space Complexity = O(n + m)