
public class fib_array {

	public static long fba(int n) {
		long F[] = new long[n+1];
		F[0] =0;
		F[1] =1;
		for(int i=2;i<=n;i++) F[i] = F[i-1] + F[i-2];
		return F[n];
	}
	
	public static void main(String[] args) {
		
		System.out.println(fib_array.fba(100));	
	}

}
