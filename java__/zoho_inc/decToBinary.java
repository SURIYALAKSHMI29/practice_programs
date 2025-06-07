public class decToBinary {
    public static void main(String[] args) {
        int number = 7;
        int num = number;
        int rem =0, ones = 0, zeros = 0;
        while(num>0){
            rem = num%2;
            num/=2;
            if(rem==0){
                zeros++;
            }
            else{
                ones++;
            }
        }
       
        System.out.println("For a given number "+number);
        System.out.println("No.of zeros: "+zeros+"\nNo.of ones: "+ones);
    }
}
