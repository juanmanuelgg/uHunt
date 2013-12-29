package bipartiteGraphCheck;

//ID: 10004 
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Bicoloring 
{
	private static BufferedReader br;
	private static boolean test=true;

	public static void main(String[] args) throws Exception 
	{
		if(test) br=new BufferedReader(new FileReader(new File("./data/bipartiteGraphCheck/Bicoloring.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		solve();
		br.close();
	}

	@SuppressWarnings("unchecked")
	private static void solve() throws Exception 
	{
		String line=br.readLine();
		while(!line.equals("0"))
		{
			//Separar informacion pertinente(Usando line)
			int numvetices=Integer.parseInt(line);

			ArrayList<Integer>[] adj = (ArrayList<Integer>[])new ArrayList[numvetices];
			for (int i = 0; i < adj.length; i++) adj[i]=new ArrayList<Integer>();	
			
			int numArcos=Integer.parseInt(br.readLine());
			for (int i = 0; i < numArcos; i++)
			{
				String[] auxArco = br.readLine().split(" ");
				int v=Integer.parseInt(auxArco[0]);
				int w=Integer.parseInt(auxArco[1]);
				adj[v].add(w);
				adj[w].add(v);
			}

			String rta=solucionarCaso(numvetices, adj);

			//---------------------------------------------

			System.out.println(rta);
			line=br.readLine();
		}
	}

	private static String solucionarCaso(int numvetices, ArrayList<Integer>[] adj)
	{
		int color=1;
		
		int[] marked = new int[numvetices];//maneja 2 colores (1 & 2), 0 es no vistado.
		Arrays.fill(marked, 0);
		
		Queue<Integer> q = new LinkedList<Integer>();
        marked[0] = color;
        q.add(0);

        while (!q.isEmpty())
        {
            int v = q.poll();
            int miColor = marked[v];
           
            color=(miColor==1)?2:1;
            for (int w : adj[v]) 
            {
                if (marked[w]==0)
                {
                    marked[w] = color;
                    q.add(w);
                }
                else if(marked[w]==miColor) return "NOT BICOLORABLE."; 
            }
        }
		return "BICOLORABLE.";
	}
}