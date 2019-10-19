package vining_p1;

public class HandleUserAnswer {

    public static int gradeResponse(double answer, double studentResponse)
    {
        int grade = 0;

        double userResponseDifference;

        double margin = 0.001;

        userResponseDifference = Math.abs(answer - studentResponse);

        if (userResponseDifference <= margin)
        {
            grade = 1;
        }

        feedback(grade);

        return grade;
    }

    private static void feedback(int grade)
    {
        int randInt = Random.generateRandomInt(1, 4);

        if (grade == 1)
        {
            switch (randInt)
            {
                case 1:
                    System.out.println("Nice work!");
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Excellent!");
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Very good!");
                    System.out.println("");
                    break;
                default:
                    System.out.println("Keep up the good work!");
                    System.out.println("");
                    break;
            }
        }
        else
        {
            switch (randInt)
            {
                case 1:
                    System.out.println("No. Please try again.");
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Wrong. Try once more.");
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Don't give up!");
                    System.out.println("");
                    break;
                default:
                    System.out.println("No. Keep trying.");
                    System.out.println("");
                    break;
            }
        }
    }

    public static void calculateScore(int totalCorrect)
    {
        double scorePercentage;

        scorePercentage = (totalCorrect / 10.0) * 100.0;

        System.out.printf("Your score is %.0f%%. " , scorePercentage);

        if (scorePercentage >= 75)
        {
            System.out.println("Congratulations, you are ready to go to the next level!");
        }
        else
        {
            System.out.println("Please ask your teacher for extra help.");
        }
    }
}
