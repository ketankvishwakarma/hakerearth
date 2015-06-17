import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

class Candies {
	public static void main(String args[]) throws Exception {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int N = Integer.parseInt(line);
		List<BigInteger> output = new ArrayList();
		for (int i = 0; i < N; i++) {
			output.add(test(br.readLine()));
		}
		for(BigInteger x:output){System.out.println(x);}
	}

	private static BigInteger test(String readLine) {
		String[] valueAt = readLine.split(" ");
		BigInteger candies = new BigInteger(valueAt[0]);
		BigInteger two = new BigInteger("2");
		int days = Integer.parseInt(valueAt[1]);
		for (int i = 0; i < days; i++) {
			// At 9 AM
			if (candies.mod(two).equals(0)) {
				candies = candies.divide(two);
			} else {
				candies = candies.subtract((candies.add(new BigInteger("1"))).divide(two));
			}
		}
		return candies;
	}
}
