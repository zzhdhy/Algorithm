package com.rjgz;

import java.util.Random;

public class Alg3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		short m = 0, n = 0, ov = 0;
		int[] result = new int[50];// 定义一个大小50的数组存放50道算式的结果
		int count = 0;// 计数器
		char symbol;// 操作符号
		Random rand = new Random();
		System.out.println("50道100以内加减法习题：");
		for (int i = 0; i < 50; i++) {
			ov = (short) rand.nextInt(2);
			// 生成两个100以内的操作数m，n
			m = (short) rand.nextInt(101);
			n = (short) rand.nextInt(101);
			if (ov == 1) {
				symbol = '+';
				result[i] = m + n;
				if (result[i] > 100) {// 两数之和大于100，从此位置重新生成
					--i;
					continue;
				} else
					System.out.print("题目" + (i + 1) + ":\t" + m + symbol + n + "=" + "\t\t");

			} else {
				symbol = '-';
				result[i] = m - n;
				if (result[i] < 0) {// 两数之差小于0，从此位置重新生成
					--i;
					continue;
				} else
					System.out.print("题目" + (i + 1) + ":\t" + m + symbol + n + "=" + "\t\t");
			}
			// 每行输出4个换行
			count++;
			if (count % 4 == 0)
				System.out.print("\n");
		}
		System.out
				.println("\n****************************************************************************************");
		System.out.println("\n下面是习题的参考答案：");
		System.out
				.println("\n****************************************************************************************");
		// 按顺序输出50道算式的结果
		for (int j = 0; j < 50; j++) {
			System.out.print("答案" + (j + 1) + ":\t" + result[j] + "\t\t");
			// 输出4个换行
			if ((j + 1) % 4 == 0)
				System.out.print("\n");
		}
	}
}