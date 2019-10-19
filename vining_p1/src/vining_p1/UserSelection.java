package vining_p1;

public class UserSelection {

    public static int[] difficultyLevelBounds(int difficultyLevel)
    {
        int[] bounds = new int[2];

        if (difficultyLevel == 1)
        {
            bounds[0] = 1;
            bounds[1] = 9;
        }
        else if (difficultyLevel == 2)
        {
            bounds[0] = 10;
            bounds[1] = 99;
        }
        else if (difficultyLevel == 3)
        {
            bounds[0] = 100;
            bounds[1] = 999;
        }
        else
        {
            bounds[0] = 1000;
            bounds[1] = 9999;
        }

        return bounds;
    }

    public static double problemTypeSelection(int problemType, int[] bounds, int questionNumber)
    {
        double correctAnswer;

        System.out.print("" + questionNumber + ". ");

        switch (problemType)
        {
            case 1:
                correctAnswer = GenerateProblem.addition(bounds);
                break;
            case 2:
                correctAnswer = GenerateProblem.multiplication(bounds);
                break;
            case 3:
                correctAnswer = GenerateProblem.subtraction(bounds);
                break;
            case 4:
                correctAnswer = GenerateProblem.division(bounds);
                break;
            default:
                correctAnswer = GenerateProblem.randomType(bounds);
                break;
        }

        return correctAnswer;
    }
}
