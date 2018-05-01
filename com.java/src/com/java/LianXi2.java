package com.java;

public class LianXi2 {

	public static void main(String[] args) {
		int year=2008;
		if (year/400==0){
		 System.out.println("是闰年");
		}
		if (year/4==0){
			 System.out.println("是闰年");
		}
		else if(year/100!=0) {
			System.out.println("不是闰年");
		}

	}

}
