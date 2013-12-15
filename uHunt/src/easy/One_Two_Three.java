package easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class One_Two_Three
{
	private static BufferedReader br;
	private static boolean test=true;

	public static void main(String[] args) throws IOException 
	{
		if(test)br=new BufferedReader(new FileReader(new File("./data/easy/One_Two_Three.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		solve();
		br.close();
	}

	private static void solve() throws IOException
	{
		char[] one={'o','n','e'};
		int casos=Integer.parseInt(br.readLine()), rta=0, num1=0;
		
		for (int i = 0; i < casos; i++)
		{
			char[] letras=br.readLine().toCharArray();
			
			if(letras.length==5) rta=3;
			else
			{
				num1=0; 
				for (int j=0; j<letras.length; j++) if(letras[j]==one[j]) num1++;
				if(num1>=2)rta=1;
				else rta=2;
			}
			
			System.out.println(rta);
		}
	}
	
}