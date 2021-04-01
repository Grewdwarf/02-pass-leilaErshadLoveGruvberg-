package com.LeilaErshadLoveGruvberg.assignment02.test.LeilaELoveG;

import static org.junit.Assert.*;
import java.text.DecimalFormat;
import java.util.Random;
import org.junit.Test;

public class LeilaLoveJUnit_test {//implements BasicOperators, AdvancedOperators{

	MyCalculator mc = new MyCalculator();
	
//	AdvancedOperators ao = new MyCalcTest2();
//	BasicOperators bo = new MyCalcTest2();

	Random rnd = new Random();

	double max = 15;
	double min = -15;

	// Formats results as decimals
	static DecimalFormat df = new DecimalFormat("#.##");

	// Tests with RANDOM
	@Test
	public void randomTests() {
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
		//System.out.println("––––––––––––––––––––––\n");
		{
			System.out.println("\n –––– Subtraction ––––");

			for (int i = 0; i < 4; i++) {
				firstNumber = (rnd.nextDouble() * 10 + rnd.nextDouble() * 10);
				secondNumber = (rnd.nextDouble() * 10 + rnd.nextDouble() * 10);
				double result = firstNumber - secondNumber;
				assertEquals(mc.sub(firstNumber, secondNumber), result, 0);
				System.out.print("   " + df.format(firstNumber) + " - " + df.format(secondNumber));
				System.out.println("\n	Equals:	" + df.format(result) + "\n");
			}
		}
		firstNumber = 0;
		secondNumber = 0;
		//System.out.println("––––––––––––––––––––––––––––––––––––––––––––\n");
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
		firstNumber = 0;
		secondNumber = 0;
		//System.out.println("––––––––––––––––––––––––––––––––––––––––––––\n");
		{
			System.out.println("\n––– Multiplication –––");

			for (int i = 0; i < 4; i++) {
				firstNumber = (rnd.nextDouble() * 10 + rnd.nextDouble() * 10);
				secondNumber = (rnd.nextDouble() * -10 + rnd.nextDouble() * 10);
				double result = firstNumber * secondNumber;
				assertEquals(mc.mult(firstNumber, secondNumber), result, 0);
				System.out.print("   " + df.format(firstNumber) + " * " + df.format(secondNumber));
				System.out.println("\n	Equals:	" + df.format(result) + "\n");
			}
		}
	}
}