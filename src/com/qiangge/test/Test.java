package com.qiangge.test;

public class Test {
	public static void test() {
		System.out.println("print test!");
	}

	public static void main(String[] args) {
		((Test) null).test();
		float a = 3.0f;
		int b = (int) a;
		int c=3 ;
		float d=c;
		System.out.println(d);
	}
}
