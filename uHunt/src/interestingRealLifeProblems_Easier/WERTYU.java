package interestingRealLifeProblems_Easier;

//ID: 10082
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class WERTYU
{
	private static BufferedReader br;
	private static boolean test=true;
	
	private static char[] normal=" 1234567890-=WERTYUIOP[]\\SDFGHJKL;'XCVBNM,./".toCharArray();
	private static char[] cambio=" `1234567890-QWERTYUIOP[]ASDFGHJKL;ZXCVBNM,.".toCharArray();
	private static Map<Character,Character> map;
	
	public static void main(String[] args) throws IOException 
	{
		if(test)br=new BufferedReader(new FileReader(new File("./data/interestingRealLifeProblems_Easier/WERTYU.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		solve();
		br.close();
	}

	private static void solve() throws IOException
	{
		map=new HashMap<Character, Character>();
		for (int i=0; i<normal.length; i++) map.put(normal[i], cambio[i]);
		
		String linea=br.readLine();
		while(linea!=null)
		{
			char[] texto=linea.toCharArray();
			for (char c : texto) System.out.print(map.get(c));
			System.out.println();
			
			linea=br.readLine();
		}
	}
	
}