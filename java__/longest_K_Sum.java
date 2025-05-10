package javaapplication3;
import java.util.*;

public class longest_K_Sum{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int k = obj.nextInt();
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int num, sum =0, req;
        int maxLength = 0;

        map.put(0, 0);
        for(int i=0; i<n; i++){
            num = obj.nextInt();
            sum+=num;
            if(!map.containsKey(sum))
                map.put(sum, i+1);
            req = sum-k;
            if(map.containsKey(req)){
                maxLength = Math.max(maxLength, i-map.get(req)+1);
            }
        }

        System.out.println(maxLength);

    }
}

// Time Complexity: O(n)
// Space Complexity: O(n)