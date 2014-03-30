package unionFind_DisjointSets;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class VirtualFriends
{
	private static BufferedReader br;
	private static boolean test=true;

	public static void main(String[] args) throws IOException
	{
		if(test) br=new BufferedReader(new FileReader(new File("./data/unionFind_DisjointSets/VirtualFriends.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		solve();
		br.close();
	}

	private static void solve() throws IOException
	{
		int casos=Integer.parseInt(br.readLine()), arcos, p, q;

		while(casos--!=0)
		{
			arcos=Integer.parseInt(br.readLine());
			UnionFind uf=new UnionFind(2*arcos);

			Map<String, Integer> mapeoNombre=new HashMap<String, Integer>();
			for(int i=0;arcos--!=0;)
			{
				String[] aux=br.readLine().split(" ");
				if(!mapeoNombre.containsKey(aux[0])) mapeoNombre.put(aux[0], i++);
				if(!mapeoNombre.containsKey(aux[1])) mapeoNombre.put(aux[1], i++);

				p=mapeoNombre.get(aux[0]);
				q=mapeoNombre.get(aux[1]);
				System.out.println(uf.Union(p, q));
			}
		}
	}

	private static class UnionFind
	{
		private static int[] idPadres;

		public UnionFind(int N)
		{
			idPadres=new int[N+1];
			for(int i=0; i<=N; i++) idPadres[i]=i;
		}

		public int Union(int p, int q)
		{
			int rta=0;
			int pid=idPadres[p];
			int qid=idPadres[q];
			
			for(int i=0; i<idPadres.length; i++)
			{
				if(idPadres[i]==pid || idPadres[i]==qid) rta++;
				if(idPadres[i]==pid) idPadres[i]=qid;
			}
			return rta;
		}

	}
}