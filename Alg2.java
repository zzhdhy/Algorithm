package com.rjgz;

import java.util.Random;

public class Alg2 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		short m = 0, n = 0, ov = 0;
		int s, count = 0;//����һ����������������
		char o;//��������
		Random rand = new Random();
		for (int i = 0; i < 50; i++) {//����50����ʽ�⣬�����ں���������
			ov = (short) rand.nextInt(2);
			m = (short) rand.nextInt(101);
			n = (short) rand.nextInt(101);
			if (ov == 1) {
				o = '+';
				s = m + n;
				if (s > 100) {//�������֮�ʹ���100����Ӵ�λ����������
					--i;
					continue;
				} else
					System.out.print("��Ŀ" + (i + 1) + ":\t" + m + o + n + "=" + "\t\t");
				System.out.print("��:" + s + "\t\t");
			} else {
				o = '-';
				s = m - n;
				if (s < 0) {//�������֮��С��0����Ӵ�λ����������
					--i;
					continue;
				} else
					System.out.print("��Ŀ" + (i + 1) + ":\t" + m + o + n + "=" + "\t\t");
				System.out.print("��:" + s + "\t\t");
			}
			count++;
			//ÿ�����������ʽ
			if (count % 2 == 0)	
				System.out.print("\n");
		}
	}

}