import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;
public class Main {
	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}

		int[] nextIntArray(int n) {
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = Integer.parseInt(next());
			}
			return a;
		}

	}
	public static HashMap<String,Boolean> hm=new HashMap<>();
	public static void main(String[] args) {
		FastReader sc =new FastReader();
		int t=sc.nextInt();
		while(t-- > 0)
		{
			int n=sc.nextInt();
			int a[]=sc.nextIntArray(n);
			Arrays.sort(a);
			//I can remove last 3;
			//I can remove last 2 and first;
			//I can remove last 1 and first 2;
			//I can remove first 3;
			
			//-1 -1 3 4 5 8
			if(n<=3)
			{
				System.out.println(0);
			}
			int min=Integer.MAX_VALUE;
			for(int i=0;i<4;i++)
			{
				//i elements from start means removing from start;
				min=Math.min(a[n+i-4]-a[i],min);
			}
			System.out.println(min);
			
		}
	}
	public static int gcd(int a,int b)
	{
		if(a==0) return b;
		return gcd(b%a, a);
	}

}

