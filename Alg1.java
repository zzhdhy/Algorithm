package com.rjgz;

import java.util.Random;

public class Alg1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		short m = 0, n = 0, ov = 0;
		char symbol;//操作符号
		Random rand = new Random();
		for (int i = 0; i < 50; i++) {
			// 用生成0或1随机数代表加减号
			ov = (short) rand.nextInt(2);
			// 生成随机100以内的操作数m，n
			m = (short) rand.nextInt(101);
			n = (short) rand.nextInt(101);
			if (ov == 1) {// 判断操作符号
				symbol = '+';
			} else {
				symbol = '-';
			}
			// 输出算式
			System.out.println("" + (i + 1) + ":\t" + m + symbol + n + "=");
		}
	}
}
