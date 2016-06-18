/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vinay.mathcalc.command;

/**
 *
 * @author Leviathan
 */
public class MathFactory{

   public static MathCommand get(String para){
       if(para.equals("+")){
           return new AddCommand();
       }
       else if(para.equals("-")){
           return new SubCommand();
       }
       else if(para.equals("*")){
           return new MulCommand();
       }
       else if(para.equals("^")){
           return new PowCommand();
       }
       else if(para.equals("/")){
           return new DivideCommand();
       }
       else if(para.equals("x")){
           return new ExitCommand();
       }
           return null;
   }
    
}
