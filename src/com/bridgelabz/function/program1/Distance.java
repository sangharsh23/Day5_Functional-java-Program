package com.bridgelabz.function.program1;

import com.bridgelabz.function.program.logic.Function_Logic;

public class Distance {

	public static void main(String[] args) {
		Function_Logic Function = new Function_Logic();
        System.out.println("Enter the value of x ");
        int x = Function.getIntValue();
        System.out.println("Enter the value of y ");
        int y = Function.getIntValue();
        Function.getDistance(x, y);
	}

}
