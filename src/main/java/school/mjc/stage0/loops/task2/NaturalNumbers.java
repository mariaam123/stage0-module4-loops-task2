package school.mjc.stage0.loops.task2;

import java.sql.SQLOutput;

public class NaturalNumbers {
    public void naturalNumbersPrinter(int lastPrinted) {

        int i = 0;
        while (i <= lastPrinted) {
            System.out.println(i);
            i++;
        }
    }
    public static void main(String[] args) {
        NaturalNumbers naturalNumbers = new NaturalNumbers();
        int lastPrinted = 10;
        naturalNumbers.naturalNumbersPrinter(lastPrinted);
    }
}