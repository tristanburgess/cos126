package examples_reading_1_4;

public class PrimeSieve {
    public static void main(String[] args) {
        if (args.length != 1) {
            throw new IllegalArgumentException(
                    "Expected exactly one input arg parseable as an int.");
        }

        int n = Integer.parseInt(args[0]);
        boolean isPrime[] = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i <= n / i; i++) {
            if (isPrime[i]) {
                for (int j = i; j <= n / i; j++) {
                    isPrime[i * j] = false;
                }
            }
        }

        int primes = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primes++;
            }
        }
        System.out.println(primes);
    }
}
