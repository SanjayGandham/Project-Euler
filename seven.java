public class seven {
	public static void main(String[] args) {
		int no = 10001;
		int count = 0;
		int prime = 1;
		while (count != no) {
			prime++;
			if (isPrime(prime)) {
				count++;
			}
		} 
		System.out.println(prime);
	}

	public static boolean isPrime(int prime) {
		if (prime == 2)
			return true;
		for (int i = 2; i < prime; i++) {
			if (prime % i == 0) {
				return false;
			}
		}
		return true;
	}
}
