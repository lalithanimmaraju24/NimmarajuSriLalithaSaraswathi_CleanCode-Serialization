package com.Epam.app;

import java.io.IOException;


public interface CostCalculation {
	
 

    double calculateCost(double area, String choiceMaterial, String choiceAutomation) throws IOException;

    boolean read() throws IOException;

    void displayResultCost() throws IOException;
}
