package com.belvedmarks4;

public class Main {

    public static void main(String[] args) {

        String fileName = "./test.output";
        int limit = 997940;

        NumberStore numberStore = new NumberStore();
        NumberGenerator numberGenerator = new NumberGenerator();
        NumberChecker numberChecker = new NumberChecker();
        FileHandler fh = new FileHandler(fileName);

        // Loop until we reach the limit
        // Get a number and test if it can be inserted
        while (numberChecker.getStorage().size() < limit) {
            int candidateNum = numberGenerator.getOneRandomInt(1, 20);
            switch (candidateNum) {
                case 1:
                    if (numberStore.addAOne()) {
                        numberChecker.addANumber(candidateNum, limit);
                    }
                    continue;
                case 2:
                    if (numberStore.addATwo()) {
                        numberChecker.addANumber(candidateNum, limit);
                    }
                    continue;
                case 3:
                    if (numberStore.addAThree()) {
                        numberChecker.addANumber(candidateNum, limit);
                    }
                    continue;
                case 4:
                    if (numberStore.addAFour()) {
                        numberChecker.addANumber(candidateNum, limit);
                    }
                    continue;
                case 5:
                    if (numberStore.addAFive()) {
                        numberChecker.addANumber(candidateNum, limit);
                    }
                    continue;
                case 6:
                    if (numberStore.addASix()) {
                        numberChecker.addANumber(candidateNum, limit);
                    }
                    continue;
                case 7:
                    if (numberStore.addASeven()) {
                        numberChecker.addANumber(candidateNum, limit);
                    }
                    continue;
                case 8:
                    if (numberStore.addAnEight()) {
                        numberChecker.addANumber(candidateNum, limit);
                    }
                    continue;
                case 9:
                    if (numberStore.addANine()) {
                        numberChecker.addANumber(candidateNum, limit);
                    }
                    continue;
                case 10:
                    if (numberStore.addATen()) {
                        numberChecker.addANumber(candidateNum, limit);
                    }
                    continue;
                case 11:
                    if (numberStore.addAnEleven()) {
                        numberChecker.addANumber(candidateNum, limit);
                    }
                    continue;
                case 12:
                    if (numberStore.addATwelve()) {
                        numberChecker.addANumber(candidateNum, limit);
                    }
                    continue;
                case 13:
                    if (numberStore.addAThirteen()) {
                        numberChecker.addANumber(candidateNum, limit);
                    }
                    continue;
                case 14:
                    if (numberStore.addAFourteen()) {
                        numberChecker.addANumber(candidateNum, limit);
                    }
                    continue;
                case 15:
                    if (numberStore.addAFifteen()) {
                        numberChecker.addANumber(candidateNum, limit);
                    }
                    continue;
                case 16:
                    if (numberStore.addASixteen()) {
                        numberChecker.addANumber(candidateNum, limit);
                    }
                    continue;
                case 17:
                    if (numberStore.addASeventeen()) {
                        numberChecker.addANumber(candidateNum, limit);
                    }
                    continue;
                case 18:
                    if (numberStore.addAnEighteen()) {
                        numberChecker.addANumber(candidateNum, limit);
                    }
                    continue;
                case 19:
                    if (numberStore.addANineteen()) {
                        numberChecker.addANumber(candidateNum, limit);
                    }
                    continue;
                case 20:
                    if (numberStore.addATwenty()) {
                        numberChecker.addANumber(candidateNum, limit);
                    }
            }
        }

        // Write to file after distribution
        for (int i = 0; i < numberChecker.getStorage().size(); i++) {
            int num = numberChecker.getStorage().get(i);
            fh.writeLineToFile(num);
            if (num == 20) {
                System.out.println("Line " + (i + 1) + " contains a 20!");
            }
        }
    }
}
