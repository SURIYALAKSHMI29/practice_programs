import java.util.*;
public class babylonianSqrt {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double n = obj.nextDouble();
        double currGuess = n/2;
        double prevGuess;
        double err = 0.0001;

        do {
            prevGuess = currGuess;
            currGuess = (prevGuess + (n / prevGuess)) / 2;
        } while (Math.abs(currGuess - prevGuess) > err);

        System.out.format("%.4f", currGuess);
    }
}
