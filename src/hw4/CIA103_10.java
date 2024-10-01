package hw4;

import java.util.Arrays;
import java.util.Scanner;

public class CIA103_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		• 有個一維陣列如下:
//		{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//		請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//		(提示:陣列,length屬性)
		int a[] = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		int sum = 0;
		Arrays.sort(a);
		for (int i = 1; i <= a.length; i++) {
			sum += a[i - 1];
		}
		int avg = sum / a.length;
		System.out.println("AVG=" + avg);
		System.out.print("大於平均值的元素有:");
		for (int j = 1; j <= a.length; j++) {
			if (a[j - 1] > avg) {
				System.out.print(a[j - 1] + " ");
			}
		}
		System.out.println("\n----------------------------------------");
//		• 請建立一個字串,經過程式執行後,輸入結果是反過來的
//		例如String s = “Hello World”,執行結果即為dlroW olleH
//		(提示:String方法,陣列)
		String s = "Hello World";
		for (int i = s.length(); i > 0; i--)
			System.out.print(s.charAt(i - 1));

		System.out.println("\n----------------------------------------");
//		• 有個字串陣列如下 (八大行星):
//		{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//		請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//		(提示:字元比對,String方法)
		String a3Array[] = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		int count = 0;
		char x;
		for (int i = 0; i < a3Array.length; i++) {
			for (int j = 0; j < a3Array[i].length(); j++) {
				x = a3Array[i].charAt(j);
				switch (x) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					count += 1;
				}
//				if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u') {
//					count+=1;
//				}
			}
		}
		System.out.println("陣列裡共有" + count + "個母音");

		System.out.println("----------------------------------------");
//		• 阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列
//		表如下:
//		empno	25	32	 8	 19	  27
//		cash   2500 800 500 1000 1200
//		請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//		有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
//		員工編號: 25 19 27 共 3 人!」
//		(提示:Scanner,二維陣列)
		System.out.print("想借多少錢:");
		int m = sc.nextInt();
		int count2 = 0;
		System.out.print("有錢可借的員工編號: ");
		int e[][] = { { 25, 32, 8, 19, 27 }, { 2500, 800, 500, 1000, 1200 } };
		for (int i = 1; i < e.length; i++) {
			for (int j = 0; j < e[i].length; j++) {
				if (m <= e[1][j]) {
					count2 += 1;
					System.out.print(e[0][j] + " ");
				}
			}
		}
		System.out.println("共 " + count2 + " 人！");
		System.out.println("----------------------------------------");
//		• 請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//		例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
//		(提示1:Scanner,陣列)
//		(提示2:需將閏年條件加入)
//		(提示3:擋下錯誤輸入:例如月份輸入為2,則日期不該超過29)

		System.out.println("請輸入年:");
		int year = sc.nextInt();
		System.out.println("請輸入月:");
		int month = sc.nextInt();
		System.out.println("請輸入日");
		int day = sc.nextInt();
//		int dd[][] = {{1,2,3,4,5,6,7,8,9,10,11,12},{31,28,31,30,31,30,31,31,30,31,30,31}};
		int dd[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int rd = 0;
//		平年365 2月28 閏年366 2月29
		if (year % 4 == 0 && year % 100 != 0) {
			System.out.println("閏年");
			if (month == 2) {
				if (day <= 29) {
					for (int i = 0; i < month - 1; i++) {
						rd += dd[i];
					}
					rd += day;
					System.out.println("輸入的日期為該年第"+rd+"天");
				} else {
					System.out.println("閏年的二月不該超過29天");
				}
			} else if (month < 2) {
				if (day < 32) {
					for (int i = 0; i < month - 1; i++) {
						rd += dd[i];
					}
					rd += day;
					System.out.println("輸入的日期為該年第"+rd+"天");
				} else {
					System.out.println("月哪有超過32天的，大哥你是人?");
				}
			} else {
				if (day < 32) {
					for (int i = 0; i < month - 1; i++) {
						rd += dd[i];
					}
					rd += day + 1;
					System.out.println("輸入的日期為該年第"+rd+"天");
				} else {
					System.out.println("月哪有超過32天的，大哥你是人?");
				}
			}
		} else if (year % 400 == 0 && year % 1000 == 0) {
			System.out.println("閏年");
			if (month == 2) {
				if (day <= 29) {
					for (int i = 0; i < month - 1; i++) {
						rd += dd[i];
					}
					rd += day;
					System.out.println("輸入的日期為該年第"+rd+"天");
				} else {
					System.out.println("閏年的二月不該超過29天");
				}
			} else if (month < 2) {
				if (day < 32) {
					for (int i = 0; i < month - 1; i++) {
						rd += dd[i];
					}
					rd += day;
					System.out.println("輸入的日期為該年第"+rd+"天");
				} else {
					System.out.println("月哪有超過32天的，大哥你是人?");
				}
			} else {
				if (day < 32) {
					for (int i = 0; i < month - 1; i++) {
						rd += dd[i];
					}
					rd += day + 1;
					System.out.println("輸入的日期為該年第"+rd+"天");
				} else {
					System.out.println("月哪有超過32天的，大哥你是人?");
				}
			}
		} else {
			System.out.println("平年");
			for (int i = 0; i < month - 1; i++) {
				rd += dd[i];
			}
			rd += day;
			System.out.println("輸入的日期為該年第"+rd+"天");
		}

		System.out.println("----------------------------------------");
		
//		• 班上有8位同學,他們進行了6次考試結果如下:
//		請算出每位同學考最高分的次數
//		(提示:二維陣列)
//			1號	2號	3號	4號	5號	6號	7號	8號
//		1考	10	35	40	100	90	85	75	70
//		2考	37	75	77	89	64	75	70	95
//		3考	100	70	79	90	75	70	79	90
//		4考	77	95	70	89	60	75	85	89
//		5考	98	70	89	90	75	90	89	90
//		6考	90	80	100	75	50	20	99	75
		
//      用sort 由小到大 抓最後一個 取得小考最高分
		int student[][] = { { 10, 35, 40, 100, 90, 85, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, { 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 } };
		int studentcount[] = new int[8];
		int z[] = new int[6];
		for (int i = 0; i < student.length; i++) {
			Arrays.sort(student[i]);
			for (int j = 0; j < student[i].length; j++) {
				if (student[i].length - 1 == j) {
					z[i] = student[i][j];
//				System.out.print(student[i][j]);

//				System.out.print(student[i][j]+",");
				}
			}
		}
//		然後再用最高分 去找在陣列第幾個位置
		int student2[][] = { { 10, 35, 40, 100, 90, 85, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, { 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 } };

		for (int i = 0; i < student.length; i++) {
			for (int j = 0; j < student2[i].length; j++) {
				if (z[i] == student2[i][j]) {
					studentcount[j]++;
				}
			}
		}

		for (int i = 0; i < studentcount.length; i++) {
			System.out.println((i + 1) + "號最高分考了" + studentcount[i] + "次");
		}
	}
}
