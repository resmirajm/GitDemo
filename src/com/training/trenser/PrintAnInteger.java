package com.training.trenser;

import java.util.Scanner;

public class PrintAnInteger {

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		Scanner printI = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = printI.nextInt();
        System.out.println("You entered: " + number);
	}

}
