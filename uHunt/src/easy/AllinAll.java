package easy;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AllinAll
{
	private static BufferedReader br;
	private static boolean test=true;
	
	public static void main(String[] args) throws IOException 
	{
		if(test) br=new BufferedReader(new FileReader(new File("./data/easy/AllinAll.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		solve();
		br.close();
	}

	private static void solve() throws IOException
	{
		String linea=br.readLine();
		while(linea!=null)
		{
			String[] aux=linea.split(" ");
			char[] S=aux[0].toCharArray();
			char[] T=aux[1].toCharArray();
			
			String rta=(solucionarCaso(S,T))?"Yes":"No";
			
			System.out.println(rta);
			linea=br.readLine();
		}
	}

	private static boolean solucionarCaso(char[] S, char[]T)
	{
		int j=0;
		for (int i = 0; i < T.length && j <S.length; i++)
		{
			if(S[j]==T[i]) j++;
		}
		return (j==S.length);
	}
	
}