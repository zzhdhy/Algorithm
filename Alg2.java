package com.rjgz;

import java.util.Random;

public class Alg2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		short m = 0, n = 0, ov = 0;
		int s, count = 0;//定义一个结果变量与计数器
		char o;//操作符号
		Random rand = new Random();
		for (int i = 0; i < 50; i++) {//生成50道算式题，并且在后面输出结果
			ov = (short) rand.nextInt(2);
			m = (short) rand.nextInt(101);
			n = (short) rand.nextInt(101);
			if (ov == 1) {
				o = '+';
				s = m + n;
				if (s > 100) {//如果两数之和大于100，则从此位置重新生成
					--i;
					continue;
				} else
					System.out.print("题目" + (i + 1) + ":\t" + m + o + n + "=" + "\t\t");
				System.out.print("答案:" + s + "\t\t");
			} else {
				o = '-';
				s = m - n;
				if (s < 0) {//如果两数之差小于0，则从此位置重新生成
					--i;
					continue;
				} else
					System.out.print("题目" + (i + 1) + ":\t" + m + o + n + "=" + "\t\t");
				System.out.print("答案:" + s + "\t\t");
			}
			count++;
			//每行输出两个算式
			if (count % 2 == 0)	
				System.out.print("\n");
		}
	}

}