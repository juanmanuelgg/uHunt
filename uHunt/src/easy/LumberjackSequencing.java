package easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LumberjackSequencing
{
	private static BufferedReader br;
	private static boolean test=true;
	
	public static void main(String[] args) throws IOException 
	{
		if(test)br=new BufferedReader(new FileReader(new File("./data/easy/LumberjackSequencing.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		solve();
		br.close();
	}

	private static void solve() throws IOException 
	{
		int N=Integer.parseInt(br.readLine());
		System.out.println("Lumberjacks:");
		
		while(N--!=0)
		{
			String[] aux=br.readLine().split(" ");
			int[] largoBarbas=new int[aux.length];
			for(int i=0; i<aux.length; i++) largoBarbas[i]=Integer.parseInt(aux[i]);
			
			System.out.println(estanOrdenados(largoBarbas));
		}
	}

	private static String estanOrdenados(int[] largoBarbas)
	{
		boolean sortUp=true;
		boolean sortDown=true;
		for (int i=0,j=1; j<largoBarbas.length; i++,j++) 
		{
			if(largoBarbas[i]<largoBarbas[j]) sortDown=false;
			else if(largoBarbas[i]>largoBarbas[j]) sortUp=false;			
		}
		
		return sortUp||sortDown?"Ordered":"Unordered";
	}
}