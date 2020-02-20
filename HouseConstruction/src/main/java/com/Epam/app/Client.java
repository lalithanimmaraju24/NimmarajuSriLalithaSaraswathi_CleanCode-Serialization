package com.Epam.app;

import java.io.IOException;

public class Client {
    public static void main(String args[]) throws IOException {
        CostCalculationMain cal = new CostCalculationMain();
        if (cal.read())
            cal.displayResultCost();
    }
}
