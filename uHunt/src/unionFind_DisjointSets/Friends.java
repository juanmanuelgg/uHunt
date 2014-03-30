package unionFind_DisjointSets;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Friends
{
	private static BufferedReader br;
	private static boolean test=true;

	public static void main(String[] args) throws IOException
	{
		if(test) br=new BufferedReader(new FileReader(new File("./data/unionFind_DisjointSets/Friends.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		solve();
		br.close();
	}

	private static void solve() throws IOException
	{
		int casos=Integer.parseInt(br.readLine()), N, arcos, p, q, max;

		while(casos--!=0)
		{
			String[] aux=br.readLine().split(" ");
			N=Integer.parseInt(aux[0]);
			arcos=Integer.parseInt(aux[1]);

			UnionFind uf=new UnionFind(N);
			while(arcos--!=0)
			{
				aux=br.readLine().split(" ");
				p=Integer.parseInt(aux[0]);
				q=Integer.parseInt(aux[1]);
				uf.Union(p, q);
			}

			int[] grupo=new int[N+1];
			for(int i=1; i<=N; i++)
			{
				if(grupo[i]==0)
				{
					grupo[i]=i;
					for(int j=i+1; j<=N; j++) if(uf.connected(i, j)) grupo[j]=i;
				}
			}
			
			Map<Integer,Integer> map=new HashMap<Integer,Integer>();
			for (int i : grupo)
			{
				Integer reps=map.get(i);
				if(reps==null) map.put(i, 1);
				else map.put(i, reps+1);
			}
			
			max=0;
			for (Integer i : map.values()) if(i>max) max=i;
			System.out.println(max);
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

		public void Union(int p, int q)
		{
			int i=root(p);
			int j=root(q);

			if(i!=j) idPadres[i]=j;
		}

		private int root(int i)
		{
			int root=i;
			while(root!=idPadres[root]) root=idPadres[root];
			while(i!=root)
			{
				int newp=idPadres[i];
				idPadres[i]=root;
				i=newp;
			}
			return root;
		}

		public boolean connected(int p, int q)
		{
			return root(p)==root(q);
		}
	}
}