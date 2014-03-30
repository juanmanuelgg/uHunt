package medium;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BlowingFuses
{
	private static BufferedReader br;
	private static boolean test=true;
	
	public static void main(String[] args) throws IOException
	{
		if(test) br=new BufferedReader(new FileReader(new File("./data/medium/BlowingFuses.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		solve();
		br.close();
	}

	private static void solve() throws IOException
	{
		String linea=br.readLine();
		
		for(int i=1; !linea.equals("0 0 0"); i++) 
		{
			String[] aux=linea.split(" ");
			int n=Integer.parseInt(aux[0]);
			int m=Integer.parseInt(aux[1]);
			int c=Integer.parseInt(aux[2]);
			
			int[][] amp=new int[n][2];
			int mpc=0;
			int max=0;
			
			for(int j=0; j<n; j++)
			{
				amp[j][0] = Integer.parseInt(br.readLine());
				amp[j][1] = 0;
			}
			
			for(int j=0; j<m; j++)
			{
				int lect=Integer.parseInt(br.readLine())-1;
				if(amp[lect][1] == 0)
				{
					mpc += amp[lect][0];
					amp[lect][1] = 1;
				}
				else
				{
					mpc -= amp[lect][0];
					amp[lect][1] = 0;
				}
				if(max < mpc) max = mpc;
			}
			
			if(max > c)
			{
				System.out.println("Sequence "+i);
				System.out.println("Fuse was blown.");
			}
			else
			{
				System.out.println("Sequence "+i);
				System.out.println("Fuse was not blown.");
				System.out.println("Maximal power consumption was "+max+" amperes.");
			}
			System.out.println();
			
			linea=br.readLine();			
			
		}
	}
}