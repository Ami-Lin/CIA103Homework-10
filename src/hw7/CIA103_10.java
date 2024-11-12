package hw7;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;

class Animal implements Serializable{
	private String name;
	public void speak(){}
}

public class CIA103_10 {
	private String f1;
	private String f2;
	public static void copyFile(String f1,String f2) throws IOException{
		// 讀取
		String str;
        FileReader fr = new FileReader(f1);
        BufferedReader br = new BufferedReader(fr) ;
        
        // 寫入
        FileWriter fw = new FileWriter(f2);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
        while ((str = br.readLine()) != null) {
//            System.out.println(str);
            pw.println(str);
        }
		pw.close();
		bw.close();
		fw.close();
        br.close();   
        fr.close();
	}
	
	
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		
		File file = new File("C:\\CIA103_Workspace\\Homework-10\\src\\hw7\\Sample.txt");
		FileReader in = new FileReader(file);
		
		System.out.println("1.請寫一個程式讀取這個Sample.txt檔案,並輸出以下訊息:");
		System.out.println("Sample.txt檔案共有xxx個位元組,yyy個字元,zzz列資料");
		System.out.println("----------------------------------------");
		int c;
		int n=1; //從第一列開始
		int charcount=0;
		while((c = in.read()) != -1) {
			System.out.print((char)c);
			charcount ++;
			System.out.flush();
			if(c == (char)10) {
				n+=1;
			}
		}
		System.out.print("\n\n"+ file.getName() +"檔案共有" + file.length() + "個位元組," +
		charcount + "個字元," + n + "列資料");
		in.close();
		
		System.out.println("\n---------------------------------");
		
		System.out.println("2.請寫一隻程式,能夠亂數產生10個1~1000的整數,並寫入一個名為Data.txt的檔案裡");
		System.out.println("(請使用append功能讓每次執行結果都能被保存起來)");
		System.out.println("請點開Data.txt查閱");
		FileWriter fw2 = new FileWriter("C:\\CIA103_Workspace\\Homework-10\\src\\hw7\\Data.txt",true);
		BufferedWriter bw2 = new BufferedWriter(fw2);
		PrintWriter pw2 = new PrintWriter(bw2);
		String bo1 ="";
		for(int i=1;i<=10;i++) {
			bo1 += (int)(Math.random()*1000+1)+ " ";
		}
		pw2.print(bo1 + "\n");
		pw2.close();
		bw2.close();
		fw2.close();
		
		System.out.println("------------------------------");
	
		System.out.println("3.請從無到有試著完成一個方法名為copyFile,這個方法有兩個參數。呼叫此方法時,第一個參數所");
		System.out.println("代表的檔案會複製到第二個參數代表的檔案");
		System.out.println("請點開CopySample.txt查閱");
		copyFile(".\\src\\hw7\\Sample.txt",".\\src\\hw7\\CopySample.txt");
		
		System.out.println("------------------------------");
		
		System.out.println("4.請寫一支程式,利用老師提供的Dog與Cat類別分別產生兩個物件,寫到C:\\data\\Object.ser裡。");
		System.out.println("注意物件寫入需注意的事項,若C:\\內沒有data資料夾,請用程式新增這個資料夾");
		
		File dir = new File("C:\\data");
		File dirAddFile = new File("C:\\data\\Object.ser");
		Animal[] animal = new Animal[4];
		animal[0] = new Dog("gogo");
		animal[1] = new Dog("gogo2");
		animal[2] = new Cat("meowmeow");
		animal[3] = new Cat("meowmeow2");
	    if (!dir.isDirectory()) {
	         dir.mkdir();
	    }		
	    FileOutputStream fos = new FileOutputStream(dirAddFile);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		for (int i = 0; i < animal.length; i++)
			oos.writeObject(animal[i]);
		oos.close();
		fos.close();
		
		System.out.println("承上題,請寫一個程式,能讀取Object.ser這四個物件,並執行speak()方法觀察結果如何");
		System.out.println(" (請利用多型簡化本題的程式設計)");
		
		FileInputStream fis = new FileInputStream(dirAddFile);
		ObjectInputStream ois = new ObjectInputStream(fis);
		System.out.println("--------------------");
		try {
			while (true) {
				((Animal) ois.readObject()).speak();
			}
		} catch (EOFException e) {
			System.out.println("資料讀取完畢！");
		}
		ois.close();
		fis.close();
		
	}
}
