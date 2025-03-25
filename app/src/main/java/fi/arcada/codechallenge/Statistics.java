package fi.arcada.codechallenge;

import java.util.ArrayList;

public class Statistics {

    public static double calcMean(ArrayList<Double> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return 0.0;
        }

        double sum = 0.0;
        for (double num : numbers) {
            sum += num;
        }

        return sum / numbers.size();
    }
}