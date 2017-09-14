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
public class RectangleCalculator implements Calculator{

    @Override
    public String getAreaOfShape(String length, String width) throws Exception{
        
        
        int area = Integer.parseInt(width.trim()) * Integer.parseInt(length.trim());
        
        String areaStr = Integer.toString(area);
        
        return areaStr;
        
    }

    @Override
    public String getAreaOfShape(String measurement1) throws Exception {
        throw new Exception("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getAreaOfShape(String measurement1, String measurement2, String measurement3) throws Exception {
        throw new Exception("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
