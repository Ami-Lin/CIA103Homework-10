package hw1;

public class CIA103_10 {
	public static void main(String[] args) {
		// • 請設計一隻Java程式,計算12,6這兩個數值的和與積
		int a1 = 12, b1 = 6;
		System.out.println("• 請設計一隻Java程式,計算12,6這兩個數值的和與積");
		System.out.println("和:" + (a1 + b1) + " 積:" + (a1 * b1));
		System.out.println("--------------------------------------");

		// • 請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
		int a2 = 200 / 12, b2 = 200 % 12;
		System.out.println("• 請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)");
		System.out.println("200顆蛋是" + a2 + "打" + b2 + "顆");
		System.out.println("--------------------------------------");

		// • 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		// int day,hr,min,sec,day3,hr3,min3,sec3;
		// int totalSec=256559;
		// sec=1;min=sec*60;hr=min*60;day=hr*24;
		// day3=totalSec/day;
		// hr3=(totalSec-(day3*day))/hr;
		// min3=(totalSec-(day3*day)-(hr3*hr))/min;
		// sec3=(totalSec-(day3*day)-(hr3*hr)-(min3*min))/sec;
		int day3, hr3, min3, sec3;
		day3 = 256559 / 60 / 60 / 24;
		hr3 = 256559 / 60 / 60 % 24;
		min3 = 256559 / 60 % 60;
		sec3 = 256559 % 60;
		System.out.println("• 請由程式算出256559秒為多少天、多少小時、多少分與多少秒");
		System.out.println("256559秒為" + day3 + "天" + hr3 + "小時" + min3 + "分" + sec3 + "秒");
		System.out.println("--------------------------------------");

		// • 請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
		final double PI = 3.1415;
		int r = 5;
		double circleA = r * r * PI;
		double circleL = r * 2 * PI;
		System.out.println("• 請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長");
		System.out.println("圓面積:" + (circleA) + " 圓周長:" + (circleL));
		System.out.println("--------------------------------------");

		// • 某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
		// 金加利息共有多少錢 (用複利計算,公式請自行google)
		double PV = 1500000;
		double i = 0.02;
		double n = 10;
		double FV = PV * (Math.pow((1 + i), n));
		System.out.println("• 某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本");
		System.out.println("金加利息共有多少錢 (用複利計算,公式請自行google)");
		System.out.println("10年後本金加利息共有" + Math.round(FV));
		System.out.println("--------------------------------------");

		// • 請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
		// 5 + 5
		// 5 + ‘5’
		// 5 + “5”
		// 並請用註解各別說明答案的產生原因
		System.out.println("• 請寫一隻程式,利用System.out.println()印出以下三個運算式結果:");
		System.out.println("5 + 5");
		System.out.println("5 + ‘5’");
		System.out.println("5 + “5”");
		System.out.println("並請用註解各別說明答案的產生原因");
		System.out.print(5 + 5); // 單純數字相加
		System.out.println(" //單純數字相加");
		System.out.print(5 + '5');// 數字+字元 單引號'5'為char一般字元表示方式 根據運算式結果可知 char'5'的ASCII碼為:53
		System.out.println(" //數字+字元 單引號'5'為char一般字元表示方式 根據運算式結果可知 char'5'的ASCII碼為:53");
		System.out.print(5 + "5");// 數字+字串
		System.out.println(" //數字+字串");
	}
}