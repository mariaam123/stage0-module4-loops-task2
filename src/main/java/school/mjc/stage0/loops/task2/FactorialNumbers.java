package school.mjc.stage0.loops.task2;

public class FactorialNumbers {


    public void printFactorialRow(int printToInclusive) {
        int count = 0;
        int factorial = 1;
        while (printToInclusive>=count){
        if (count ==0){
            System.out.println(1);}
        else {

            factorial *= count;
            System.out.println(factorial);
        }
        count++;
        }}}
