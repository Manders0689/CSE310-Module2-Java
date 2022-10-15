import java.util.ArrayList;

public class PrimeNumbers {
    
    public boolean isPrime(int number) {
        // the number 2 is the smallest prime number
        if (number == 2) {
            return true;
        }
        // anything less than 2 should return false
        if (number < 2) {
            return false;
        }
        // checking to see if number is prime
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<Integer> onlyPrimes(int[] numbers) {
        // creating new ArrayList to add all prime numbers to
        ArrayList<Integer> primes = new ArrayList<Integer>();

        // looping through ArrayList passed in by main()
        for (int number : numbers) {
            // checking to see if each number passed in is prime
            if (isPrime(number)) {
                // if it is prime, add it to the primes ArrayList
                primes.add(number);
            }
        }
        return primes;
    }

    public static void main(String[] args) {

        PrimeNumbers pd = new PrimeNumbers();
        int[] numbers = {3, 6, 7, 20, 29, 28, 33, 11, 77, 49, 67, 99, 81, 100, 101, 43, 89};
        System.out.println(pd.onlyPrimes(numbers));
    }

}
