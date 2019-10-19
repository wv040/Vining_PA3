package vining_p1;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int difficultyLevel;
        int problemType;
        double correctAnswer = 0.0;
        double userResponse;
        int grade;
        int[] bounds = new int[2];
        String userContinueQuery = "y";

        bounds[0] = 1;
        bounds[1] = 9;

        while (userContinueQuery.compareTo("n") != 0)
        {
            int totalCorrect = 0;

            System.out.println("");

            for (int i = 0; i < 30; i++)
            {
                System.out.print("-");
            }
            System.out.println("");

            System.out.println("Welcome to Arithmetic Practice");
            for (int i = 0; i < 30; i++)
            {
                System.out.print("-");
            }
            System.out.println("");
            System.out.println("Please select a difficulty level from 1 (easiest) to 4 (hardest): ");

            difficultyLevel = in.nextInt();

            System.out.println("");

            System.out.println("Please select a type of arithmetic problem from the following options: ");
            System.out.println("1 (addition)");
            System.out.println("2 (multiplication)");
            System.out.println("3 (subtraction)");
            System.out.println("4 (division)");
            System.out.println("5 (random assortment)");

            problemType = in.nextInt();

            System.out.println("");

            bounds = UserSelection.difficultyLevelBounds(difficultyLevel);

            for (int i = 1; i <= 10; i++)
            {
                correctAnswer = UserSelection.problemTypeSelection(problemType, bounds, i);

                userResponse = in.nextDouble();

                grade = HandleUserAnswer.gradeResponse(correctAnswer, userResponse);

                if (grade == 1)
                {
                    totalCorrect++;
                }
            }
            HandleUserAnswer.calculateScore(totalCorrect);

            System.out.println("");
            System.out.println("Would you like to continue? (y/n): ");
            userContinueQuery = in.next();
        }

    }
}
