package interestingRealLifeProblems_Easier;

//ID: 10812
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BeatTheSpread
{
	private static BufferedReader br;
	private static boolean test=true;
	
	public static void main(String[] args) throws IOException 
	{
		if(test)br=new BufferedReader(new FileReader(new File("./data/interestingRealLifeProblems_Easier/BeatTheSpread.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		solve();
		br.close();
	}

	private static void solve() throws IOException
	{
		int casos=Integer.parseInt(br.readLine());
		double a, b, max, min;
		while(casos--!=0)
		{
			String[] aux=br.readLine().split(" ");
			a=Integer.parseInt(aux[0]);
			b=Integer.parseInt(aux[1]);
			max=((a+b)/2);
			min=((b-a)/-2);

			if(max>=0 && min >=0 && max%1==0 && min%1==0) System.out.println((int)max+" "+(int)min);
			else System.out.println("impossible");
		}
	}
	
}