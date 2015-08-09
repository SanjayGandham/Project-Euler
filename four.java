import java.util.*;

import acm.program.*;

public class four {
	public static void main(String[] args) {
		int maxpal = 0;
		for (int i = 999; i > 0; i--) {
			for (int j = 999; j > 0; j--) {
				int num = i * j;
				if (num > 10) {
					String l = Integer.toString(num);
					if (isPal(l)) {
						if (maxpal < num)
							maxpal = num;
					}
				}
			}
		} 
		System.out.println(maxpal);
	}

	public static boolean isPal(String i) {
		String[] digs = i.split("");
		if (digs.length % 2 == 0) {
			String temp = "";
			for (int j = 0; j < digs.length; j++) {
				String str = temp + digs[digs.length - j - 1];
				temp = str;
			}
			if (temp.equals(i))
				return true;
		} else {
			String temp = i.substring(0, (i.length() - 1) / 2)
					+ i.substring((i.length() + 1) / 2, i.length());
			return isPal(temp);
		}
		return false;
	}
}
