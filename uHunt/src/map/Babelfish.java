package map;

//ID: 10282
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Babelfish
{
	private static BufferedReader br;
	private static boolean test=true;

	public static void main(String[] args) throws IOException 
	{
		if(test) br=new BufferedReader(new FileReader(new File("./data/map/Babelfish.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		solve();
		br.close();
	}

	private static void solve() throws IOException
	{
		String linea=br.readLine();
		Map<String, String> diccionario=new HashMap<String, String>();
		String[] aux;
		
		while(!linea.equals(""))
		{
			aux=linea.split(" ");
			diccionario.put(aux[1], aux[0]);

			linea=br.readLine();
		}

		linea=br.readLine();
		String rta;
		
		while(linea!=null)
		{
			rta=(diccionario.get(linea)!=null)?diccionario.get(linea):"eh";
			System.out.println(rta);
			linea=br.readLine();
		}
	}

}