package com.java;

/**
 * 逻辑运算符
 * 
 * @author Administrator
 *
 */
public class LogicDemo {

	public static void main(String[] args) {
		// 逻辑非 NOT
		System.out.println(true);
		System.out.println(!true);

		int a = 10;
		int b = 20;
		//逻辑与and
		if (++a == 12 & ++b == 22) {
			System.out.println("执行了.");
		}
		System.out.println(a + "" + b);
		a = 10;//重新初始化默认值
		b = 20;
		//短路与（&& 之前的表达式是假的，那么整个 表达式都是假的）
		if (++a == 10 && ++b == 22) {
			System.out.println("执行了.");
		}
		System.out.println(a + "" + b);
		
		a = 10;//重新初始化默认值
		b = 20;
		//短路或(|| 之前的表达式是真的，那么整个 表达式都是真的）
		if (++a == 11 || ++b == 22) {
			System.out.println("执行了.");
		}
		System.out.println(a + "" + b);
	}
}
