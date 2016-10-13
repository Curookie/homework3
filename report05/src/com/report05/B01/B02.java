package com.report05.B01;

import java.util.Scanner;

public class B02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new B02().start();
	}

	private void start() {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.print("아파트의 분양 면적(제곱미터)을 입력하시오: ");
		double m2_area = s.nextDouble();
		double pyung_area = Double.parseDouble(String.format("%.1f", m2_area / 3.305));
		
		System.out.println("아파트 평형은 "+pyung_area+" 입니다.");
		check(pyung_area);
	}

	private void check(double p) {
		// TODO Auto-generated method stub
		String kind="소형";
		
		if(p>=50.0) {
			kind="대형";
		} else if (p>=30.0) {
			kind="중형";
		} else if (p>=15.0) {
			kind="중소형";
		}
		System.out.println(kind+" 아파트 입니다.");
	}
}
