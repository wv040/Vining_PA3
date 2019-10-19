package vining_p1;

import java.security.SecureRandom;

public class Random {

    public static int generateRandomInt(int lowerLimit, int upperLimit)
    {
        int randomInt;

        SecureRandom rand = new SecureRandom();

        randomInt = rand.nextInt((upperLimit - lowerLimit)+ 1) + lowerLimit;

        return randomInt;
    }
}
