package easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LanguageDetection
{
	private static BufferedReader br;
	private static boolean test=true;

	public static void main(String[] args) throws IOException 
	{
		if(test)br=new BufferedReader(new FileReader(new File("./data/easy/LanguageDetection.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		solve();
		br.close();
	}

	private static void solve() throws IOException
	{
		String linea=br.readLine(), rta="";
		
		for(int i=1;!linea.equals("#");i++)
		{
			if(linea.contains("HELLO"))rta="ENGLISH";
			else if(linea.contains("HOLA"))rta="SPANISH";
			else if(linea.contains("HALLO"))rta="GERMAN";
			else if(linea.contains("BONJOUR"))rta="FRENCH";
			else if(linea.contains("CIAO"))rta="ITALIAN";
			else if(linea.contains("ZDRAVSTVUJTE"))rta="RUSSIAN";
			else rta="UNKNOWN";
			
			System.out.println("Case "+i+": "+rta);
			linea=br.readLine();
		}
	}
	
}