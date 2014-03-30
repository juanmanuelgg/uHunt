package findingPatternOrFormula_Harder;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class K_MultipleFreeSet
{

	private static BufferedReader br;
	private static boolean test=true;
	
	public static void main(String[] args) throws IOException
	{
		if(test) br=new BufferedReader(new FileReader(new File("./data/findingPatternOrFormula_Harder/K_MultipleFreeSet.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		solve();
		br.close();
	}

	private static void solve() throws IOException
	{
		int T=Integer.parseInt(br.readLine()),n,k, rta;
		String[] aux;
		
		while(T--!=0)
		{
			aux=br.readLine().split(" ");
			n=Integer.parseInt(aux[0]);
			k=Integer.parseInt(aux[1]);
			
			boolean[] nums=new boolean[n+1];
			for(int i=1;i<=n;i++) if(!nums[i] && i*k<=n) nums[i*k]=true;
			
			rta=0;
			for(int i=1;i<=n;i++) if(!nums[i]) rta++;
			System.out.println(rta);
		}
	}
}