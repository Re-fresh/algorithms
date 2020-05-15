import java.util.ArrayList;

public class mpp_better {

	public static long mpp(ArrayList<Integer> a) {
		int m1 = -1;
		int m2 = -1;

		for (int i = 0; i < a.size() ; i++) {
			if(m1==-1 || a.get(i)>=a.get(m1)) m1 = i;
		}
		for (int j = 0; j < a.size(); j++) {
			if((j!=m1) && (m2==-1 || a.get(j)>=a.get(m2))) m2 = j;
		}
		System.out.println(a.get(m1) + " better " + a.get(m2));
		return a.get(m1)*a.get(m2);
	}
public static void main(String[] args) {
		
}
}


