package easy;

//ID: 12279
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmoogleBalance
{
	private static BufferedReader br;
	private static boolean test=true;

	public static void main(String[] args) throws IOException 
	{
		if(test)br=new BufferedReader(new FileReader(new File("./data/easy/EmoogleBalance.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		solve();
		br.close();
	}

	private static void solve() throws IOException
	{
		int numMax=Integer.parseInt(br.readLine().trim()), numCeros=0;
		
		for (int i=1; numMax!=0 ; i++)
		{
			numCeros=0;
			String[] caso=br.readLine().trim().split(" ");
			for (String cadena : caso) if(cadena.equals("0")) numCeros++;
			
			System.out.println("Case "+i+": "+(numMax-(2*numCeros)));
			numMax=Integer.parseInt(br.readLine().trim());
		}
	}
	
}