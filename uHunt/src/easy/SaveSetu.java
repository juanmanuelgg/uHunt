package easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SaveSetu
{
	private static BufferedReader br;
	private static boolean test=true;
	
	public static void main(String[] args) throws IOException 
	{
		if(test) br=new BufferedReader(new FileReader(new File("./data/easy/SaveSetu.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		solve();
		br.close();
	}

	private static void solve() throws NumberFormatException, IOException
	{
		int casos=Integer.parseInt(br.readLine()), total=0;
		for (int i = 0; i < casos; i++)
		{
			String[] comando=br.readLine().split(" ");
			if(comando[0].equals("donate")) total+=Integer.parseInt(comando[1]);
			else System.out.println(total);
		}
	}
	
}