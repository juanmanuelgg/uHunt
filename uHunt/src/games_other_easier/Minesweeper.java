package games_other_easier;

//ID: 10189
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Minesweeper 
{
	private static BufferedReader br;
	private static boolean test=true;

	public static void main(String[] args) throws IOException 
	{
		if(test) br=new BufferedReader(new FileReader(new File("./data/games_other_easier/Minesweeper.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		solve();
		br.close();
	}

	private static void solve() throws IOException
	{
		String linea=br.readLine();
		int fielNum=1;
		boolean primero=true;
		while(!linea.equals("0 0"))
		{
			if(!primero) System.out.println();
			else primero=false;
			System.out.println("Field #"+(fielNum++)+":");

			String[] aux=linea.split(" ");
			int n=Integer.parseInt(aux[0]);
			int m=Integer.parseInt(aux[1]);

			int[][] rta=new int[n][m];
			boolean[][] minas=new boolean[n][m];
			for (int i=0; i<n; i++)
			{
				char[] enFila=br.readLine().toCharArray();
				for (int j=0; j<m; j++)
				{
					if(enFila[j]=='*')
					{
						minas[i][j]=true;
						if(i+1<n) rta[i+1][j]++;
						if(i-1>=0) rta[i-1][j]++;
						if(j+1<m) rta[i][j+1]++;
						if(j-1>=0) rta[i][j-1]++;

						if(i+1<n && j+1<m)rta[i+1][j+1]++;
						if(i+1<n && j-1>=0)rta[i+1][j-1]++;
						if(i-1>=0 && j+1<m)rta[i-1][j+1]++;
						if(i-1>=0 && j-1>=0)rta[i-1][j-1]++;
					}
				}
			}

			for (int i=0; i<n; i++)
			{
				for (int j=0; j<m; j++)
				{
					if(minas[i][j]) System.out.print("*");
					else System.out.print(rta[i][j]);
				}
				System.out.println();
			}

			linea=br.readLine();
		}
	}

}