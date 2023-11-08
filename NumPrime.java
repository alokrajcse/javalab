/*
LAB QUESTION 5
Write a java program that will count the number of primes between 37 and 129.
*/


public class NumPrime {

    public static void main(String args[]) {

        int a = 37, b = 129;
        int count = 0;

        for (int i = a; i <= b; i++) {
            boolean isPrime = true;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                count++;
            }
        }

        System.out.println("The number of prime numbers between " + a + " and " + b + " is: " + count);
    }
}
