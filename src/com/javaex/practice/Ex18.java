package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("화씨: ");
		double fah = sc.nextDouble();
		
		double cel = 5.0/9.0 * (fah-32);
		System.out.println("화씨 " + fah + " 의 섭씨 온도는 " + cel + " 입니다.");
			
		sc.close();
		
		
		
	}

}
