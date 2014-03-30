package map;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Conformity
{
	private static BufferedReader br;
	private static boolean test=true;

	public static void main(String[] args) throws IOException 
	{
		if(test) br=new BufferedReader(new FileReader(new File("./data/map/Conformity.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		solve();
		br.close();
	}

	private static void solve() throws IOException
	{
		for(int i=Integer.parseInt(br.readLine()); i!=0; i=Integer.parseInt(br.readLine()))
		{
			Map<String,Integer> map=new HashMap<String,Integer>();
			for(int j=0; j<i; j++)
			{
				String[] aux=br.readLine().split(" ");
				Arrays.sort(aux);
				String lol=aux[0]+aux[1]+aux[2]+aux[3]+aux[4];
				
				Integer reps=map.get(lol);
				if(reps==null) map.put(lol, 1);
				else map.put(lol, reps+1);
			}
			
			int max=0;
			for(Integer val: map.values()) if(val>max) max=val;
			
			int grups=0;
			for(Integer val: map.values()) if(val==max) grups++;
			
			System.out.println(grups*max);
		}
	}

}