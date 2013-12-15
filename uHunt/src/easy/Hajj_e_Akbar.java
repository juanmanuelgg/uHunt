package easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hajj_e_Akbar
{
	private static BufferedReader br;
	private static boolean test=true;
	
	public static void main(String[] args) throws IOException
	{	
		if(test) br=new BufferedReader(new FileReader(new File("./data/easy/Hajj_e_Akbar.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		solve();
		br.close();
	}

	private static void solve() throws IOException
	{
		String linea=br.readLine();
		for(int i=1;!linea.equals("*");i++)
		{
			System.out.print("Case "+i+": ");
			if(linea.equals("Hajj")) System.out.println("Hajj-e-Akbar");
			else System.out.println("Hajj-e-Asghar");
			linea=br.readLine();
		}
	}
	
}