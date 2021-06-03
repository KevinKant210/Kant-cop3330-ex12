package org.example;


import java.util.Scanner;
import java.text.DecimalFormat;

public class CalculateInterest {
    Scanner reader = new Scanner(System.in);
    DecimalFormat formatter = new DecimalFormat("###.##");
    float principle,interest;
    float numyears;

    public void getValues(){
        System.out.print("Enter the the principle: ");
        principle = reader.nextFloat();
        System.out.print("Enter the Interest rate as a whole number:" );
        interest = reader.nextFloat()/100;
        System.out.print("Enter the number of years: ");
        numyears = reader.nextFloat();
    }

    public void calcInterest() {
        float total = principle * (1 + (numyears * interest));
        total = Float.parseFloat(formatter.format(total));
        System.out.printf("After %.0f years at  %.2f%% interest, the investment will be worth %.2f", numyears,interest,total);
    }

}
