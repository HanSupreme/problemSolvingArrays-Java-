package MarcialChallenges;

public class printAllNegativeNumbers {

    public static void main(String[] args) {

    //Write a JAVA program to print AlL NEGATIVE elements in an array

    int[] numbers = {1, -2, 3, -4, 5, -6, 7, -8, 9, -10};

    //our ARRAY with values, positive and negative

    for (int i = 0; i < numbers.length; i++) {

        //FOR LOOP to loop through and check our ARRAY

        if (numbers[i] < 0)

            //IF statement will check IF the numbers stored inside of the arrays are negative, that's why it is LESS THAN ZERO

            System.out.println(numbers[i]); //this will print out what we're looking for

    } //closing braces for For-Loop

} //closing braces for problemTwo() method

}
