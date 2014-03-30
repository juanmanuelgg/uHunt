package map;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class UniqueSnowflakes
{
	private static BufferedReader br;
	private static boolean test=true;

	public static void main(String[] args) throws IOException 
	{
		if(test) br=new BufferedReader(new FileReader(new File("./data/map/UniqueSnowflakes.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		solve();
		br.close();
	}

	private static void solve() throws IOException
	{
		int casos=Integer.parseInt(br.readLine());
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		
		while(casos--!=0)
		{
			map.clear();
			int n=Integer.parseInt(br.readLine());
			for(int i=0; i<n; i++)
			{
				int key=Integer.parseInt(br.readLine());
				
				Integer reps=map.get(key);
				if(reps==null) map.put(key, 1);
				else map.put(key, reps+1);
			}
			System.out.println(map);
		}
	}

}