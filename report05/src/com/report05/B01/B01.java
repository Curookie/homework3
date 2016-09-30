package com.report05.B01;

import java.util.Scanner;

public class B01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new B01().start();
	}

	private void start() {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요 : ");
		int num1 = s.nextInt();
		System.out.print("두번째 숫자를 입력하세요 : ");
		int num2 = s.nextInt();
		System.out.print("세번째 숫자를 입력하세요 : ");
		int num3 = s.nextInt();
		check(num1, num2, num3);
	}

	private void check(int a, int b, int c) {
		// TODO Auto-generated method stub
		int max_num = a;
		int min_num = b;
		
		if(a>b) {
			if(b>c) {
				max_num=a;
				min_num=c;
			}
			else {
				
			}
		}
		
	}
	
	

}
