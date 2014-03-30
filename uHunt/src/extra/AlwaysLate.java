package extra;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class AlwaysLate
{
	private static BufferedReader br;
	private static boolean test=true;
	
	public static void main(String[] args) throws IOException
	{
		if(test) br=new BufferedReader(new FileReader(new File("./data/extra/AlwaysLate.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		solve();
		br.close();
	}

	private static void solve() throws IOException
	{
		int n,r,from,to,dist,numQueris,cont=0;
		String[] aux;
		for(String line=br.readLine(); line!=null; line=br.readLine(),cont++)
		{
			aux=line.split(" ");
			n=Integer.parseInt(aux[0]);
			r=Integer.parseInt(aux[1]);
			
			@SuppressWarnings("unchecked")
			ArrayList<Integer>[] adj = (ArrayList<Integer>[])new ArrayList[n];
			for(int i=0; i<n; i++) adj[i]=new ArrayList<Integer>();
			
			//Armar el Grafo
			while(r--!=0)
			{
				aux=br.readLine().split(" ");
				from=Integer.parseInt(aux[0]);
				to=Integer.parseInt(aux[1]);
				dist=Integer.parseInt(aux[2]);
			}
			
			numQueris=Integer.parseInt(br.readLine());
			System.out.printf("Set #%d\n",cont);
			//Resolver queris
			while(numQueris--!=0)
			{
				System.out.println(br.readLine());
			}
			
			br.readLine();
		}
	}
}
