import java.util.ArrayList;
import java.util.Scanner;

public class mpp_final {
	public static long mpp(ArrayList<Long> a) {
		int m1 = -1;
		int m2 = -1;

		for (int i = 0; i < a.size(); i++) {
			if (m1 == -1 || a.get(i) >= a.get(m1))
				m1 = i;
		}
		for (int j = 0; j < a.size(); j++) {
			if ((j != m1) && (m2 == -1 || a.get(j) >= a.get(m2)))
				m2 = j;
		}
		return a.get(m1) * a.get(m2);
	}

	public static void main(String[] args){
		Scanner inp = new Scanner(System.in);
		
		int N =  inp.nextInt();
		ArrayList<Long> newb = new ArrayList<>();
		for(int i=0;i<N;i++) {
			newb.add(inp.nextLong());
		}
		inp.close();
		
		System.out.println(mpp(newb));	
	
	}
}
