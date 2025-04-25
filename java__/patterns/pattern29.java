package javaapplication3;
import java.util.*;

// z o h o c o r 
//           p
//         o
//       r
//     a
//   t
// i o n t e a m

public class pattern7 {
    public static void main(String[] args) {
        String str = "zohocorporationteam";
        int n = str.length()+2;
        int partLength = n/3;
        int index = 0;

        for(int i=0;i<partLength; i++){
           System.out.print(str.charAt(index++)+" ");
        }
        System.out.println();
        for(int i= partLength-2; i>0; i-- ){
            for(int j=0; j<i; j++){
                System.out.print("  ");
            }
            System.out.println(str.charAt(index++));
        }
        for(int i=0; i<partLength; i++){
            System.out.print(str.charAt(index++)+" ");
        }
    }
    
}
