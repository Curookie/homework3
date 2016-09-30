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
		int min_num = c;
		
		if(max_num<min_num) {
			min_num=a;
			max_num=c;
			if(max_num<b) {
				max_num=b;
			}
			if(min_num>b) {
				min_num=b;
			}
		}
		System.out.println("가장 큰 수는 "+max_num+" 이고, 가장 작은 수는 "+min_num+" 입니다.");
	}
	
	

}
