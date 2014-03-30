package games_other_easier;

//ID: 489
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HangmanJudge 
{
	private static BufferedReader br;
	private static boolean test=true;

	public static void main(String[] args) throws IOException 
	{
		if(test) br=new BufferedReader(new FileReader(new File("./data/games_other_easier/HangmanJudge.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		solve();
		br.close();
	}

	private static void solve() throws NumberFormatException, IOException
	{
		String linea=br.readLine();
		Map<Character,Integer> map=new HashMap<Character, Integer>();
		Set<Character> set=new HashSet<Character>();

		while(!linea.equals("-1"))
		{
			int i=Integer.parseInt(linea);
			System.out.println("Round "+i);
			
			set.clear();
			map.clear();
			char[] palabra=br.readLine().toCharArray();
			for (char c : palabra) 
			{
				Integer reps=map.get(c);
				map.put(c, (reps==null)?1:reps+1);
			}

			set.clear();
			char[] letras=br.readLine().toCharArray();	
			for (char c : letras) set.add(c);
			
			int adivinadas=0, fallos=0;
			for (char c : set)
			{
				Integer reps=map.get(c);
				if(reps==null) fallos++;
				else adivinadas+=reps;

				if(fallos==7) break;
			}
			
			if(adivinadas>=palabra.length) System.out.println("You win.");
			else if(fallos==7) System.out.println("You lose.");
			else System.out.println("You chickened out.");

			linea=br.readLine();
		}
	}

}