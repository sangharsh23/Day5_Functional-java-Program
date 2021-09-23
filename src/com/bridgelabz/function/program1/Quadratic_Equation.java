package com.bridgelabz.function.program1;

import com.bridgelabz.function.program.logic.Function_Logic;

public class Quadratic_Equation {

	public static void main(String[] args) {
	   Function_Logic function = new Function_Logic();
       System.out.println("Enter the value of a :");
       double a = function.getDoubleValue();
       System.out.println("Enter the value of b :");
       double b = function.getDoubleValue();
       System.out.println("Enter the value of c : ");
       double c = function.getDoubleValue();
       function.getQuadraticRoots(a, b, c);
      
	}

}
