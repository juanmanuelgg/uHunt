package easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecretResearch
{
	private static BufferedReader br;
	private static boolean test=true;
	
	public static void main(String[] args) throws IOException
	{	
		if(test) br=new BufferedReader(new FileReader(new File("./data/easy/SecretResearch.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		solve();
		br.close();
	}

	private static void solve() throws IOException
	{
		int casos=Integer.parseInt(br.readLine());
		
		while(casos-- != 0)
		{
			String exp=br.readLine();
			if(exp.equals("1") || exp.equals("4") || exp.equals("78")) System.out.println("+");
			else if(exp.endsWith("35")) System.out.println("-");
			else if(exp.startsWith("9") && exp.endsWith("4")) System.out.println("*");
			else if(exp.startsWith("190")) System.out.println("?");
		}
	}
	
}