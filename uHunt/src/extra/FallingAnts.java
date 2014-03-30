package extra;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FallingAnts
{
	private static BufferedReader br;
	private static boolean test=true;

	public static void main(String[] args) throws IOException
	{
		if(test) br=new BufferedReader(new FileReader(new File("./data/extra/FallingAnts.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		solve();
		br.close();
	}

	private static void solve() throws IOException
	{
		int L, W, H;
		
		for (int T=Integer.parseInt(br.readLine()); T!=0; T=Integer.parseInt(br.readLine()))
		{
			int rta=0;
			double max=0.0;
			int[] volums=new int[T];
			double[] accs=new double[T];
			String[] aux;

			for(int i=0; i<T; i++)
			{
				aux=br.readLine().split(" ");
				L=Integer.parseInt(aux[0]);
				W=Integer.parseInt(aux[1]);
				H=Integer.parseInt(aux[2]);
				
				volums[i]=L*W*H;
				accs[i]=10.0-(10.0/(2*H));
				max=Math.max(max, accs[i]);
			}
			
			for(int i=0; i<T; i++) if(accs[i]==max) rta=Math.max(rta, volums[i]);
			
			System.out.println(rta);
		}
	}

}