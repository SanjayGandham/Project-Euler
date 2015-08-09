import java.util.*;

public class ten {
	public static void main(String[] args) {
		long sum = 0;
		for (int i = 2; i < 2000001; i++) {
			if (isPrime(i))
				sum = sum + i;
		}
		System.out.println(sum);
	}

	public static boolean isPrime(int prime) {
		if (prime == 2) {
			primes.add(prime);
			return true;
		} 
		for(int i=0;i<primes.size();i++){
			if (prime % primes.get(i) == 0) {
				return false;
			}
		}
		primes.add(prime);
		return true;
	}

	static ArrayList<Integer> primes = new ArrayList<Integer>();
}
