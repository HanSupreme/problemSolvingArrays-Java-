package MarcialChallenges;

public class UploadToGitHub {

    public static void main(String[] args) {

        //Write a JAVA program to find second largest element in an array

        int[] numbers = {1, 10, 2, 20, 3, 30, 4, 40, 5, 50};
        int maximum = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            if(numbers[i] > maximum) {

                maximum = numbers[i];
            }

            int secondLargest = numbers[0];

            for (int j = 1; j < numbers.length; j++) {

                if(numbers[j] > secondLargest && maximum != numbers[j]) {

                    secondLargest = numbers[j];
                }
            }

            System.out.println(secondLargest);
        }

    }


    }