public class six {
	public static void main(String args[]) {
		int sum = 0;
		for (int i = 1; i < 101; i++) {
			sum = sum + i;
		}
		sum = sum * sum;
		int sums = 0;
		for (int i = 1; i < 101; i++) {
			sums = sums + (i * i);
		} 
		System.out.println(sum - sums);
	}
}
