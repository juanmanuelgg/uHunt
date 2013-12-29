package easy;

//ID: 11764
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JumpingMario 
{
	private static BufferedReader br;
	private static boolean test=true;

	public static void main(String[] args) throws IOException 
	{
		if(test)br=new BufferedReader(new FileReader(new File("./data/easy/JumpingMario.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		solve();
		br.close();
	}

	private static void solve() throws IOException 
	{
		int casos=Integer.parseInt(br.readLine());
		for (int i=1; i<=casos; i++) 
		{
			int subidas=0, bajadas=0;
			br.readLine();
			String[] aux=br.readLine().split(" ");

			int ant=Integer.parseInt(aux[0]);
			for (int j = 1; j < aux.length; j++)
			{
				int actual=Integer.parseInt(aux[j]);
				if(ant>actual) bajadas++;
				else if(ant<actual) subidas++;
				ant=actual;
			}
			System.out.println("Case "+i+": "+subidas+" "+bajadas);
		}
	}
	
}