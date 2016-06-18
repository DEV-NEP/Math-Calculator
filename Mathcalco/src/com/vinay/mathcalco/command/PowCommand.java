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
public class PowCommand extends MathCommand{

    @Override
    public double execute(double x, double y) {
        double total=1;
        for(int i=0;i<y;i++){
            total*=x;
        }
        return total; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
