package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {

        int i = 0;

        while (i <= printToInclusive) {
            if (isItPrime(i)) {
                System.out.println(i);
            }
            i++;
        }
    }
    private static boolean isItPrime(int number) {
        if (number == 0 || number == 1) {
            return false;
        }
        int i = 2;
        while (i < number) {
            if (number % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static void main(String[] args) {
        PrimeNumbers primeNumbers = new PrimeNumbers();
        int printToInclusive = 10;
        primeNumbers.printPrimeNumbers(printToInclusive);
    }
}
