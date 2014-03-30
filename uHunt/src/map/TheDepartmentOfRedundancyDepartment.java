package map;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class TheDepartmentOfRedundancyDepartment
{
	private static BufferedReader br;
	private static boolean test=true;

	public static void main(String[] args) throws IOException 
	{
		if(test) br=new BufferedReader(new FileReader(new File("./data/map/TheDepartmentOfRedundancyDepartment.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		solve();
		br.close();
	}

	private static void solve() throws IOException
	{
		Map<String, Integer> mapeo=new LinkedHashMap<String, Integer>();
		
		for(String line=br.readLine(); line!=null; line=br.readLine())
		{
			String[] aux=line.split(" ");
			for (String string : aux)
			{
				Integer reps=mapeo.get(string);
				if(reps==null)mapeo.put(string, 1);
				else mapeo.put(string, reps+1);
			}
		}
		
		for(Entry<String, Integer> entry : mapeo.entrySet()) System.out.println(entry.getKey()+" "+entry.getValue());
	}

}