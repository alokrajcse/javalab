public class PrimeCounter {
    public static void main(String[] args) {
        int startRange = 37;
        int endRange = 129;

        int count = 0;

        for (int num = startRange; num <= endRange; num++) {
            if (isPrime(num)) {
                count++;
            }
        }

        System.out.println("Number of prime numbers between " + startRange + " and " + endRange + ": " + count);
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}