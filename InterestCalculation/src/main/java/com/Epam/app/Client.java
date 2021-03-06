package com.Epam.app;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Client {
    public static void main(String args[]) throws IOException {
        Scanner scan = new Scanner(System.in);
        OutputStreamWriter streamWriter = new OutputStreamWriter(System.out);
        InterestCalculation intrcal = new InterestCalculationMain();
        try {
            intrcal.readInput();
            streamWriter.write("\n1)Calculate simple interest.\n2)Calculate compound interest\nEnter your choice: ");
            streamWriter.flush();
            int c = scan.nextInt();
            intrcal.displayResult(c);
        } catch (Exception e) {
            streamWriter.write("\nInvalid Input ");
            streamWriter.flush();
        }
    }
}
