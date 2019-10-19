package vining_p1;

public class GenerateProblem {

    public static double multiplication(int[] bounds)
    {
        int lowerLimit = bounds[0];
        int upperLimit = bounds[1];

        int randomNumber1 = Random.generateRandomInt(lowerLimit, upperLimit);

        int randomNumber2 = Random.generateRandomInt(lowerLimit, upperLimit);

        double answer = randomNumber1 * randomNumber2;

        String problem = "What is " + randomNumber1 + " multiplied by " + randomNumber2 + "?";

        System.out.println(problem);

        return answer;
    }

    public static double division(int[] bounds)
    {
        int lowerLimit = bounds[0];
        int upperLimit = bounds[1];

        int randomNumber1 = Random.generateRandomInt(lowerLimit, upperLimit);

        int randomNumber2 = Random.generateRandomInt(lowerLimit, upperLimit);

        String problem = "What is " + randomNumber1 + " divided by " + randomNumber2 + "? (Please round to 3 decimal places)";

        double answer = (double) randomNumber1 / (double) randomNumber2;

        System.out.println(problem);

        return answer;
    }

    public static double addition(int[] bounds)
    {
        int lowerLimit = bounds[0];
        int upperLimit = bounds[1];

        int randomNumber1 = Random.generateRandomInt(lowerLimit, upperLimit);

        int randomNumber2 = Random.generateRandomInt(lowerLimit, upperLimit);

        double answer = randomNumber1 + randomNumber2;

        String problem = "What is " + randomNumber1 + " added to " + randomNumber2 + "?";

        System.out.println(problem);

        return answer;
    }

    public static int subtraction(int[] bounds)
    {
        int lowerLimit = bounds[0];
        int upperLimit = bounds[1];

        int randomNumber1 = Random.generateRandomInt(lowerLimit, upperLimit);

        int randomNumber2 = Random.generateRandomInt(lowerLimit, upperLimit);

        int answer = randomNumber1 - randomNumber2;

        String problem = "What is " + randomNumber2 + " subtracted from " + randomNumber1 + "?";

        System.out.println(problem);

        return answer;
    }

    public static double randomType(int[] bounds)
    {
        int randInt = Random.generateRandomInt(1, 4);

        double answer = 0.0;

        if (randInt == 1)
        {
            answer = multiplication(bounds);
        }
        else if (randInt == 2)
        {
            answer = division(bounds);
        }
        else if (randInt == 3)
        {
            answer = addition(bounds);
        }
        else
        {
            answer = subtraction(bounds);
        }

        return answer;
    }

}


