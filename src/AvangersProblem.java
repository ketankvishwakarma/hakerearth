import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AvangersProblem {

	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		long[] output = new long[N];
		for (int i = 0; i < N; i++)
		{
			output[i] =  test(Long.parseLong(br.readLine()));
		}
		for (long x : output) {
			System.out.println(x);
		}
	}

	private static long test(long d) {
		long result = 0;
		if(d>1)
		{
			result = 1;
			result = (d*(d-1))/2;
		}
		return result;
	}
}
