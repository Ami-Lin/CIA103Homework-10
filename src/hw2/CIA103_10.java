package hw2;

public class CIA103_10 {
	public static void main(String[] args) {
//	課本的99乘法表 for+while迴圈
		System.out.println("課本的99乘法表 for+while迴圈");
		int i99, j99 = 1;
		for (i99 = 1; i99 <= 9; i99++) {
			while (j99 <= 9) {
				System.out.print(i99 + "*" + j99 + "=" + i99 * j99 + "\t");
				j99++;
			}
			j99 = 1;
			System.out.println();
		}
		System.out.println("--------------------------------------------");
//	課本的99乘法表 for+do while迴圈
		System.out.println("課本的99乘法表 for+do while迴圈");
		int a99, b99 = 1;
		for (a99 = 1; a99 <= 9; a99++) {
			do {
				System.out.print(a99 + "*" + b99 + "=" + a99 * b99 + "\t");
				b99++;
			} while (b99 <= 9);
			b99 = 1;
			System.out.println();
		}
		System.out.println("--------------------------------------------");
//	課本的99乘法表 while+do while迴圈
		System.out.println("課本的99乘法表 while+do while迴圈");
		int c99 = 1;
		int d99 = 1;
		while (c99 <= 9) {
			do {
				System.out.print(c99 + "*" + d99 + "=" + c99 * d99 + "\t");
				d99++;
			} while (d99 <= 9);
			d99 = 1;
			c99++;
			System.out.println();
		}
		System.out.println("--------------------------------------------");
//	• 請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
		System.out.println("• 請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)");
		int sum = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		System.out.println("--------------------------------------------");
//	• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
		System.out.println("• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)");
		int sum2 = 1;
		for (int i2 = 1; i2 <= 10; i2++) {
			sum2 *= i2;
		}
		System.out.println(sum2);
		System.out.println("--------------------------------------------");
//	• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
		System.out.println("• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)");
		int i3 = 1;
		int sum3 = 1;
		while (i3 <= 10) {
			sum3 *= i3;
			i3++;
		}
		System.out.println(sum3);
		System.out.println("--------------------------------------------");
//	• 請設計一隻Java程式,輸出結果為以下:
//	1 4 9 16 25 36 49 64 81 100
		System.out.println("• 請設計一隻Java程式,輸出結果為以下:");
		System.out.println("1 4 9 16 25 36 49 64 81 100");
//	 3 5 7 9 11 13 15 17 19
		int o4 = 1;
		int sum4 = 0;
		for (int i4 = 1; i4 <= 10; i4++) {
			sum4 += o4;
			o4 += 2;
			System.out.print(sum4 + " ");
		}
		System.out.println();
		System.out.println("--------------------------------------------");
//	• 阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
//	輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
		System.out.println("• 阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,");
		System.out.println("輸出結果為阿文可以選擇的數字有哪些?總共有幾個?");
//		4 14 24 34 40 41 42 43 44 45 46 47 48 49
		int count5 = 0;
		for (int i5 = 1; i5 <= 49; i5++) {
			if (i5 % 10 != 4 && i5 / 10 != 4) {
				count5 += 1;
				System.out.print(i5 + " ");
			}
		}
		System.out.println("總共有" + count5 + "個");
		System.out.println("--------------------------------------------");
//	• 請設計一隻Java程式,輸出結果為以下:
//	1 2 3 4 5 6 7 8 9 10
//	1 2 3 4 5 6 7 8 9
//	1 2 3 4 5 6 7 8
//	1 2 3 4 5 6 7
//	1 2 3 4 5 6
//	1 2 3 4 5
//	1 2 3 4
//	1 2 3
//	1 2
//	1
		for (int i6 = 10; i6 >= 1; i6--) {
			for (int j6 = 1; j6 <= i6; j6++) {
				System.out.print(j6 + " ");
			}
			System.out.println();
		}
//	• 請設計一隻Java程式,輸出結果為以下:
//		A
//		BB
//		CCC
//		DDDD
//		EEEEE
//		FFFFFF
		char o7 = (65);
		for (int i7 = 1; i7 <= 6; i7++) {
			for (int j7 = 1; j7 <= i7; j7++) {
				System.out.print(o7);
			}
			o7 += 1;
			System.out.println();
		}

	}
}
