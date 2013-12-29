package array_1D;

//ID: 755
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class p487_3279
{
	private static BufferedReader br;
	private static boolean test=true;
	private static int[] mapeo={2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,7,0,7,7,8,8,8,9,9,9,0};

	public static void main(String[] args) throws IOException 
	{
		if(test)br=new BufferedReader(new FileReader(new File("./data/array_1D/p487_3279.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		solucionarProblema();
		br.close();
	}

	private static void solucionarProblema() throws IOException
	{
		int casos=Integer.parseInt(br.readLine());
		
		for (int i=0; i<casos; i++)
		{
			br.readLine();
			if(i>0) System.out.println();

			int numNumeros = Integer.parseInt(br.readLine());
			TreeMap<String, Integer> numeros = new TreeMap<String, Integer>();
			for (int j=0; j<numNumeros; j++)
			{
				String numDef = procesar(br.readLine());
				
				Integer freq = numeros.get(numDef);
				numeros.put(numDef, (freq==null)?1:freq+1);
			}
			
			boolean imp = false;
			for (Map.Entry<String, Integer> esteNum : numeros.entrySet())
			{
				if(esteNum.getValue()>1)
				{
					imp=true;
					System.out.println(esteNum.getKey()+" "+esteNum.getValue());
				}
			}
			if(!imp) System.out.println("No duplicates.");
		}
	}

	private static String procesar(String numEnCrudo)
	{
		String rta="";
		for (char c : numEnCrudo.toCharArray())
		{
			if(c>=48 && c<=57)rta+=c;
			else if(c>=65 && c<90 && c!=81)rta+=mapeo[c-'A'];

			if(rta.length()==3)rta+='-';
		}
		return rta;
	}

}