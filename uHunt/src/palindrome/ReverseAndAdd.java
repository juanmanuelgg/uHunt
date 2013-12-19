package palindrome;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseAndAdd
{
	private static BufferedReader br;
	private static boolean test=true;

	public static void main(String[] args) throws IOException 
	{
		if(test) br=new BufferedReader(new FileReader(new File("./data/palindrome/ReverseAndAdd.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		solve();
		br.close();
	}

	private static void solve() throws IOException 
	{
		int casos=Integer.parseInt(br.readLine()), i, tam;
		long num, reverseNum;
		String auxNum, reverseAuxNum, resulatente="";
		boolean palindromo;

		while(casos--!=0)
		{
			auxNum=br.readLine().trim();
			num=Integer.parseInt(auxNum);
			palindromo=false;

			for (i=0; !palindromo && i<=1000; i++) 
			{
				reverseAuxNum="";
				for (int j=auxNum.length()-1; j>=0; j--) reverseAuxNum+=auxNum.charAt(j);

				reverseNum=Long.parseLong(reverseAuxNum);
				resulatente=(num+reverseNum)+"";
				
				palindromo=true;
				tam=resulatente.length();
				for (int j=0; j<tam/2 && palindromo; j++)
					if(resulatente.charAt(j)!=resulatente.charAt(tam-1-j)) palindromo=false;
				
				auxNum=resulatente;
				num=Long.parseLong(resulatente);
			}
			System.out.println(i+" "+resulatente);
		}
	}
}
