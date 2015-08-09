public class three {
	public static void main(String[] args) {
		long i = 2;
		long factor = 600851475143L;
		while (i < factor) {
			while (factor % i == 0) {
				if (i == factor)
					break;
				factor = factor / i;
			}
			i++;
		} 
		System.out.println(factor);
	}
}
