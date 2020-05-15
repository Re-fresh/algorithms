import java.util.ArrayList;
import java.util.Scanner;

public class mpp_naive {

	public static long mpp(ArrayList<Integer> a) {
		long result = 0;
		int x=0, y=0;
		for (int i = 0; i < a.size(); i++) {
			for (int j = 0; j < i; j++) {
				if (a.get(i) * a.get(j) > result) {
					result = a.get(i) * a.get(j);
					 x = a.get(i); 
					 y = a.get(j);
				}
				else
					continue;
			}
		}
		System.out.println(x + " naive " + y);
		return result;
	}
/*
	public static void main(String args[]) {

		// Input
		Scanner inp = new Scanner(System.in);
		int N;
		N = inp.nextInt();
		long[] arr = new long[N];
		for (int i = 0; i < N; i++) {
			arr[i] = inp.nextInt();
		}
		inp.close();

		long result = mpp(arr);
		System.out.println(result);

	}
	*/
}
