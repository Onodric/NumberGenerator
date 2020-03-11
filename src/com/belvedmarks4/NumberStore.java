package com.belvedmarks4;

/**
 * Class to track the specific constraints of the distribution
 * We can add a constructor override to make the constraints flexible
 */
public class NumberStore {
    private int one;
    private int two;
    private int three;
    private int four;
    private int five;
    private int six;
    private int seven;
    private int eight;
    private int nine;
    private int ten;
    private int eleven;
    private int twelve;
    private int thirteen;
    private int fourteen;
    private int fifteen;
    private int sixteen;
    private int seventeen;
    private int eighteen;
    private int nineteen;
    private int twenty;

    public NumberStore() {
        one = 0;
        two = 0;
        three = 0;
        four = 0;
        five = 0;
        six = 0;
        seven = 0;
        eight = 0;
        nine = 0;
        ten = 0;
        eleven = 0;
        twelve = 0;
        thirteen = 0;
        fourteen = 0;
        fifteen = 0;
        sixteen = 0;
        seventeen = 0;
        eighteen = 0;
        nineteen = 0;
        twenty = 0;
    }

    /**
     * Adds to the count if the quota is not filled
     * @return
     */
    public boolean addAOne() {
        if (this.one < 83000) {
            this.one++;
            return true;
        }
        return false;
    }

    /**
     * Adds to the count if the quota is not filled
     * @return
     */
    public boolean addATwo() {
        if (this.two < 83000) {
            this.two++;
            return true;
        }
        return false;
    }

    /**
     * Adds to the count if the quota is not filled
     * @return
     */
    public boolean addAThree() {
        if (this.three < 83000) {
            this.three++;
            return true;
        }
        return false;
    }

    /**
     * Adds to the count if the quota is not filled
     * @return
     */
    public boolean addAFour() {
        if (this.four < 83000) {
            this.four++;
            return true;
        }
        return false;
    }

    /**
     * Adds to the count if the quota is not filled
     * @return
     */
    public boolean addAFive() {
        if (this.five < 83000) {
            this.five++;
            return true;
        }
        return false;
    }

    /**
     * Adds to the count if the quota is not filled
     * @return
     */
    public boolean addASix() {
        if (this.six < 83000) {
            this.six++;
            return true;
        }
        return false;
    }

    /**
     * Adds to the count if the quota is not filled
     * @return
     */
    public boolean addASeven() {
        if (this.seven < 83000) {
            this.seven++;
            return true;
        }
        return false;
    }

    /**
     * Adds to the count if the quota is not filled
     * @return
     */
    public boolean addAnEight() {
        if (this.eight < 83000) {
            this.eight++;
            return true;
        }
        return false;
    }

    /**
     * Adds to the count if the quota is not filled
     * @return
     */
    public boolean addANine() {
        if (this.nine < 83000) {
            this.nine++;
            return true;
        }
        return false;
    }

    /**
     * Adds to the count if the quota is not filled
     * @return
     */
    public boolean addATen() {
        if (this.ten < 83000) {
            this.ten++;
            return true;
        }
        return false;
    }

    /**
     * Adds to the count if the quota is not filled
     * @return
     */
    public boolean addAnEleven() {
        if (this.eleven < 83000) {
            this.eleven++;
            return true;
        }
        return false;
    }

    /**
     * Adds to the count if the quota is not filled
     * @return
     */
    public boolean addATwelve() {
        if (this.twelve < 83000) {
            this.twelve++;
            return true;
        }
        return false;
    }

    /**
     * Adds to the count if the quota is not filled
     * @return
     */
    public boolean addAThirteen() {
        if (this.thirteen < 1000) {
            this.thirteen++;
            return true;
        }
        return false;
    }

    /**
     * Adds to the count if the quota is not filled
     * @return
     */
    public boolean addAFourteen() {
        if (this.fourteen < 500) {
            this.fourteen++;
            return true;
        }
        return false;
    }

    /**
     * Adds to the count if the quota is not filled
     * @return
     */
    public boolean addAFifteen() {
        if (this.fifteen < 250) {
            this.fifteen++;
            return true;
        }
        return false;
    }

    /**
     * Adds to the count if the quota is not filled
     * @return
     */
    public boolean addASixteen() {
        if (this.sixteen < 100) {
            this.sixteen++;
            return true;
        }
        return false;
    }

    /**
     * Adds to the count if the quota is not filled
     * @return
     */
    public boolean addASeventeen() {
        if (this.seventeen < 50) {
            this.seventeen++;
            return true;
        }
        return false;
    }

    /**
     * Adds to the count if the quota is not filled
     * @return
     */
    public boolean addAnEighteen() {
        if (this.eighteen < 25) {
            this.eighteen++;
            return true;
        }
        return false;
    }

    /**
     * Adds to the count if the quota is not filled
     * @return
     */
    public boolean addANineteen() {
        if (this.nineteen < 10) {
            this.nineteen++;
            return true;
        }
        return false;
    }

    /**
     * Adds to the count if the quota is not filled
     * @return
     */
    public boolean addATwenty() {
        if (this.twenty < 5) {
            this.twenty++;
            return true;
        }
        return false;
    }
}
