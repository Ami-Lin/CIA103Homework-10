package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CIA103_10 {
	public static void main(String[] args) {
		System.out.println("1.請建立一個Collection物件並將以下資料加入:\r\n"
				+ "Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、Integer(100)、\r\n"
				+ "Object物件、“Snoopy”、BigInteger(“1000”)");
		List list = new ArrayList();
		list.add((Integer) 100);
		list.add((Double) 3.14);
		list.add((Long) 21L);
		list.add(new Short("100"));
		list.add((Double) 5.1);
		list.add("kitty");
		list.add((Integer) 100);
		list.add(new Object());
		list.add("snoopy");
		list.add(new BigInteger("1000"));

		System.out.println("• 印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)");
		System.out.println("    Iterator:");
		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println("\n    for:");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println("\n    foreach:");
		for (Object o : list) {
			System.out.print(o + " ");
		}

		System.out.println();

		System.out.println("• 移除不是java.lang.Number相關的物件");
		System.out.println("• 再次印出這個集合物件的所有元素,觀察是否已將非Number相關的物件移除成功");
		Iterator it2 = list.iterator();
		while (it2.hasNext()) {
			if (!(it2.next() instanceof Number))
				it2.remove();
		}
		System.out.println(list);
		System.out.println("-------------------------------------");
		System.out.println("2.在main方法裡透過建構子產生以下7個Train的物件,放到每小題需使用的集合裡\r\n"
				+ "		- (202, “普悠瑪”, “樹林”, “花蓮”, 400)\r\n"
				+ "		- (1254, “區間”, “屏東”, “基隆”, 700)\r\n"
				+ "		- (118, “自強”, “高雄”, “台北”, 500)\r\n"
				+ "		- (1288, “區間”, “新竹”, “基隆”, 400)\r\n"
				+ "		- (122, “自強”, “台中”, “花蓮”, 600)\r\n"
				+ "		- (1222, “區間”, “樹林”, 七堵, 300)\r\n"
				+ "		- (1254, “區間”, “屏東”, “基隆”, 700)");

		
		Train t[] = { new Train(202, "普悠瑪", "樹林", "花蓮", 400), new Train(1254, "區間", "屏東", "基隆", 700),
				new Train(118, "自強", "高雄", "台北", 500), new Train(1288, "區間", "新竹", "基隆", 400),
				new Train(122, "自強", "台中", "花蓮", 600), new Train(1222, "區間", "樹林", "七堵", 300),
				new Train(1254, "區間", "屏東", "基隆", 700) };
		
		Set<Train> set = new HashSet<Train>();
		for(int i = 0;i<t.length;i++) {
			set.add(t[i]);
		}
		System.out.println("• 請寫一隻程式,能印出不重複的Train物件 \n------迭代器取法----------");
		// 迭代器 取法
		Iterator<Train> it3 = set.iterator();
		while(it3.hasNext()) {
			it3.next().getTrain();
		}
		System.out.println("------foreach取法------");
		// foreach 取法
		for(Train tSet:set)
			tSet.getTrain();
		System.out.println("---------------------");
		
		
		System.out.println("• 請寫一隻程式,讓Train物件印出時,能以班次編號由大到小印出");
		List<Train> list2 = new ArrayList();
		for(int i=0;i<t.length;i++) {
			list2.add(t[i]);
		}
		Collections.sort(list2);
		System.out.println("------迭代器取法----------");
		Iterator<Train> it4 = list2.iterator();
		while(it4.hasNext())
			it4.next().getTrain();
		System.out.println("------foreach取法----------");
		for(Train tList:list2)
			tList.getTrain();
		
		System.out.println("• 承上,不僅能讓班次編號由大排到小印出, 還可以不重複印出Train物件");
		Set<Train> setTree = new TreeSet();
		setTree.add(new Train(202, "普悠瑪", "樹林", "花蓮", 400));
		setTree.add(new Train(1254, "區間", "屏東", "基隆", 700));
		setTree.add(new Train(118, "自強", "高雄", "台北", 500));
		setTree.add(new Train(1288, "區間", "新竹", "基隆", 400));
		setTree.add(new Train(122, "自強", "台中", "花蓮", 600));
		setTree.add(new Train(1222, "區間", "樹林", "七堵", 300));
		setTree.add(new Train(1254, "區間", "屏東", "基隆", 700));		
		
		System.out.println("------迭代器取法----------");
		Iterator<Train> it5 = setTree.iterator();
		while(it5.hasNext())
			it5.next().getTrain();
		System.out.println("------foreach取法----------");
		for(Train tTreeSet:setTree)
			tTreeSet.getTrain();
		
		System.out.println("• (以上三題請根據使用的集合,練習各種取值寫法,如迭代器、for迴圈或foreach等)");

	}
}