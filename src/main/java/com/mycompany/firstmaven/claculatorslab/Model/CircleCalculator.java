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
public class CircleCalculator implements Calculator {

    @Override
    public String getAreaOfShape(String diameter) throws Exception {
        String areaStr = "Unable to process your request";
        try {
            Double.isNaN(Double.parseDouble(diameter.trim()));
        } catch (Exception ex) {
             throw new Exception("Your input must be a number");
        }
     

            double radius = Double.parseDouble(diameter.trim());
            double circleArea = Math.PI * Math.pow(radius, 2);

            areaStr = Double.toString(circleArea);
        
        return areaStr;

    }

    @Override
    public String getAreaOfShape(String measurement1, String measurement2) throws Exception {
        throw new Exception("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getAreaOfShape(String measurement1, String measurement2, String measurement3) throws Exception {
        throw new Exception("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
