/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.firstmaven.claculatorslab.Model;

/**
 * A Service that sets a message up to be displayed from stored properties
 *
 * @author jerem
 */
public interface Calculator {

    public abstract String getAreaOfShape(String measurement1)throws Exception;
    public abstract String getAreaOfShape(String measurement1, String measurement2)throws Exception ;
    public abstract String getAreaOfShape(String measurement1, String measurement2, String measurement3)throws Exception ;

}
