import java.util.Scanner;

public class ScoreAnalyzer {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Part 1
        // Part 2

        int count = 0;
        double total = 0;
        double highest = 0;
        double lowest = 0;
        int passingScores = 0;
        int below60 = 0;
        // Part 3

        System.out.print("Enter a score from 0 to 100 (-1 to finish): ");
        double score = input.nextDouble();

        while (score != -1) {
            // Part 4

            if (score >= 0 && score <= 100) {
                // Part 5

                count++;
                total += score;
                // Part 6

                if (count == 1) {
                    highest = score;
                    lowest = score;
                }
                else {
                    if (score > highest) {
                        highest = score;
                    }

                    if (score < lowest) {
                        lowest = score;
                    }
                }
                // Part 7

                if (score >= 60) {
                    passingScores++;
                }
                else {
                    below60++;
                }

            }
            else {
                System.out.println("Invalid score. Value ignored.");
            }

            System.out.print("Enter a score from 0 to 100 (-1 to finish): ");
            score = input.nextDouble();
        }
        // Part 8

        if (count > 0) {

            double average = total / count;

            System.out.println();
            System.out.println("----- Score Summary -----");
            System.out.printf("Valid scores: %d%n", count);
            System.out.printf("Average: %.2f%n", average);
            System.out.printf("Highest: %.2f%n", highest);
            System.out.printf("Lowest: %.2f%n", lowest);
            System.out.println("Passing scores: " + passingScores);
            System.out.println("Below 60: " + below60);

        }
        else {
            System.out.println();
            System.out.println("No valid scores were entered.");
        }
        // Part 9

        System.out.println();
        System.out.println("----- Part 9: Do-While Example -----");

        double doWhileScore;

        do {
            System.out.print("Enter a score from 0 to 100 (-1 to finish): ");
            doWhileScore = input.nextDouble();

            if (doWhileScore != -1) {
                if (doWhileScore >= 0 && doWhileScore <= 100) {
                    System.out.println("Valid score.");
                }
                else {
                    System.out.println("Invalid score. Value ignored.");
                }
            }

        } while (doWhileScore != -1);
        // Part 10

        System.out.println();
        System.out.println("----- Part 10: Fixed Score Analyzer -----");

        double fixedTotal = 0;

        for (int i = 1; i <= 5; i++) {

            System.out.print("Enter score " + i + ": ");
            double fixedScore = input.nextDouble();

            fixedTotal += fixedScore;
        }

        double fixedAverage = fixedTotal / 5;

        System.out.println("Total: " + fixedTotal);
        System.out.printf("Average: %.2f%n", fixedAverage);
        // Part 11

        System.out.println();
        System.out.println("----- Part 11: Score Pattern -----");

        for (int row = 1; row <= 5; row++) {

            for (int number = 1; number <= row; number++) {
                System.out.print(number + " ");
            }

            System.out.println();
        }
        // Part 12

        System.out.println();
        System.out.println("----- Part 12: Break Challenge -----");

        for (int number = 1; number <= 100; number++) {

            if (number > 20 && number % 4 == 0 && number % 7 == 0) {
                System.out.println("First number found: " + number);
                break;
            }
        }
        // Part 13

        System.out.println();
        System.out.println("----- Part 13: Continue Challenge -----");

        for (int number = 1; number <= 20; number++) {

            if (number % 3 == 0) {
                continue;
            }

            System.out.println(number);
        }

        input.close();
    }
}



 // Part 14

        /*
        1. The loop never terminates because count never changes.

        2. count++ is missing.

        3. Correct loop:

        int count = 1;

        while (count <= 5) {
            System.out.println(count);
            count++;
        }
        */


        // Part 15

        /*
        1. The last number displayed is 9.

        2. 10 is missing because the condition is i < 10.

        3. The correct condition is i <= 10.
        */


        // Part 16

        /*
        1. There is an unnecessary semicolon after the for loop header.

        2. The block executes one time.

        3. Correct code:

        for (int i = 0; i < 5; i++) {
            System.out.println("Java");
        }
        */


        // Part 17

        /*
        Print a message exactly 20 times -> for

        Read values until the user enters -1 -> while

        Display a menu at least once and repeat until Exit is selected -> do-while

        Generate the first 10 multiples of 7 -> for
        */


        // Check Your Understanding

        /*
        1. A sentinel value tells the program when to stop accepting input.

        2. A while loop is appropriate when the number of inputs is unknown.

        3. A for loop is appropriate when the number of repetitions is known.

        4. A counter keeps track of how many times something occurs,
           while an accumulator keeps a running total.

        5. A do-while loop always executes at least once because the
           condition is checked after the loop body.

        6. An infinite loop occurs when the loop's condition never
           becomes false.

        7. An off-by-one error happens when a loop executes one too
           many or one too few times.

        8. break immediately stops the loop.

        9. continue skips the current iteration and moves to the next
           iteration.

        10. Nested loops are useful for creating tables, patterns,
            and structures with rows and columns.
        */
