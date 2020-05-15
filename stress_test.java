import java.util.ArrayList;
import java.util.Random;

public class stress_test {
	public static void main(String[] args) {
		
		Random ran = new Random();
		
		while(true) {
			int n = ran.nextInt(1000000000)%1000 + 2  ; 
			System.out.println(n);
			ArrayList<Integer> a = new ArrayList<>();
			
			for(int i=0;i<n;++i) {
				a.add(ran.nextInt(1000000000)%100000);
			} 
			System.out.println(a);
			
			long r1 = mpp_better.mpp(a);
			long r2 = mpp_naive.mpp(a);
			
			if(r1!=r2) {
				System.out.println("\nResult Status:FAILED! " + "\nReason: r1 = " + r1 + " and r2 = "+ r2 + "\n");
				System.out.println("------------------------------------------------------------------------");
				break;
			}
			else {System.out.println("\nResult Status:OK!\n");
			System.out.println("------------------------------------------------------------------------");
		}}
		
	}
}
