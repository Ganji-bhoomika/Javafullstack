package com.multiplication;

import java.util.Scanner;

public class Multiplication {
	public static void main(String[] args) {
		int a,b,mul;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		mul=a*b;
		System.out.println("The mul of two number"+mul);
		
	}

}
