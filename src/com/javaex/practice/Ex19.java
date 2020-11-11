package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		long Lspeed = 300000L;
		int Oneday = 60 * 60 * 24;
		
		System.out.println("빛이 1년 동안 가는 거리는 " + Oneday * 365 * Lspeed + " km 입니다.");
		
		
		sc.close();
		
	}

}
