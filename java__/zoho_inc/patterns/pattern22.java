/* 
            1  
         1  2  1
      1  2  3  2  1
   1  2  3  4  3  2  1
1  2  3  4  5  4  3  2  1
   1  2  3  4  3  2  1  
      1  2  3  2  1
         1  2  1
            1
*/

public class pattern22 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=0; i<(2*n-1); i++){
            int colLimit = Math.min(i+1, (2*n-i-1));
            for(int j=0; j<(n-colLimit); j++){
                System.out.print("   ");
            }
            for(int j=1; j<colLimit; j++){
                System.out.print((j)+"  ");
            }
            for(int j=colLimit; j>0; j--){
                System.out.print((j)+"  ");
            }
            System.out.println();
        }
    }
}
