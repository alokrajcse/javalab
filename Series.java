/* LAB QUESTION 7
Write a Java program that will evaluate the following exponential series.
1 + 𝑥 + (x^2)/2!+..

*/
    
import java.util.Scanner;

public class Series {

    static int fact(int num) {
        int f = 1;
        for (int i = 1; i <= num; i++) {
            f *= i;
        }
        return f;
    }

    public static void main(String args[]) {
        double sum = 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of x: ");
        double x = sc.nextDouble();

        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            sum += Math.pow(x, i) / fact(i);
        }

        System.out.println("The sum is: " + sum);
    }
}
