package hw5;

import java.util.Scanner;

public class CIA103_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		1.請設計一個方法為starSquare(int width, int height),
//		當使用者鍵盤輸入寬與高時,即會印出對應的*長方形,如圖:
		System.out.print("請輸入寬與高:");
		int width = sc.nextInt();
		int height = sc.nextInt();
		starSquare(width, height);
		System.out.println("畫得不錯哦！");

		System.out.println("----------------------------------------");
//		2.請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中取平均值並
//		印出這10個亂數與平均值,如圖:
		System.out.println("本次亂數結果");
		randAvg();

		System.out.println("----------------------------------------");
//		3.利用Overloading,設計兩個方法int maxElement(int x[][])
//		與double maxElement(double x[][]),可以找出二維陣列的最大值並回傳,如圖:
		int[][] intArray = { { 1, 6, 3 }, { 9, 5, 2 } };
		double[][] doubleArray = { { 1.2, 3.5, 2.2 }, { 7.4, 2.1, 8.2 } };
		Work03 w = new Work03();
		System.out.println(w.maxElement(intArray));
		System.out.println(w.maxElement(doubleArray));

		System.out.println("----------------------------------------");
//		4.請設計一個類別MyRectangle:
//		(1) 有兩個double型態的屬性為width, depth
//		(2) 有三個方法:
//		void setWidth(double width): 將收到的引數指定給width屬性
//		void setDepth(double depth): 將收到的引數指定給depth屬性
//		double getArea(): 能計算該長方形的面積
//		(3) 有兩個建構子:
//		public MyRectangle(): 不帶參數也無內容的建構子
//		public MyRectangle(double width, double depth): 傳入的兩個引數會指定給對應的屬性
//		• 請另外建立一個MyRectangleMain類別,此類別只有main方法
//		(1) 使用public MyRectangle()建構子建立物件,
//		設定width, depth為10, 20,透過getArea()印出結果
//		(2) 使用public MyRectangle(double width, double depth)建構子建立物件
//		,設定width, depth為10, 20,透過getArea()印出結果
		
		System.out.println("請看MyRectangle.java,MyRectangleMain");
		System.out.println("----------------------------------------");
		
//		5.身為程式設計師的你,收到一個任務,要幫系統的註冊新增驗證碼的功能,請設計一個方法
//		genAuthCode(),當呼叫此方法時,會回傳一個8位數的驗證碼,此驗證碼內容包含了英文大小寫
//		與數字的亂數組合,如圖:
		System.out.println("本次隨機產生驗證碼為:");
		genAuthCode();
	}

	// 1
	public static void starSquare(int width, int height) {
		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// 2
	public static void randAvg() {
		double sum = 0;
		for (int i = 1; i <= 10; i++) {
			int random = (int) (Math.random() * 101);
			System.out.print(random + " ");
			sum += random;
		}
		System.out.println("\n" + sum / 10);
	}

	// 3 在Work03

	// 4 在MyRectangle MyRectangleMain

	// 5
	public static void genAuthCode() {
		String s = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for(int i = 1;i<=8;i++) {
			System.out.print(s.charAt((int)(Math.random()*s.length())));
		}
	}

}
