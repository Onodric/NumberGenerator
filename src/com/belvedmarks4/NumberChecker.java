package com.belvedmarks4;

import java.util.ArrayList;

/**
 * Class to track the random numbers
 */
public class NumberChecker {

    private ArrayList<Integer> storage;
    private NumberGenerator ng;

    public ArrayList<Integer> getStorage() {
        return storage;
    }

    public NumberChecker() {
        this.storage = new ArrayList<>();
        this.ng = new NumberGenerator();
    }

    /**
     * Method to adda number to the holding arraylist.
     * The consecutive constraint can be countered easily until the halfway point of the array filling.
     * After that point, this method chooses a random index at which to insert the candidate number
     * @param num
     * @param maxSize
     */
    public void addANumber(int num, int maxSize) {
        if (storage.size() < maxSize / 2) {
            this.storage.add(num);
            return;
        }
        while (true) {
            int i = this.ng.getOneRandomInt(0, storage.size());
            if (i == 0 || i == storage.size() - 1 || (storage.get(i - 1) != num && storage.get(i) != num)) {
                this.storage.add(i, num);
                return;
            }
        }
    }
}
