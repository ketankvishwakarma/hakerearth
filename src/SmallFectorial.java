import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class SmallFectorial {

	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		List<BigInteger> output = new ArrayList<BigInteger>();
		for (int i = 0; i < N; i++)
		{
			output.add(test(Long.parseLong(br.readLine())));
		}
		for (BigInteger x : output) {
			System.out.println(x);
		}	
	}

	private static BigInteger test(long n) 
	{
		BigInteger result = new BigInteger("1");
		for(int i=1;i<=n;i++){
			result = result.multiply(BigInteger.valueOf(i));
		}
		return result;
	}
}
