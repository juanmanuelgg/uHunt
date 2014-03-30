package unionFind_DisjointSets;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NetworkConnections
{
	private static BufferedReader br;
	private static boolean test=true;
	private static boolean primero=true;
	
	public static void main(String[] args) throws IOException
	{
		if(test) br=new BufferedReader(new FileReader(new File("./data/unionFind_DisjointSets/NetworkConnections.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		solve();
		br.close();
	}

	private static void solve() throws IOException
	{
		int casos=Integer.parseInt(br.readLine()),good,bad;
		br.readLine();
		
		while(casos--!=0)
		{
			good=bad=0;
			
			int N=Integer.parseInt(br.readLine());
			UnionFind uf=new UnionFind(N);
			
			for(String comand=br.readLine(); comand!=null&&!comand.equals(""); comand=br.readLine()) 
			{
				String[] aux=comand.split(" ");
				int p=Integer.parseInt(aux[1]);
				int q=Integer.parseInt(aux[2]);
				
				if(aux[0].equals("c")) uf.Union(p, q);
				else
				{
					if(uf.connected(p, q)) good++;
					else bad++;
				}
			}
			
			if(primero) primero=false;
			else System.out.println();
			System.out.printf("%d,%d\n",good,bad);
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