/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vinay.mathcalco.command;

/**
 *
 * @author Leviathan
 */
public class ExitCommand extends MathCommand{

    @Override
    public double execute(double x, double y) {
        System.exit(0);
        return 0;//To change body of generated methods, choose Tools | Templates.
    }
    
    
}
