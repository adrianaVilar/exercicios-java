package calculator;

public class Calculator {

    public static int getFrequency(int[] numbers) {

        int larger = getLarger(numbers);

        int[] auxiliary = new int[larger + 1];

        for (int i = 0; i < numbers.length; i++) {
            auxiliary[numbers[i]]++;
        }

        int largerAux = getLarger(auxiliary);

        for (int i = 0; i < auxiliary.length; i++) {
            if(largerAux == auxiliary[i]){
                return i;
            }
        }
        return -1;
    }

    private static int getLarger(int[] flavors){
        int larger = 0;

        for(int i = 0; i < flavors.length; i++) {
            if (flavors[i] > larger) {
                larger = flavors[i];
            }
        }
        return larger;
    }

}
