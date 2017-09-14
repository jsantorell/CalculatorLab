/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.firstmaven.claculatorslab.Model;

/**
 *
 * @author Jeremy Santorelli
 */
public class TriangleLegLengthCalculator implements Calculator {

    @Override
    public String getAreaOfShape(String leg1, String leg2, String leg3) throws Exception {

        double legA;
        double legB;
        double legC;
        String areaStr = "Unable to process your Request";

        if (leg1.equals("")) {
            legA = 0;
        } else if (Double.isNaN(Double.parseDouble(leg1))) {

            throw new Exception("Your input must be a number");
        } else {
            legA = Double.parseDouble(leg1);
        }

        if (leg2.equals("")) {
            legB = 0;
        } else if (Double.isNaN(Double.parseDouble(leg2))) {

            throw new Exception("Your input must be a number");
        } else {
            legB = Double.parseDouble(leg2);
        }

        if (leg3.equals("")) {
            legC = 0;
        } else if (Double.isNaN(Double.parseDouble(leg3))) {

            throw new Exception("Your input must be a number");
        } else {
            legC = Double.parseDouble(leg3);
        }

        if (legA + legB == 0 || legC + legB == 0 || legA + legC == 0) {

            throw new Exception("To calculate, you must have at least 2 leg measurements");
        } else if (legA > 0 && legB > 0 && legC > 0) {

            throw new Exception("Unable to calculate when 3 legs are defined");

        } else {

            if (legA == 0) {

                legA = Math.pow(legC, 2) - Math.pow(legB, 2);
                double finalLength = Math.sqrt(legA);
                areaStr = Double.toString(finalLength);

            } else if (legB == 0) {

                legB = Math.pow(legC, 2) - Math.pow(legA, 2);
                double finalLength = Math.sqrt(legB);
                areaStr = Double.toString(finalLength);

            } else if (legC == 0) {

                legC = Math.pow(legA, 2) + Math.pow(legB, 2);
                double finalLength = Math.sqrt(legC);
                areaStr = Double.toString(finalLength);

            }

        }
        
        

        return areaStr;

    }

    @Override
    public String getAreaOfShape(String measurement1) {
        return null;
    }

    @Override
    public String getAreaOfShape(String measurement1, String measurement2) {
        return null;
    }

}
