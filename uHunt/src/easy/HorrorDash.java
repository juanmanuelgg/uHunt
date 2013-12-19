package easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HorrorDash
{
	private static BufferedReader br;
	private static boolean test=true;

	public static void main(String[] args) throws IOException 
	{
		if(test)br=new BufferedReader(new FileReader(new File("./data/easy/HorrorDash.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		solucionarProblema();
		br.close();
	}

	private static void solucionarProblema() throws NumberFormatException, IOException 
	{
		int casos=Integer.parseInt(br.readLine()), max, vel;
		String[] param;
		
		for (int i=1; i<=casos ; i++)
		{
			param=br.readLine().split(" ");
			max=0;
			for (int j = 1; j < param.length; j++)
			{
				vel=Integer.parseInt(param[j]);
				if(vel>max) max=vel;		
			}
			System.out.println("Case "+i+": "+max);
		}
	}
	
}