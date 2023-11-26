package com.example;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class App {
    private static DecimalFormat df2;

    static {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        df2 = new DecimalFormat("#.##", symbols);
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public String divide(double a, double b) {
        if (b == 0) {
            return "NaN";
        } else {
            return df2.format(a / b);
        }
    }

    public String returnTwoChars(String str) {
        if (str == null || str.length() < 2) {
            return str;
        } else {
            return str.substring(0, 2);
        }
    }

    public Double div(Double a, Double b) {
        if (a == null || b == null || b == 0) {
            return null;
        } else {
            return Double.valueOf(df2.format(a / b));
        }
    }
}
