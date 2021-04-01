package com.LeilaErshadLoveGruvberg.assignment02.test.LeilaELoveG;

import static org.junit.Assert.*;
import java.text.DecimalFormat;
import java.util.Random;

import org.junit.Test;

public class LeilaLoveJUnit_test {

	AdvancedOperators ao = new MyCalcTest2();
	BasicOperators bo = new MyCalcTest2();

	Random rnd = new Random();

	double max = 15;
	double min = -15;

	static DecimalFormat df = new DecimalFormat("#.##");

	@Test
	// Tests with RANDOM
	public void randomTests() {
		System.out.println("\n–––– Addition: ––––");

		for (int i = 0; i < 4; i++) {
			double firstNumber = (rnd.nextDouble() * 10 + rnd.nextDouble() * 10);
			double secondNumber = (rnd.nextDouble() * -10 + rnd.nextDouble() * 10);
			double result = firstNumber + secondNumber;
			assertEquals(bo.add(firstNumber, secondNumber), result, 0);
			System.out.print("   " + df.format(firstNumber) + " + " + df.format(secondNumber));
			System.out.println("\n	Equals:	" + df.format(result) + "\n");

		}
		double firstNumber = 0;
		double secondNumber = 0;
		System.out.println("––––––––––––––––––––––\n");
		{
			System.out.println("\n–––– Subtraction: ––––");

			for (int i = 0; i < 4; i++) {
				firstNumber = (rnd.nextDouble() * 10 + rnd.nextDouble() * 10);
				secondNumber = (rnd.nextDouble() * -10 + rnd.nextDouble() * 10);
				double result = firstNumber - secondNumber;
				assertEquals(bo.sub(firstNumber, secondNumber), result, 0);
				System.out.print("   " + df.format(firstNumber) + " - " + df.format(secondNumber));
				System.out.println("\n	Equals:	" + df.format(result) + "\n");
			}
			System.out.println("––––––––––––––––––––––");
		}
		firstNumber = 0;
		secondNumber = 0;
		System.out.println("––––––––––––––––––––––\n");
		{
			System.out.println("\n–––– Division: ––––");

			for (int i = 0; i < 4; i++) {
				firstNumber = (rnd.nextDouble() * 10 + rnd.nextDouble() * 10);
				secondNumber = (rnd.nextDouble() * -10 + rnd.nextDouble() * 10);
				double result = firstNumber / secondNumber;
				assertEquals(bo.div(firstNumber, secondNumber), result, 0);
				System.out.print("   " + df.format(firstNumber) + " / " + df.format(secondNumber));
				System.out.println("\n	Equals:	" + df.format(result) + "\n");
			}
			System.out.println("––––––––––––––––––––––");
		}
		firstNumber = 0;
		secondNumber = 0;
		System.out.println("––––––––––––––––––––––\n");
		{
			System.out.println("\n–––– Multiplication: ––––");

			for (int i = 0; i < 4; i++) {
				firstNumber = (rnd.nextDouble() * 10 + rnd.nextDouble() * 10);
				secondNumber = (rnd.nextDouble() * -10 + rnd.nextDouble() * 10);
				double result = firstNumber * secondNumber;
				assertEquals(bo.mult(firstNumber, secondNumber), result, 0);
				System.out.print("   " + df.format(firstNumber) + " * " + df.format(secondNumber));
				System.out.println("\n	Equals:	" + df.format(result) + "\n");
			}
			System.out.println("––––––––––––––––––––––");
		}
	}
}