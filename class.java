class PrimeNumbers {
    public static void main(String[] args) {
        int limit = 100;
        System.out.println("Prime numbers between 1 and " + limit);
        for (int i = 2; i <= limit; i++) {  // Start loop at 2, since 1 is not a prime number
            boolean isPrime = true;
            int sqrt = (int) Math.sqrt(i);  // Get the square root of i, cast it to an integer
            for (int j = 2; j <= sqrt; j++) {  // Loop up to the integer square root of i
                if (i % j == 0) {  // If i is divisible by j, it's not prime
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
