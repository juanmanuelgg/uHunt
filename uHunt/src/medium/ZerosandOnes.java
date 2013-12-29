package medium;

//ID: 10324
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ZerosandOnes 
{
	private static BufferedReader br;
	private static boolean test=true;

	public static void main(String[] args) throws IOException 
	{
		if(test)br=new BufferedReader(new FileReader(new File("./data/medium/ZerosandOnes.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		solve();
		br.close();
	}

	private static void solve() throws IOException
	{
		String linea=br.readLine();
		int i=1;
		while(linea!=null)
		{
			System.out.println("Case "+(i++)+":");
			int casos=Integer.parseInt(br.readLine());
			
			while(casos--!=0)
			{
				String aux[] =br.readLine().split(" ");
				int a=Integer.parseInt(aux[0]);
				int b=Integer.parseInt(aux[1]);
				int beginIndex=Math.min(a, b);
				int endIndex=Math.max(a, b);
				
				char[] pedazo=linea.substring(beginIndex, endIndex+1).toCharArray();

				char anterior=pedazo[0];
				boolean iguales=true;
				for (int j=1; j<pedazo.length && iguales; j++)
				{
					if(anterior!=pedazo[j]) iguales=false;
					anterior=pedazo[j];
				}
				
				if(iguales) System.out.println("Yes");
				else System.out.println("No");
			}

			linea=br.readLine();
		}
	}

}