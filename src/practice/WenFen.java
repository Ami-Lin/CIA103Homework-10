package practice;

import java.util.Scanner;

public class WenFen {
	public static void main(String[] args) {
			/*請做出微分功能
			input x^2 output 2x
			input x^3 output 3x^2
			input 5x^6 output 30x^5
			input 4x^5 output 20x^4*/
		  Scanner sc = new Scanner(System.in);
		  String s = sc.nextLine();
		  String ss[] = s.split("x");
		  
		  if(ss[0]=="") {   
		   int c = Integer.parseInt(ss[1].substring(1, ss[1].length()));
		    if(c==2) {
		     System.out.println(c + "x");
		    }else {
		     System.out.println(c + "x^" + (c-1));
		    }
		  }else {
		   int a = Integer.parseInt(ss[0]);
		   int b = Integer.parseInt(ss[1].substring(1, ss[1].length()));  
		   System.out.println(a*b+"x^" + (b-1));
		  }
		  
		  
	}
}
