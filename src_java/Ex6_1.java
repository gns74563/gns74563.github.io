package org.javaro.lecture;

public class Ex6_1 {
	public static void main(String [] args)
	{
		System.out.println("김지훈" + "-" + "20151623" + "-" + "실습");
		int d=sum(1,2,3);
		System.out.println("d="+d);
	}
	static int sum(int a, int b, int c)
	{
		int total = a+b+c;
		return total;
	}
}
