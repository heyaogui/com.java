package com.java;

public class MyDome {

	public static void main(String[] args) {
		int i=20;
		System.out.println(++i);//先自增后输出
		 i=20;
		System.out.println(i++);//先输出后加1
		System.out.println(i);
		i=20;
		System.out.println(i+=1);//先加1后输出
	}

}
