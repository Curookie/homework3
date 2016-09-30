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
		int[] num = new int[3];
		
		for(int i=0;i<num.length;i++) {
			System.out.print((i+1)+"번째 숫자를 입력하세요 : ");
			num[i] = s.nextInt();
		}
		
		check(num);
	}

	private void check(int[] n) {
		// TODO Auto-generated method stub
		int max_num = n[0];
		int min_num = n[0];
		
		for(int i=1;i<n.length;i++) {
			if(n[i]>max_num) {
				max_num=n[i];
			}
			else if(n[i]<min_num) {
				min_num=n[i];
			}
		}
		System.out.println("가장 큰 수는 "+max_num+" 이고, 가장 작은 수는 "+min_num+" 입니다.");
	}
}
