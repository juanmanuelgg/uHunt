package extra;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WildWest
{
	private static BufferedReader br;
	private static boolean test=true;
	
	public static void main(String[] args) throws IOException
	{
		if(test) br=new BufferedReader(new FileReader(new File("./data/extra/WildWest.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		solve();
		br.close();
	}

	private static void solve() throws IOException
	{
		String aux[]=br.readLine().split(" ");
		int n=Integer.parseInt(aux[0]);
		int m=Integer.parseInt(aux[1]);
		
		while(n!=0 && m!=0)
		{
			for (int i=0; i<n; i++)
			{
				
			}
			
			n=Integer.parseInt(aux[0]);
			m=Integer.parseInt(aux[1]);
		}
	}
}