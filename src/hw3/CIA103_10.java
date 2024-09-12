package hw3;

import java.util.Scanner;

public class CIA103_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰
//		三角形、其它三角形或不是三角形,如圖示結果:
//		(提示:Scanner,三角形成立條件,判斷式if else)
//		(進階功能:加入直角三角形的判斷)
		System.out.println("請輸入三個整數：");
		int t1 =sc.nextInt();
		int t2 =sc.nextInt();
		int t3 =sc.nextInt();
		if(t1+t2>t3&&t2+t3>t1&&t1+t3>t2){
			if(t1==t2&&t2==t3) {
				System.out.println("正三角形");
			}
			else if(t1==t2||t2==t3||t1==t3) {
				System.out.println("等腰三角形");
			}
			else if(Math.pow(t1, 2)+Math.pow(t2,2)==Math.pow(t3,2)||
					Math.pow(t2, 2)+Math.pow(t3,2)==Math.pow(t1,2)||
					Math.pow(t1, 2)+Math.pow(t3,2)==Math.pow(t2,2)){
				System.out.println("直角三角形");
			}
			else {
				System.out.println("其它三角形");
			}
		}else {
			System.out.println("不是三角形");
		}
		
//		請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜
//		對則顯示正確訊息,如圖示結果:
//		(提示:Scanner,亂數方法,無窮迴圈)
//		(進階功能:產生0~100亂數,每次猜就會提示你是大於還是小於正確答案)
		System.out.println("開始猜數字吧！");
		int r = (int)(Math.random()*101);
		int a =sc.nextInt();
		while(a!=r) {
			if(a>r) {
				System.out.println("猜錯了 再小一點");
				a =sc.nextInt();
				continue;
			}else if(a<r){
				System.out.println("猜錯了 再大一點");
				a =sc.nextInt();
				continue;
			}else {
				break;
			}
		}
		System.out.println("猜對了 答案就是"+ r);
//		阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
//		厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
//		的號碼與總數,如圖:
//		(提示:Scanner)
//		(進階挑戰:輸入不要的數字後,直接亂數印出6個號碼且不得重複)
		System.out.println("你不爽幾號 直接打");
		int s3 = sc.nextInt();
		int count5 = 0;
		int box3[] = new int[50];
		for (int i3 = 1; i3 <= 49; i3++) {
			if (i3 % 10 != s3 && i3 / 10 != s3) {
				count5 += 1;
				System.out.print(i3 + " ");
				box3[i3-1] = i3;
			}
		}
		System.out.println("總共有" + count5 + "個");
		System.out.println("--------------------------------------------");
		System.out.println("");
		
	}
}
