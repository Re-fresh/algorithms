
public class gcd_euclid {
	// Implementation
	public static long gcde(long a, long b) {
		
		if (a != 0 && b != 0) {
			if (a > b) {
				a = a % b;
				return gcde(b, a);
			} else {
				b = b % a;
				return gcde(a, b);
			}
		}
		else
			return a;
	}

	// Test
	public static void main(String[] args) {

		System.out.println(gcd_euclid.gcde(9914400, 1121792490));
	}
}
