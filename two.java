import java.util.*;

public class two {
	public static void main(String[] args) {

		int i = 1;
		int temp = 1;
		int count = 0;
		for (; i < 4000000; i = i + temp) {
			num.add(i);
			if (i != 1) {
				temp = num.get(count - 1);
			} 
			count++;
		}
		i = 0;
		count = 1;
		for (; i < 4000000; count = count + 3) {
			i = i + num.get(count);
		}
		System.out.println(i);
	}

	static ArrayList<Integer> num = new ArrayList<Integer>();
}
