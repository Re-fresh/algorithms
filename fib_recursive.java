
public class fib_recursive {

	public static long fbr(int n) {
		if(n<2)
			return n;
		else 
			return fbr(n-1)+fbr(n-2);
	}
	
	public static void main(String[] args) {
		
		System.out.println(fib_recursive.fbr(20));	
	}

}
