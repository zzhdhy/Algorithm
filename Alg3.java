package com.rjgz;

import java.util.Random;

public class Alg3 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		short m = 0, n = 0, ov = 0;
		int[] result = new int[50];// ����һ����С50��������50����ʽ�Ľ��
		int count = 0;// ������
		char symbol;// ��������
		Random rand = new Random();
		System.out.println("50��100���ڼӼ���ϰ�⣺");
		for (int i = 0; i < 50; i++) {
			ov = (short) rand.nextInt(2);
			// ��������100���ڵĲ�����m��n
			m = (short) rand.nextInt(101);
			n = (short) rand.nextInt(101);
			if (ov == 1) {
				symbol = '+';
				result[i] = m + n;
				if (result[i] > 100) {// ����֮�ʹ���100���Ӵ�λ����������
					--i;
					continue;
				} else
					System.out.print("��Ŀ" + (i + 1) + ":\t" + m + symbol + n + "=" + "\t\t");

			} else {
				symbol = '-';
				result[i] = m - n;
				if (result[i] < 0) {// ����֮��С��0���Ӵ�λ����������
					--i;
					continue;
				} else
					System.out.print("��Ŀ" + (i + 1) + ":\t" + m + symbol + n + "=" + "\t\t");
			}
			// ÿ�����4������
			count++;
			if (count % 4 == 0)
				System.out.print("\n");
		}
		System.out
				.println("\n****************************************************************************************");
		System.out.println("\n������ϰ��Ĳο��𰸣�");
		System.out
				.println("\n****************************************************************************************");
		// ��˳�����50����ʽ�Ľ��
		for (int j = 0; j < 50; j++) {
			System.out.print("��" + (j + 1) + ":\t" + result[j] + "\t\t");
			// ���4������
			if ((j + 1) % 4 == 0)
				System.out.print("\n");
		}
	}
}