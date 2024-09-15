public class Primes {
    public static void main(String[] args) {
        for (int i = 2; i <= 99; i++){
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
        
    }
    public static boolean isPrime(int n) {
        if ((n==1 || n == 2)) {
            return true;
        }
        int limit = (int) Math.sqrt(n);
        for (int i=2; i<=limit; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
        }

    }

