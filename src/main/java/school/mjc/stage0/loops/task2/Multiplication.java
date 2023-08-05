package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int count = 0;

        if(multiplyByAndToInclusive == 0){
            return;
        }

        if (multiplyByAndToInclusive > 0) {
            while (multiplyByAndToInclusive >= count) {
                System.out.println(multiplyByAndToInclusive * count);
                count++;
            }
        }

        if(multiplyByAndToInclusive < 0){
            multiplyByAndToInclusive *= -1;
            while (multiplyByAndToInclusive >= count){
                System.out.println(multiplyByAndToInclusive * count * -1);
                count++;
            }
        }
    }

    public static void main(String[] args) {
        Multiplication multiplication = new Multiplication();
        int multiplyByAndToInclusive = 3;
        multiplication.printMultiplied(multiplyByAndToInclusive);
    }
}