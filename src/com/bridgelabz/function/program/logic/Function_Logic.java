package com.bridgelabz.function.program.logic;

import java.io.PrintWriter;
import java.util.Scanner;

public class Function_Logic {
	Scanner input;

	public Function_Logic() {
		input = new Scanner(System.in);
	}

	public int getIntValue() {
		return input.nextInt();
	}

	public void getQuadraticRoots(double a, double b, double c) {
		double delta = Math.pow(b, 2) - (4 * a * c);
		double root1 = ((-1 * b) + Math.sqrt(delta)) / (2 * a);
		double root2 = ((-1 * b) - Math.sqrt(delta)) / (2 * a);
		System.out.println("root1 of x : " + root1);
		System.out.println("root2 of x : " + root2);
	}

	// 2) program to calculate Euclidean distance
	public void getDistance(int x, int y) {
		double distance = Math.sqrt(x * x + y * y);
		System.out.println("Euclidean distance is : " + distance);
	}

	// 3)program to calculate Wind chill
	public void getWindChill(double t, double v) {
		if (v < 120 || v > 3 && t < 50) {
			double w = 35.34 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
			System.out.println("Wind chill is :  " + w);
		} else {
			System.out.println("Enter the value of temperature and speed in given range ");
		}
	}

	public double getDoubleValue() {
		return input.nextDouble();
	}

	// 4) program to 2d array
	public Integer[][] two_D_Array(int rows, int column) {
		Integer arr[][] = new Integer[rows][column];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < column; j++) {
				arr[i][j] = getIntValue();
			}
		}
		return arr;
	}

	public <t> void printArray(t[][] array, int m, int n) {
		// use of t is it takes generic(any type of data) values
		PrintWriter writer = new PrintWriter(System.out);
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				writer.write(" arr[" + i + "][" + j + "] = " + array[i][j]);
				writer.flush();
			}
			System.out.println();
		}
	}
}
