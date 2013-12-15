package easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OptimalParking
{
	private static BufferedReader br;
	private static boolean test=true;

	public static void main(String[] args) throws IOException 
	{
		if(test)br=new BufferedReader(new FileReader(new File("./data/easy/OptimalParking.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		solve();
		br.close();
	}

	private static void solve() throws IOException
	{
		int casos=Integer.parseInt(br.readLine());
		for (int i = 0; i < casos; i++)
		{
			br.readLine();
			String[] aux=br.readLine().split(" ");

			int menor=99;
			int mayor=0;
			for (int j = 0; j < aux.length; j++)
			{
				int este=Integer.parseInt(aux[j]);
				if(este>mayor) mayor=este;
				if(este<menor) menor=este;
			}

			System.out.println(2*(mayor-menor));

		}
	}

}