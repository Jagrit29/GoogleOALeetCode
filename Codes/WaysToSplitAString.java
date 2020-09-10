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
			HashSet<Character> hs1=new HashSet<>(); //left to right
			HashSet<Character> hs2=new HashSet<>(); //right to left;
			String s=sc.next();
			int n=s.length();
			int left[]=new int[n];
			int l=0;
			for(int i=0;i<n;i++)
			{
				char ch=s.charAt(i);
				if(!hs1.contains(ch))
				{
					hs1.add(ch);
					left[i]=l;
					l++;
				}
				else
				{
					left[i]=l;
				}
			}
			
			int right[]=new int[n];
			int r=0;
			for(int i=n-1;i>=0;i--)
			{
				char ch=s.charAt(i);
				if(!hs2.contains(ch))
				{
					hs2.add(ch);
					right[i]=++r;
				}
				else
				{
					right[i]=r;
				}
			}
			//System.out.println(Arrays.toString(left));
			//System.out.println(Arrays.toString(right));
			int count=0;
			for(int i=1;i<=n-1;i++)
			{
				if(left[i]==right[i]) count++;
			}
			System.out.println(count);
			
			
		}
	}
	public static int gcd(int a,int b)
	{
		if(a==0) return b;
		return gcd(b%a, a);
	}

}

