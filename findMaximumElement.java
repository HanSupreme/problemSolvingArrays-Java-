package MarcialChallenges;

public class findMaximumElement {

    public static void main(String[] args) {

        /*
         * PUBLIC - can be accessed anywhere
         * STATIC - can be used without having to create an instance
         * VOID - will return back nothing
         * The above is our method signature
         *
         * Write a JAVA program to find maximum element in an array
         */

        //find the maximum number in the for loop

        int[] numbers = {1, 10, 2, 20, 3, 30, 4, 40, 5, 50};
        int maximum = numbers[0];
        int maximumIndex = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maximum) {
                maximum = numbers[i];
                maximumIndex = i;
            }
        }
        System.out.println("My maximum number in numbers[] array = " + maximum);
        System.out.println("Position of the maximum element in Array = " + maximumIndex);
    }

}
