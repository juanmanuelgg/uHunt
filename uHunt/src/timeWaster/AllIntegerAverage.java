package timeWaster;

//ID: 12060
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AllIntegerAverage
{
	private static BufferedReader br;
	private static boolean test=true;
	
	public static void main(String[] args) throws IOException 
	{
		if(test)br=new BufferedReader(new FileReader(new File("./data/timeWaster/AllIntegerAverage.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		solve();
		br.close();
	}

	private static void solve() throws IOException
	{
		String linea=br.readLine();
		double cuantos,suma,rta;
		int auxRta;
		while(!linea.equals("0"))
		{
			suma=0;
			String[] aux=linea.split(" ");
			cuantos=Double.parseDouble(aux[0]);
			for (int i = 1; i <= cuantos; i++) suma+=Double.parseDouble(aux[i]);

			rta=suma/cuantos;
			rta=(rta%1==0)?rta:(rta-((int)rta))*cuantos;
			System.out.println(rta);
			linea=br.readLine();
		}
	}
	
}