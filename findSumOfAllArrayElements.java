package Github;

public class findSumOfAllArrayElements {

    public static void main(String[] args) {

        /*
         * PUBLIC - can be accessed anywhere
         * STATIC - can be used without having to create an instance
         * VOID - will return back nothing
         * The above is our method signature
         * Our method name is problemThree(); <<
         *
         * WRITE A JAVA PROGRAM TO FIND THE SUM OF ALL ARRAY ELEMENTS
         */

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0; //accumulator

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

            //System.out.println(sum);
            // if you print inside loop you will see the previous numbers adding up until final sum is reached

        }//closing braces for our For loop

        System.out.println(sum);

    } //closing braces for main(); Method

} //closing braces for class method
