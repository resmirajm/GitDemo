package com.training.trenser;

public class SwapTwoNumbers {

	public static void main(String[] args) 
	{
      int a=15;
      int b=25;
      
      System.out.println("--Before Swapping--");
      System.out.println("a = " + a);
      System.out.println("b = " + b);
      
      a=a+b;
      b=a-b;
      a=a-b;
      
      System.out.println("--After Swapping--");
      System.out.println("Value of a = "+a+"");
      System.out.println("Value of b = "+b+"");
	}

}
