package com.arrays;

import java.util.Arrays;

public class ArraysText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k, baka[] = new int[11], a[] = {19, 22, 15, 13, 1, 0 , 10 , 8, 2, 4, 36};
		System.out.println("\t\t排序前a数组个元素为：");
		for(k = 0; k < a.length; k++) {
			System.out.print(a[k] + "\t");
			baka[k] = a[k];	//数组元素复制，将数组单个元素赋值给baka数组对应元素
		}
		System.out.println("");
		Arrays.sort(a);
		System.out.println("\t\t完全排序后a数组个元素为：");
		for(k = 0; k < a.length; k++)
			System.out.print(a[k] + "\t");
		System.out.println();
		for(k = 0; k < baka.length; k++)
			a[k] = baka[k];	//再将数组还原
		Arrays.sort(a, 3, 8);
		System.out.println("部分（第3个至第七个元素）排序后a数组个元素为：");
		for(k = 0; k < a.length; k++)
			System.out.print(a[k] + "\t");
		System.out.println();
	}

}
