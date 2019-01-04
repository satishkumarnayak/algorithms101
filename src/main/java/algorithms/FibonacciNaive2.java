package algorithms;

public class FibonacciNaive2 {

	
	static int[] memo = new int[1001];
	public static void main(String[] args) {
		
		
		int n = 1000;
		long starttime = System.currentTimeMillis();
		for(int i = 0; i<=n; i++) {
		//	System.out.println(fib(i)+ " ");
			System.out.println(fibmemo(i)+ " ");
		}
		long endtime = System.currentTimeMillis();
		long totalTime = endtime - starttime;
		
		System.out.println("totalTime-->"+totalTime);
	}
	
	
	public static int fib(int n) {

		if (n == 0) {

			return 0;
		}
		if (n == 1) {

			return 1;
		}
		return fib(n - 1) + fib(n - 2);

	}
	
	public static int fibmemo(int n) {

		if (n == 0) {

			return 0;
		}
		if (n == 1) {

			return 1;
		} else if (memo[n] == 0) {
		memo[n] =fibmemo(n - 1) + fibmemo(n - 2);
		}
		return memo[n];

	}

}
