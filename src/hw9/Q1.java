package hw9;

public class Q1 extends Thread {
	int counts = 1;
	String name;
	int s;

	public Q1(String name) {
		this.name = name;
	}

	public void run() { // 執行緒執行的地方
		while (counts != 10) {
			System.out.println(name + "吃第" + counts + "碗飯");
			try {
				s = (int) (Math.random() * 2501 + 500);
				System.out.println(s);
				Thread.sleep(s); // 暫停
			} catch (Exception e) {
			}
			counts++;
		}
		System.out.println(name + "吃第" + counts + "碗飯");
		System.out.println(name + "吃完了");
	}

	public static void main(String arg[]) {
		System.out.println("-----大胃王快食比賽開始！-----");
		Q1 t1 = new Q1("饅頭人"); // 產生執行緒物件
		Q1 t2 = new Q1("詹姆士");
		t1.start(); // 呼叫執行緒物件的start()方法(即啟動執行緒) , 隨即執行物件中的run方法
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("-----大胃王快食比賽結束！-----");
	}
}
