package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름: ");
		int r = sc.nextInt();
		
		final double pi = 3.14;
		System.out.println("구의 부피는: " + pi * (r*r*r) * 4/3);
		
		sc.close();
		
		
		
	}

}
