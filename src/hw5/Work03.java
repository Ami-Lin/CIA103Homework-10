package hw5;

import java.util.Arrays;

public class Work03 {

	public int maxElement(int x[][]) {
		int y[] = new int[6];
		int index = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				y[index++] = x[i][j];
			}
		}
		Arrays.sort(y);
		return y[y.length-1];
	}

	double maxElement(double x[][]) {
		double z[] = new double[6];
		int index = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				z[index++] = x[i][j];
			}
		}
		Arrays.sort(z);
		return z[z.length-1];
	}
}
