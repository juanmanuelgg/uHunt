package anagram;

//ID: 156
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class Ananagrams
{
	private static BufferedReader br;
	private static boolean test=true;
	private static Map<String, List<String>> map=new HashMap<String, List<String>>();

	public static void main(String[] args) throws IOException
	{
		if(test) br=new BufferedReader(new FileReader(new File("./data/anagram/Ananagrams.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		solve();
		br.close();
	}

	private static void solve() throws IOException
	{
		String linea=br.readLine();

		while(!linea.equals("#"))
		{
			String[] aux = linea.split(" +");
			for (String pal : aux)
			{
				if(!pal.equals(""))
				{
					String minusc = pal.toLowerCase();
					char[] letras = minusc.toCharArray();
					Arrays.sort(letras);
					String key = new String(letras);

					List<String> reps = map.get(key);
					if(reps==null)  map.put(key, reps=new ArrayList<String>());
					reps.add(pal);
				}

			}
			linea=br.readLine();
		}

		PriorityQueue<String> ananagrams=new PriorityQueue<String>();
		for (List<String> l : map.values()) if(l.size()==1) ananagrams.add(l.get(0));

		while(!ananagrams.isEmpty()) System.out.println(ananagrams.poll());
	}

}