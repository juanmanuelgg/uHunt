package time;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Y3K_Problem
{
	private static BufferedReader br;
	private static boolean test=true;
	
	public static void main(String[] args) throws IOException 
	{
		if(test)br=new BufferedReader(new FileReader(new File("./data/time/Y3K_Problem.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		solve();
		br.close();
	}

	private static void solve() throws IOException
	{
		String linea=br.readLine();
		while(!linea.equals("0 0 0 0"))
		{
			String[] paraMprob=linea.split(" ");
			int adelantar=Integer.parseInt(paraMprob[0]);
			int dia=Integer.parseInt(paraMprob[1]);
			int mes=Integer.parseInt(paraMprob[2]);
			int anio=Integer.parseInt(paraMprob[3]);
			
			System.out.println();
			linea=br.readLine();
		}
	}
	
}