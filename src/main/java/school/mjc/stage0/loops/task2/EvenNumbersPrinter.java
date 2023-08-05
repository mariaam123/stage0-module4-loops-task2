package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {

        int i = 0;
        while (i <= printTillInclusive) {
            System.out.println(i);
            i=i+2;
        }
    }

    public static void main(String[] args) {
        EvenNumbersPrinter evenNumbersPrinter = new EvenNumbersPrinter();
        int printTillInclusive = 15;
        evenNumbersPrinter.printEvenNumbers(printTillInclusive);
    }
}