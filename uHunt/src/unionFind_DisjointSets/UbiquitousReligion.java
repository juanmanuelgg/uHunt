package unionFind_DisjointSets;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UbiquitousReligion
{
	private static BufferedReader br;
	private static boolean test=true;
	
	public static void main(String[] args) throws IOException
	{
		if(test) br=new BufferedReader(new FileReader(new File("./data/unionFind_DisjointSets/UbiquitousReligion.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		solve();
		br.close();
	}

	private static void solve() throws IOException
	{
		String linea=br.readLine();
		for (int i=1;!linea.equals("0 0");linea=br.readLine(), i++) 
		{
			String[] aux=linea.split(" ");
			int N=Integer.parseInt(aux[0]);
			int relations=Integer.parseInt(aux[1]);
			unionFind grafo=new unionFind(N);
			
			for (int j=0; j<relations; j++)
			{
				String[] auxArco=br.readLine().split(" ");
				int p=Integer.parseInt(auxArco[0]);
				int q=Integer.parseInt(auxArco[1]);
				grafo.union(p, q);
			}
			System.out.printf("Case %d: %d\n",i,grafo.getCantConjuntos());
		}
	}
	
	private static class unionFind
	{
		private int[] idPadres;
		private int cantConjuntos;
		
		public unionFind(int N)
		{
			cantConjuntos=N;
			
			idPadres=new int[N+1];
			for(int i=0; i<N; i++) idPadres[i]=i;
		}

		public int getCantConjuntos() {return cantConjuntos;}
		
		public void union(int p, int q)
		{
			int i=root(p);
			int j=root(q);
			if(i!=j)
			{
				idPadres[i]=j;
				cantConjuntos--;
			}
		}

		private int root(int i)
		{
			int root=i;
			while(root!=idPadres[root])root=idPadres[root];
			while(i!=root)
			{
				int newp=idPadres[i];
				idPadres[i]=root;
				i=newp;
			}
			return root;
		}
		
	}
}