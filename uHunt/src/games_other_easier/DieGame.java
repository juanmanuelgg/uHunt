package games_other_easier;

//ID: 10409
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DieGame 
{
	private static BufferedReader br;
	private static boolean test=true;
	
	private static int top,bottom,north,south,east,west;

	public static void main(String[] args) throws IOException 
	{
		if(test) br=new BufferedReader(new FileReader(new File("./data/games_other_easier/DieGame.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		solve();
		br.close();
	}

	private static void solve() throws NumberFormatException, IOException
	{
		int num=Integer.parseInt(br.readLine());
		String comando;
		while(num!=0)
		{
			top=1; north=2; south=5; east=4; west=3; bottom=6;
			while(num--!=0)
			{
				comando=br.readLine();
				//Procesar Comando
				if(comando.equals("north"))
				{
					int temp=top;
					top=south;
					south=bottom;
					bottom=north;
					north=temp;
				}
				else if(comando.equals("south"))
				{
					int temp=top;
					top=north;
					north=bottom;
					bottom=south;
					south=temp;
				}
				else if(comando.equals("east"))
				{
					int temp=top;
					top=west;
					west=bottom;
					bottom=east;
					east=temp;
				}
				else 
				{
					int temp=top;
					top=east;
					east=bottom;
					bottom=west;
					west=temp;
				}
			}
			System.out.println(top);
			num=Integer.parseInt(br.readLine());
		}
	}

}