package com.bridgelabz.function.program1;

import com.bridgelabz.function.program.logic.Function_Logic;

public class Two_D_Array {

	public static void main(String[] args) {
		Function_Logic function = new Function_Logic();
		int rows = function.getIntValue();
		System.out.println("Enter the no. of rows");
		int column = function.getIntValue();
		System.out.println("Enter the no. of column");
		function.two_D_Array(rows, column);
	}

}
