import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class mpp_final2 {	
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

	public static void main(String[] args) throws IOException {
		BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(inp.readLine());
		
		int N =  Integer.parseInt(st.nextToken());
		ArrayList<Long> newb = new ArrayList<>();
		
		StringTokenizer st1 = new StringTokenizer(inp.readLine());
		
		for(int i=0;i<N;i++) {
			newb.add(Long.parseLong(st1.nextToken()));
		}
		inp.close();
		
		System.out.println(mpp(newb));	

	
	}
}
