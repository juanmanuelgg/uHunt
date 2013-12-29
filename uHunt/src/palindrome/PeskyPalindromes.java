package palindrome;

//ID: 353
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class PeskyPalindromes 
{
	private static BufferedReader br;
	private static boolean test=true;

	public static void main(String[] args) throws IOException
	{
		if(test) br=new BufferedReader(new FileReader(new File("./data/palindrome/PeskyPalindromes.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		solve();
		br.close();
	}

	private static void solve() throws IOException
	{
		String linea=br.readLine();
		Set<String> pals=new HashSet<String>();
		while(linea!=null)
		{
			char[] letras=linea.toCharArray();
			StringBuilder str=new StringBuilder();
			
			for (int i = 0; i < letras.length; i++) 
			{
				for (int j = i; j < letras.length; j++)
				{
					str.append(letras[j]);

					//Palindrome Test en aux
					char[] auxltrs=str.toString().toCharArray();
					boolean palindroma=true;
					int tam=auxltrs.length;
					for(int ia=0; ia<tam/2 && palindroma ; ia++) if(auxltrs[ia]!=auxltrs[tam-ia-1]) palindroma=false;

					if(palindroma) pals.add(str.toString());
				}
				str.delete(0, str.length());
			}

			System.out.println("The string '"+linea+"' contains "+pals.size()+" palindromes.");
			linea=br.readLine();
			pals.clear();
		}

	}
}
