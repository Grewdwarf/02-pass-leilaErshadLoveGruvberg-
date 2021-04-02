package com.LeilaErshadLoveGruvberg.assignment02.test.LeilaELoveG;

import static org.junit.Assert.*;
import java.text.DecimalFormat;
import java.util.Random;
import org.junit.Test;

public class LeilaLoveJUnit_test {
	//implements BasicOperators, AdvancedOperators{

	MyCalculator mc = new MyCalculator();

	Random rnd = new Random();

	double min = -15;
	double max = 15;

	// Formats results as decimals
	static DecimalFormat df = new DecimalFormat("#.##");

	// Tests with RANDOM
	@Test
	public void randomTests() {

		// BASIC OPERATORS
		System.out.println("––––––––––––––| Basic Operators");
		System.out.println("\n ––––– Addition –––––");
		for (int i = 0; i < 4; i++) {
			double firstNumber = (rnd.nextDouble() * -10 + rnd.nextDouble() * 15);
			double secondNumber = (rnd.nextDouble() * 10 + rnd.nextDouble() * 15);
			double result = firstNumber + secondNumber;
			assertEquals(mc.add(firstNumber, secondNumber), result, 0);
			System.out.print("   " + df.format(firstNumber) + " + " + df.format(secondNumber));
			System.out.println("\n	Equals:	" + df.format(result) + "\n");

		}
		double firstNumber = 0;
		double secondNumber = 0;

		{
			System.out.println("\n –––– Subtraction ––––");
			for (int i = 0; i < 4; i++) {
				firstNumber = (rnd.nextDouble() * 10 + rnd.nextDouble() * -10);
				secondNumber = (rnd.nextDouble() * 10 + rnd.nextDouble() * 10);
				double result = firstNumber - secondNumber;
				assertEquals(mc.sub(firstNumber, secondNumber), result, 0);
				System.out.print("   " + df.format(firstNumber) + " - " + df.format(secondNumber));
				System.out.println("\n	Equals:	" + df.format(result) + "\n");
			}
		}
		firstNumber = 0;
		secondNumber = 0;

		{
			System.out.println("\n ––– Multiplication –––");
			for (int i = 0; i < 4; i++) {
				firstNumber = (rnd.nextDouble() * 10 + rnd.nextDouble() * 10);
				secondNumber = (rnd.nextDouble() * -10 + rnd.nextDouble() * 10);
				double result = firstNumber * secondNumber;
				assertEquals(mc.mult(firstNumber, secondNumber), result, 0);
				System.out.print("   " + df.format(firstNumber) + " * " + df.format(secondNumber));
				System.out.println("\n	Equals:	" + df.format(result) + "\n");
			}
		}
		firstNumber = 0;
		secondNumber = 0;

		{
			System.out.println("\n ––––– Division –––––");
			for (int i = 0; i < 4; i++) {
				firstNumber = (rnd.nextDouble() * 10 + rnd.nextDouble() * 10);
				secondNumber = (rnd.nextDouble() * 10 + rnd.nextDouble() * 10);
				double result = firstNumber / secondNumber;
				assertEquals(mc.div(firstNumber, secondNumber), result, 0);
				System.out.print("   " + df.format(firstNumber) + " / " + df.format(secondNumber));
				System.out.println("\n	Equals:	" + df.format(result) + "\n");
			}
		}

		// ADVANCED OPERATORS
		firstNumber = 0;
		secondNumber = 0;
		System.out.println("\n––––––––––––––| Advanced operators ");
		{

			System.out.println("\n ––– POW –––");
			for (int i = 0; i < 4; i++) {
				firstNumber = (rnd.nextDouble() * firstNumber + rnd.nextDouble() * 10);
				secondNumber = (rnd.nextDouble() * secondNumber + rnd.nextDouble() * 10);
				double result = Math.pow(firstNumber, secondNumber);
				assertEquals(Math.pow(firstNumber, secondNumber), result, 0);
				System.out.print("   " + df.format(firstNumber) + " ^ " + df.format(secondNumber));
				System.out.println("\n	Equals:	" + df.format(result) + "	\n");
			}
		}
		firstNumber = 0;
		secondNumber = 0;
		{
			System.out.println("\n ––––– Min –––––");
			for (int i = 0; i < 4; i++) {
				firstNumber = (rnd.nextDouble() * firstNumber + rnd.nextDouble() * 10);
				secondNumber = (rnd.nextDouble() * secondNumber + rnd.nextDouble() * 10);
				double result = Math.min(firstNumber, secondNumber);
				assertEquals(mc.min(firstNumber, secondNumber), result, 0);
				System.out.print("   " + df.format(firstNumber) + " n " + df.format(secondNumber));
				System.out.println("\n	Equals:	" + df.format(result) + "	\n");
			}
		}
		firstNumber = 0;
		secondNumber = 0;
		{
			System.out.println("\n ––– MAX –––");
			for (int i = 0; i < 4; i++) {
				firstNumber = (rnd.nextDouble() * 10 + rnd.nextDouble() * 10);
				secondNumber = (rnd.nextDouble() * -10 + rnd.nextDouble() * 10);
				double result = Math.max(firstNumber, secondNumber);
				assertEquals(Math.max(firstNumber, secondNumber), result, 0);
				System.out.print("   " + df.format(firstNumber) + " x " + df.format(secondNumber));
				System.out.println("\n	Equals:	" + df.format(result) + "	\n");
			}
		}
		firstNumber = 0;
		{
			System.out.println("\n ––– Square Root √ –––");
			for (int i = 0; i < 4; i++) {
				firstNumber = (rnd.nextDouble() * 10 + rnd.nextDouble() * 10);
				double result = Math.sqrt(firstNumber);
				assertEquals(Math.sqrt(firstNumber), result, 0);
				System.out.print("√r of '" + df.format(firstNumber) + "'\t\t(to be exact –>	√r of	" + firstNumber);
				System.out.println("\n	Equals:	" + df.format(result) + "\t\t\tequals:	"+result+")\n");
			}
		}
		firstNumber = 0;
		{
			System.out.println("\n –––– Abs. Value ––––");
			for (int i = 0; i < 4; i++) {
				firstNumber = (rnd.nextDouble() * 10 + rnd.nextDouble() * -20);
				double result = Math.abs(firstNumber);
				assertEquals(Math.abs(firstNumber), result, 0);
				System.out.println("\nAbsolute value of '" + df.format(firstNumber)+"'");
				System.out.println("Equals: " + df.format(result) + "	\n");
			}
		}
	}

	public double add(double operand1, double operand2) {
		return 0;
	}

	public double sub(double operand1, double operand2) {
		return 0;
	}

	public double mult(double operand1, double operand2) {
		return 0;
	}

	public double div(double operand1, double operand2) {
		return 0;
	}

	public double pow(double operand1, double operand2) {
		return 0;
	}

	public double min(double operand1, double operand2) {
		return 0;
	}

	public double max(double operand1, double operand2) {
		return 0;
	}

	public double squareRoot(double operand) {
		return 0;
	}

	public double absValue(double operand) {
		return 0;
	}

}