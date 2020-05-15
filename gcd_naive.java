
public class gcd_naive {
	//Implementation
	public static int gcdn(long a, long b) {
		int best=0;
		for(int i=1;i<=a+b;i++) {
			if(a%i==0 && b%i==0) best =i; 
		}
		
		return best;
	}
	
	//Test
	public static void main(String[] args) {
		
		System.out.println(gcd_naive.gcdn(10, 20));
	}
}
