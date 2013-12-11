package easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TeXQuotes
{
	private static BufferedReader br;
	private static boolean test=true;
	
	public static void main(String[] args) throws IOException 
	{
		if(test)br=new BufferedReader(new FileReader(new File("./data/easy/TeXQuotes.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		solve();
		br.close();
	}

	private static void solve() throws IOException
	{
		int cont=0;
		String linea=br.readLine();
		while(linea!=null)
		{
			char[] aux=linea.toCharArray();
			String resp="";
			for (char c : aux)
			{
				if(c=='"') resp+=(cont++%2==0)?"``":"''";
				else resp+=c;
			}
			System.out.println(resp);
			linea=br.readLine();
		}
	}
	
}