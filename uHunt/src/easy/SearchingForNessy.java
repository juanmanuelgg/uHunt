package easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SearchingForNessy
{
	private static BufferedReader br;
	private static boolean test=true;
	
	public static void main(String[] args) throws IOException 
	{
		if(test)br=new BufferedReader(new FileReader(new File("./data/easy/SearchingForNessy.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		solve();
		br.close();
	}

	private static void solve() throws IOException
	{
		int casos=Integer.parseInt(br.readLine());
		for (int i = 0; i < casos; i++)
		{
			String[] aux=br.readLine().split(" ");
			int a=Integer.parseInt(aux[0]);
			int b=Integer.parseInt(aux[1]);
			
			//System.out.println(((int)(a/3))*((int)(b/3)));
		}
	}
	
}