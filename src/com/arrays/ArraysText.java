package com.arrays;

import java.util.Arrays;

public class ArraysText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k, baka[] = new int[11], a[] = {19, 22, 15, 13, 1, 0 , 10 , 8, 2, 4, 36};
		System.out.println("\t\t����ǰa�����Ԫ��Ϊ��");
		for(k = 0; k < a.length; k++) {
			System.out.print(a[k] + "\t");
			baka[k] = a[k];	//����Ԫ�ظ��ƣ������鵥��Ԫ�ظ�ֵ��baka�����ӦԪ��
		}
		System.out.println("");
		Arrays.sort(a);
		System.out.println("\t\t��ȫ�����a�����Ԫ��Ϊ��");
		for(k = 0; k < a.length; k++)
			System.out.print(a[k] + "\t");
		System.out.println();
		for(k = 0; k < baka.length; k++)
			a[k] = baka[k];	//�ٽ����黹ԭ
		Arrays.sort(a, 3, 8);
		System.out.println("���֣���3�������߸�Ԫ�أ������a�����Ԫ��Ϊ��");
		for(k = 0; k < a.length; k++)
			System.out.print(a[k] + "\t");
		System.out.println();
	}

}
