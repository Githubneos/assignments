import java.util.Scanner;

public class CourseRegistrationAdvisor {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Part 1


        // Part 2

        System.out.print("Placement score (0-100): ");
        double score = input.nextDouble();

        System.out.print("Prerequisite completed? (true/false): ");
        boolean prerequisiteCompleted = input.nextBoolean();

        System.out.println("Program type:");
        System.out.println("1 - Computer Science");
        System.out.println("2 - Data Science");
        System.out.println("3 - Information Systems");
        System.out.println("4 - Other");

        System.out.print("Enter program type: ");
        int programType = input.nextInt();

        System.out.print("Completed college units: ");
        int completedUnits = input.nextInt();


        // Part 3

        if (score >= 0 && score <= 100) {


            // Part 4

            String level;

            if (score >= 90) {
                level = "Advanced";
            }
            else if (score >= 75) {
                level = "Ready";
            }
            else if (score >= 60) {
                level = "Developing";
            }
            else {
                level = "Needs Preparation";
            }

            System.out.println("Preparation level: " + level);


            // Part 5

            boolean eligible = score >= 75 && prerequisiteCompleted;

            if (eligible) {
                System.out.println("Registration status: Eligible");
            }
            else {
                System.out.println("Registration status: Advisor review required");


                // Part 6

                if (!prerequisiteCompleted) {
                    System.out.println("Complete the prerequisite course first.");
                }
                else if (score < 75) {
                    System.out.println("Additional preparation is recommended.");
                }
            }


            // Part 7

            switch (programType) {
                case 1:
                    System.out.println("Computer Science pathway");
                    break;

                case 2:
                    System.out.println("Data Science pathway");
                    break;

                case 3:
                    System.out.println("Information Systems pathway");
                    break;

                case 4:
                    System.out.println("General elective pathway");
                    break;

                default:
                    System.out.println("Invalid program type");
            }


            // Part 8

            String studentStatus =
                    (completedUnits < 12) ? "New Student" : "Continuing Student";

            System.out.println("Student status: " + studentStatus);


            // Part 9

            System.out.println();
            System.out.println("----- Course Registration Advisor -----");
            System.out.println("Placement score: " + score);
            System.out.println("Preparation level: " + level);
            System.out.println("Prerequisite completed: " + prerequisiteCompleted);

            if (eligible) {
                System.out.println("Registration status: Eligible");
            }
            else {
                System.out.println("Registration status: Advisor review required");
            }


            // Part 10

            boolean earlyPriority =
                    (completedUnits >= 30 && eligible)
                    || (completedUnits >= 60 && prerequisiteCompleted);

            System.out.println("Early registration priority: "
                    + (earlyPriority ? "Yes" : "No"));


            // Part 11

            // For a score of 95, the original program displays D.
            // The conditions are in the wrong order because score >= 60
            // is true before the higher score conditions are checked.
            // The correct order is highest score to lowest score.

            if (score >= 90) {
                System.out.println("A");
            }
            else if (score >= 80) {
                System.out.println("B");
            }
            else if (score >= 70) {
                System.out.println("C");
            }
            else if (score >= 60) {
                System.out.println("D");
            }


            // Part 12

            int units = 6;

            if (units >= 12) {
                System.out.println("Continuing Student");
            }


            // Part 13

        }
        else {
            System.out.println("Invalid placement score.");
        }

        input.close();
    }
}



/*
1. The placement score should be validated first to make sure it is between 0 and 100 before classifying it.
2. The order matters because Java checks the conditions from top to bottom and stops at the first true condition.
3. It requires the score to be at least 75 and the prerequisite to be completed.
4. A nested if statement is useful when one decision depends on another decision.
5. switch is appropriate because the program type has several specific choices.
6. The default branch handles any value that does not match the available choices.
7. The conditional operator returns one of two values depending on whether the condition is true or false.
8. Boundary values help make sure the program works correctly at the exact points where the result changes.
*/
