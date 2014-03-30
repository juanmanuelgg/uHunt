package map;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;

public class HardwoodSpecies
{
	private static BufferedReader br;
	private static boolean test=true;

	public static void main(String[] args) throws IOException 
	{
		if(test) br=new BufferedReader(new FileReader(new File("./data/map/HardwoodSpecies.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		solve();
		br.close();
	}

	private static void solve() throws IOException
	{
		SortedMap<String, Double> mapeo=new TreeMap<String, Double>();
		int casos=Integer.parseInt(br.readLine());
		double total;

		for(int i=0; i<casos; i++)
		{
			mapeo.clear();
			total=0.0;

			if(i==0) br.readLine();
			for(String line=br.readLine(); line!=null&&!line.equals(""); line=br.readLine())
			{
				Double reps=mapeo.get(line);
				if(reps==null)mapeo.put(line, 1.0);
				else mapeo.put(line, reps+1);

				total++;
			}

			if(i>0) System.out.println();
			for(Entry<String, Double> entry : mapeo.entrySet())
			{
				double valor=(entry.getValue()*100.0)/total;
				System.out.printf("%s %.4f\n", entry.getKey(),valor);
			}
		}
	}

}