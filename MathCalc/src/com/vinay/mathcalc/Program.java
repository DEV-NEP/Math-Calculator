/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vinay.mathcalc;

import com.vinay.mathcalc.command.MathCommand;
import com.vinay.mathcalc.command.MathFactory;
import java.util.Scanner;

/**
 *
 * @author Leviathan
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Enter 1st no. :");
            double x = input.nextInt();
            System.out.println("Enter 2nd no. :");
            double y = input.nextInt();
            System.out.println("Press + for add");
            System.out.println("Press - for sub");
            System.out.println("Press * for mul");

            MathCommand cmd = MathFactory.get(input.next());
            if (cmd != null) {
                System.out.println(cmd.execute(x, y));
            } else {
                System.out.println("Invalid input");
            }
            // TODO code application logic here
        }
    }
}
