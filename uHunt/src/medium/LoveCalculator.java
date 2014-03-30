package medium;

//ID: 10324
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoveCalculator 
{
	private static BufferedReader br;
	private static boolean test=true;

	public static void main(String[] args) throws IOException 
	{
		if(test)br=new BufferedReader(new FileReader(new File("./data/medium/LoveCalculator.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		solve();
		br.close();
	}

	private static void solve() throws IOException
	{
		String nombre1=br.readLine();
		while(nombre1!=null)
		{
			String nombre2=br.readLine();
			
			int sum1=0, sum2=0;
			char[] aux1=nombre1.toCharArray();
			for (char c : aux1) if(Character.isLetter(c)) sum1+=(Character.toLowerCase(c)-'a'+1);
			
			char[] aux2=nombre2.toCharArray();
			for (char c : aux2) if(Character.isLetter(c)) sum2+=(Character.toLowerCase(c)-'a'+1);

			String cad1=sum1+"", cad2=sum2+"";
			
			while(cad1.length()!=1)
			{
				sum1=0;
				aux1=cad1.toCharArray();
				for (char c : aux1) sum1+=(c-'0');
				cad1=sum1+"";
			}
			
			while(cad2.length()!=1)
			{
				sum2=0;
				aux2=cad2.toCharArray();
				for (char c : aux2) sum2+=(c-'0');
				cad2=sum2+"";
			}
			
			double rta=Math.min(sum1, sum2)*10000.0/Math.max(sum1, sum2);
			rta=(Math.round(rta))/100.0;
			String ans=rta+"";
			if(ans.lastIndexOf('.')==ans.length()-2) ans+="0";
			
			System.out.println(ans+" %");
			nombre1=br.readLine();
		}
	}

}