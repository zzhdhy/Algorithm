package com.rjgz;

import java.util.Random;

public class Alg1 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		short m = 0, n = 0, ov = 0;
		char symbol;//��������
		Random rand = new Random();
		for (int i = 0; i < 50; i++) {
			// ������0��1���������Ӽ���
			ov = (short) rand.nextInt(2);
			// �������100���ڵĲ�����m��n
			m = (short) rand.nextInt(101);
			n = (short) rand.nextInt(101);
			if (ov == 1) {// �жϲ�������
				symbol = '+';
			} else {
				symbol = '-';
			}
			// �����ʽ
			System.out.println("" + (i + 1) + ":\t" + m + symbol + n + "=");
		}
	}
}
