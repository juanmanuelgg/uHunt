package palindrome;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Palindromes
{
	private static BufferedReader br;
	private static boolean test=true;
	
	private static Map<Character,Character> map=new HashMap<Character, Character>();
	private static char[] salida="ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
	private static char[] llegad="A   3  HIL JM O   2TUVWXY51SE Z  8 ".toCharArray();

	public static void main(String[] args) throws IOException 
	{
		if(test) br=new BufferedReader(new FileReader(new File("./data/palindrome/Palindromes.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		init();
		solve();
		br.close();
	}

	private static void init()
	{
		for (int i=0; i<salida.length; i++) map.put(salida[i], llegad[i]);
	}

	private static void solve() throws IOException 
	{
		String linea=br.readLine();
		boolean palindromo,  mirroredString;
		char[] aux;
		int tam;
		
		while(linea!=null)
		{
			linea=linea.trim();
			System.out.print(linea);
			
			palindromo=mirroredString=true;
			
			aux=linea.toCharArray();
			tam=aux.length;
			for (int i = 0; i<tam/2 && (palindromo||mirroredString); i++)
			{
				if(aux[i]!=aux[tam-i-1]) palindromo=false;
				if(!(map.get(aux[i])==aux[tam-i-1])) mirroredString=false;
			}
			
			if(!palindromo && !mirroredString) System.out.println(" -- is not a palindrome.\n");
			else if(palindromo && !mirroredString) System.out.println(" -- is a regular palindrome.\n");
			else if(!palindromo && mirroredString) System.out.println(" -- is a mirrored string.\n");
			else System.out.println(" -- is a mirrored palindrome.\n");
			
			linea=br.readLine();
		}
	}

}