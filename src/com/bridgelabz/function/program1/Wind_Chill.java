package com.bridgelabz.function.program1;

import com.bridgelabz.function.program.logic.Function_Logic;

public class Wind_Chill {

	public static void main(String[] args) {
		Function_Logic function = new Function_Logic();
		System.out.println("Enter the value of temperature : ");
		double t = function.getDoubleValue(); 
		System.out.println("Enter the value of speed : ");
		double w = function.getDoubleValue();
		function.getWindChill(t, w);
      
	}

}
