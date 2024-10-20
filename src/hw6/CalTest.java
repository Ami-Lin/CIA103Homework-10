package hw6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {
	//	請設計三個類別Calculator.java,CalException.java與CalTest.java,
	//	在Calculator.java裡有個自訂	方法為powerXY(int x, int y),功能是會計算x的y次方並回傳結果。
	//	CalTest.java執行後,使用者可以輸入x與y的值,請加入例外處理機制,讓程式能解決以下狀況:
	//	1. x與y同時為0,(產生自訂的CalException例外物件)
	//	2. y為負值,而導致x的y次方結果不為整數
	//	3. x與y皆正確情況下,會顯示運算後結果
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		try{
			System.out.println("請輸入x的值:");
			int x = sc.nextInt();
			System.out.println("請輸入y的值");
			int y = sc.nextInt();
			
			System.out.println(x+"的"+y+"次方等於"+Calculator.powerXY(x,y));
		}catch(InputMismatchException e) {
			System.out.println("輸入格式不正確");
		}catch(CalException e){
			System.out.println(e.getMessage());
		}finally {
			sc.close();
		}
		
	}
}
