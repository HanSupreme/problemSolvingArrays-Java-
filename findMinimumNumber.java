package GitHub;

public class findMinimumNumber {

    public static void main(String[] args) {

        //find the minimum number in the Array using for loop

        int[] numbers = {1, 10, 2, 20, 3, 30, 4, 40, 5, 50};
        int minimum = numbers[0];
        int minimumIndex = 0;

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] < minimum) {
                minimum = numbers[i];
                minimumIndex = i;
            }
        }

        System.out.println("My minimum number in numbers[] array = " + minimum);
        System.out.println("Position of the minimum element in Array = " + minimumIndex);


    }

}
