package map;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class WordIndex
{
	private static BufferedReader br;
	private static boolean test=true;
	private static Map<String, Integer> mapeo=new HashMap<String, Integer>(83681);

	public static void main(String[] args) throws IOException 
	{
		if(test) br=new BufferedReader(new FileReader(new File("./data/map/WordIndex.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		preProcesarMapeo();
		solve();
		br.close();
	}

	private static void preProcesarMapeo()
	{
		char[] letras={' ','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		char[] x=new char[5];

		String comb;
		int index=1;
		for(int i=0; i<27; i++)
		{
			for(int j=(i>0)?i+1:i; j<27; j++)
			{
				for(int k=(j>0)?j+1:j; k<27; k++)
				{
					for(int l=(k>0)?k+1:k; l<27; l++)
					{
						for(int m=l+1; m<27; m++)
						{
							if(!(i!=0&&i==j || i!=0&&i==k || i!=0&&i==l || i!=0&&i==m || j!=0&&j==k || j!=0&&j==l || j!=0&&j==m || k!=0&&k==l || k!=0&&k==m || l!=0&&l==m))
							{
								x[0]=letras[i];
								x[1]=letras[j];
								x[2]=letras[k];
								x[3]=letras[l];
								x[4]=letras[m];
								comb=new String(x);
								mapeo.put(comb.trim(), index++);
							}
						}
					}
				}
			}
		}
	}

	private static void solve() throws IOException
	{
		for(String line=br.readLine(); line!=null; line=br.readLine())
		{
			Integer rta=mapeo.get(line);
			if(rta==null) System.out.println(0);
			else System.out.println(rta);
		}
	}

}