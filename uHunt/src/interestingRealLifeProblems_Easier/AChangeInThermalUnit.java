package interestingRealLifeProblems_Easier;

//ID: 11984
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AChangeInThermalUnit
{
	private static BufferedReader br;
	private static boolean test=true;
	
	public static void main(String[] args) throws IOException 
	{
		if(test)br=new BufferedReader(new FileReader(new File("./data/interestingRealLifeProblems_Easier/AChangeInThermalUnit.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		solve();
		br.close();
	}

	private static void solve() throws IOException
	{
		int casos=Integer.parseInt(br.readLine());
		
		for (int i=1; i<=casos; i++)
		{
			String[] aux=br.readLine().split(" ");
			double origC=Double.parseDouble(aux[0]);
			double avanF=Double.parseDouble(aux[1]);
			
			origC+=(5.0*avanF/9.0);
			
			origC*=100;
			origC=Math.round(origC);
			origC/=100;
			String rta=(origC+"").replace(',', '.');
			if(rta.lastIndexOf('.')==rta.length()-2) rta+="0";
			
			System.out.printf("Case %d: %s\n",i,rta);
		}
	}
	
}