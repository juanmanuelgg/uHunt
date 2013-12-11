package palindrome;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MotherBear 
{
	private static BufferedReader br;
	private static boolean test=true;

	public static void main(String[] args) throws IOException 
	{
		if(test)br=new BufferedReader(new FileReader(new File("./data/palindrome/MotherBear.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		solve();
		br.close();
	}

	private static void solve() throws IOException 
	{
		String linea=br.readLine();
		while(!linea.equals("DONE"))
		{
			char[] letras=linea.toCharArray();
			String filtro1="";
			for (char c : letras) 
			{
				if(c>=65 && c<=90) filtro1+=(char)(c+32);
				else if(c>=97 && c<=122) filtro1+=c;
			}

			boolean palindroma=true;
			char[] filtrado=filtro1.toCharArray();
			int tam=filtrado.length;
			
			for (int i = 0; i < tam/2 && palindroma; i++) 
				if(filtrado[i]!=filtrado[tam-i-1]) palindroma=false;

			String rta=(palindroma)?"You won't be eaten!":"Uh oh..";
			System.out.println(rta);
			linea=br.readLine();
		}
	}

}