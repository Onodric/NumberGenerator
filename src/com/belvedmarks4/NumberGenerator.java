package com.belvedmarks4;

import java.security.SecureRandom;
import java.util.Random;

public class NumberGenerator {
    /**
     * Returns a random number between the constraints
     * @param min
     * @param max
     * @return
     */
    public int getOneRandomInt(int min, int max) {
        Random numGen = new SecureRandom();
        return numGen.nextInt(max-min+1) + min;
    }
}
