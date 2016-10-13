package com.report05.B01;

import java.util.Scanner;

public class B03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new B03().start();
	}

	private void start() {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.print("월을 입력하시오 : ");
		int month = s.nextInt();
		System.out.print("일을 입력하시오 : ");
		int day = s.nextInt();
		if(!check(month, day)) System.out.println("잘못 입력하셨습니다.");
	}

	private boolean check(int m, int d) {
		// TODO Auto-generated method stub
		int day_count = 0;
		int mSize = 0;
		
		if(m>12 || d>31) return false;
		
		for(int i=1;i<13;i++) {
			
			
			if(i==2) mSize=28;
			else if(i==4||i==6||i==9||i==11) mSize=30;
			else mSize=31;
			
			if(i==m) {
				if(d>mSize) return false;
				day_count+=d;
				System.out.println("이 날짜는 1년 중 "+day_count+" 번째 날에 해당됩니다.");
				return true;
			}
			else {
				day_count+=mSize;
			}
				
		}
		return false;
	}
}
