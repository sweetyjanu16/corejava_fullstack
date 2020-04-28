package com.lwl.corejava.d3;

import java.util.Scanner;

public class d3example {
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter empno");
		int empno =sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name");
		String name = sc.nextLine();
		
		System.out.println("Enter salary");
		float sal= sc.nextFloat();
		System.out.println("HI "+name);
		System.out.println("your empno :"+empno);
		System.out.println("your salary :"+sal);
		System.out.println("your Annual salary :"+(sal*12));
		
		
		
		
		sc.close();
	}

}
