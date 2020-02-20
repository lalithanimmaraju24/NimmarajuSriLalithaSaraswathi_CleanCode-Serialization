package com.Epam.app;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class CostCalculationMain implements CostCalculation {

    private double area;
    private String sMaterial;
    private String auto;
    private Scanner scan;
    private OutputStreamWriter streamWriter;
    

    public CostCalculationMain() {
        streamWriter = new OutputStreamWriter(System.out);
        scan = new Scanner(System.in);
       
    }

    @Override
    public double calculateCost(double area, String choiceMaterial, String choiceAutomation) throws IOException {
    	Map<String,Integer> MY_MAP = new HashMap<String,Integer>();
        MY_MAP.put("normal standard materials no",1200);
        MY_MAP.put("above standard materials no",1500);
        MY_MAP.put("high standard materials no",1800);
        MY_MAP.put("high standard materials fully",1800);

    	String s = "";
        s = s + choiceMaterial + " standard materials " + choiceAutomation;
        double val = 0;
        try {

            val = MY_MAP.get(s) * area;
        } catch (Exception e) {
        }
        return val;
    }

    @Override
    public boolean read() throws IOException {

        Scanner scan = new Scanner(System.in);
        try {
            streamWriter.write("Enter Material (normal or above or high ):\t");
            streamWriter.flush();
            sMaterial = scan.nextLine();
            streamWriter.write("Enter automatic ( fully or no ) :\t");
            streamWriter.flush();
            auto = scan.nextLine();
            streamWriter.write("Enter area :\t");
            streamWriter.flush();
            area = scan.nextDouble();
        } catch (Exception e) {
            streamWriter.write("Invalid input\n");
            streamWriter.flush();
            return false;
        }
        return true;
    }

    @Override
    public void displayResultCost() throws IOException {
        streamWriter.write("Total cost :\t");
        streamWriter.write(String.valueOf(calculateCost(area, sMaterial, auto)) + "INR");
        streamWriter.flush();
    }
}
