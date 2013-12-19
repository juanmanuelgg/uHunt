package easy;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.SortedSet;
import java.util.TreeSet;

public class AndysFirstDictionary
{
	private static BufferedReader br;
	private static boolean test=true;

	public static void main(String[] args) throws IOException 
	{
		if(test) br=new BufferedReader(new FileReader(new File("./data/easy/AndysFirstDictionary.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		solve();
		br.close();
	}

	private static void solve() throws IOException
	{		
		SortedSet<String> palabras=new TreeSet<String>();
		String linea=br.readLine(), aux;
		char[]letras;
		
		while(linea!=null)
		{
			aux="";
			letras=linea.toCharArray();
			for (char c : letras)
			{
				if(Character.isLetter(c)) aux+=Character.toLowerCase(c);
				else if(!aux.equals(""))
				{
					palabras.add(aux);
					aux="";
				}
			}
			
			if(aux.length()>0) palabras.add(aux);
			linea=br.readLine();
		}

		for (String pal : palabras) System.out.println(pal);
	}

}