/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vinay.mathcalco.command;
import java.util.HashMap;
/**
 *
 * @author Leviathan
 */
public class MathFactory {
    
    public static MathCommand get(String key){
        HashMap<String,MathCommand> hash=new HashMap<>();
        hash.put("+", new AddCommand());
        hash.put("-", new SubCommand());
        hash.put("*", new MulCommand());
        hash.put("/", new DivCommand());
        hash.put("^", new PowCommand());
        hash.put("x", new ExitCommand());
        if(hash.containsKey(key))
            return hash.get(key);
        else
        return null;
    }
    
}
