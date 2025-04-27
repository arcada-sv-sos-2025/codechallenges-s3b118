package fi.arcada.codechallenge;

import java.util.ArrayList;

public class Statistics {

    public static double[] movingAvg(double[] values, int window) {
        if (values == null || values.length < window || window <= 0) {
            return new double[0];
        }

        double[] sma = new double[values.length - window + 1];
        for (int i = window - 1; i < values.length; i++) {
            double sum = 0.0;
            for (int j = i - window + 1; j <= i; j++) {
                sum += values[j];
            }
            sma[i - window + 1] = sum / window;
        }
        return sma;
    }
}