package extra;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Supermean
{
	private static BufferedReader br;
	private static boolean test=true;
	
	public static void main(String[] args) throws IOException
	{
		if(test) br=new BufferedReader(new FileReader(new File("./data/extra/Supermean.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		solve();
		br.close();
	}

	private static void solve() throws IOException
	{
		int N=Integer.parseInt(br.readLine());
		for (int i=1; i<=N; i++)
		{
			int n=Integer.parseInt(br.readLine());
			String[] nums=br.readLine().split(" ");
			double rta=(n==1)?Double.parseDouble(nums[0]):solveCase(n,nums);
			
			String aux=(Math.round(rta*1000)/1000.0)+"";
			int ult=aux.lastIndexOf('.');
			if (ult==aux.length()-2) aux+="00";
			else if(ult==aux.length()-3) aux+="0";
			
			System.out.println("Case #"+i+": "+aux);
		}
	}
	
	private static double solveCase(int n, String[] nums)
	{
		double rta=1;
		for (int i=0; i<n; i++)
		{
			
		}
		rta/=(Math.pow(n-1, 2));
		return rta;
	}

	private static long C(int n, int k)
	{
		if(n==k || k==0) return 1;
		else if(k>n-k) return C(n,n-k);
		else
		{
			return 1;
		}
	}
	
	private static void armarTrianguloPascal()
	{
		BigInteger[][] lol=new BigInteger[50000][50000];
		
	}
}