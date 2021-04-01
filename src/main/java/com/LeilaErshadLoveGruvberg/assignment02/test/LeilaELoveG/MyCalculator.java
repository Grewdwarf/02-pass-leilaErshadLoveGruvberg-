package com.LeilaErshadLoveGruvberg.assignment02.test.LeilaELoveG;

import javax.swing.JOptionPane;
//import javax.swing.*;
//import java.awt.event.*;

public class MyCalculator {//implements AdvancedOperators, BasicOperators {
	double operand1, operand2, result;
	char operator;

	boolean ok; // Control for wrong operator and division by 0

	public void runMyCalculator() {
		do {
			ok = true;

			operand1 = Double.parseDouble(JOptionPane.showInputDialog("Enter first operand"));
			System.out.print(operand1 + "\t");

			String operatorAsString = JOptionPane.showInputDialog(
					"Choose operator: + - * / ^ (n for min) (x for max) (r for root) (a for abs) (q to terminate)");
			operator = operatorAsString.charAt(0);
			System.out.print(operator + "\t");

			operand2 = Double.parseDouble(JOptionPane.showInputDialog("Enter second operand"));
			System.out.print(operand2 + "\t");

			switch (operator) {
			case '+':
				result = add(operand1, operand2);
				break;
			case '-':
				result = sub(operand1, operand2);
				break;
			case '*':
				result = mult(operand1, operand2);
				break;
			case '/':
				if (operand2 != 0)
					result = div(operand1, operand2);
				else {
					ok = false;
					JOptionPane.showMessageDialog(null, "Division by 0 is not defined! Try again!");
					System.out.println("\tDivision by 0 is not defined! Try again!");
				}
				break;
			case '^':
				result = pow(operand1, operand2);
				break;
			case 'n':
				result = min(operand1, operand2);
				break;
			case 'x':
				result = max(operand1, operand2);
				break;
			case 'r':
				result = squareRoot(operand1);
				break;
			case 'a':
				result = absValue(operand1);
				break;
			case 'q': // Terminating operator
				System.out.println("\n\nq chosen as operand: Program terminated!\n");
				System.exit(0);
				break;
			default:
				ok = false;
				JOptionPane.showMessageDialog(null, "Wrong character for operator. Try again!");
				System.out.println("\tWrong character for operator. Try again!");
				break;
			}
			if (ok)
				System.out.println("=\t" + result); // Not divided by 0 and no wrong operator
		} while (operator != 'q'); // Terminates loop if 'q' entered

		System.exit(0);
	}

	public double add(double operand1, double operand2) {
		return operand1 + operand2;
	}

	public double sub(double operand1, double operand2) {
		return operand1 - operand2;
	}

	public double mult(double operand1, double operand2) {
		return operand1 * operand2;
	}

	public double div(double operand1, double operand2) {
		return operand1 / operand2;
	}

	public double pow(double operand1, double operand2) {
		return Math.pow(operand1, operand2);
	}

	public double min(double operand1, double operand2) {
		return Math.min(operand1, operand2);
	}

	public double max(double operand1, double operand2) {
		return Math.max(operand1, operand2);
	}

	public double squareRoot(double operand) {
		return Math.sqrt(operand1);
	}

	public double absValue(double operand) {
		return Math.abs(operand1);
	}
}