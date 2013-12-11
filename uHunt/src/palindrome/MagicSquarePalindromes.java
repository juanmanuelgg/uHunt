package palindrome;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MagicSquarePalindromes 
{
	private static BufferedReader br;
	private static boolean test=true;

	public static void main(String[] args) throws IOException 
	{
		if(test)br=new BufferedReader(new FileReader(new File("./data/palindrome/MagicSquarePalindromes.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		solve();
		br.close();
	}

	private static void solve() throws IOException 
	{
		int casos=Integer.parseInt(br.readLine());
		for (int cs = 1; cs <= casos ; cs++)
		{
			String filtro1="";
			char[] linea=br.readLine().toCharArray();
			for (char c : linea) if(c>=97 && c<=122) filtro1+=c;

			char[] letras=filtro1.toCharArray();
			double aux=Math.sqrt(filtro1.length());
			int lado=(int) aux;
			boolean palindromo=true;
			
			if(aux%1==0)
			{
				char[][] matriz=new char[lado][lado];

				for (int i = 0; i < lado; i++)
					for (int j = 0; j < lado; j++) matriz[i][j]=letras[(i*lado)+j];

				for (int i = 0; i < lado && palindromo; i++) 
				{
					String pal1="",pal2="",pal3="",pal4="";
					for (int j = 0; j < lado ; j++) 
					{
						pal1+=matriz[i][j];
						pal2+=matriz[j][i];
						pal3+=matriz[lado-i-1][lado-j-1];
						pal4+=matriz[lado-j-1][lado-i-1];
					}
					if(!pal1.equals(pal2) || !pal2.equals(pal3) || !pal3.equals(pal4)) palindromo=false;
				}
			}
			else palindromo=false;
			
			System.out.println("Case #"+cs+":");
			String rta=(palindromo)?""+lado:"No magic :(";
			System.out.println(rta);
		}
	}

}