package easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PackingForHoliday 
{
	private static BufferedReader br;
	private static boolean test=true;
	
	public static void main(String[] args) throws IOException 
	{
		if(test) br=new BufferedReader(new FileReader(new File("./data/easy/PackingForHoliday.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		solve();
		br.close();
	}

	private static void solve() throws NumberFormatException, IOException
	{
		int casos=Integer.parseInt(br.readLine());
		for (int i = 1; i <= casos; i++)
		{
			String[] aux=br.readLine().split(" ");
			int L=Integer.parseInt(aux[0]);
			int W=Integer.parseInt(aux[1]);
			int H=Integer.parseInt(aux[2]);
			
			System.out.print("Case "+i+": ");
			if(L<=20 && W<=20 && H<=20) System.out.println("good");
			else System.out.println("bad");
		}
	}
}