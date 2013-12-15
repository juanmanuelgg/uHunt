package easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CombinationLock
{
	private static BufferedReader br;
	private static boolean test=true;
	
	public static void main(String[] args) throws IOException 
	{
		if(test)br=new BufferedReader(new FileReader(new File("./data/easy/CombinationLock.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		solve();
		br.close();
	}

	private static void solve() throws IOException
	{
		String linea=br.readLine();
		while(!linea.equals("0 0 0 0"))
		{
			int ans=1080;
			String[] aux=linea.split(" ");
			int p0=Integer.parseInt(aux[0]);
			int p1=Integer.parseInt(aux[1]);
			int p2=Integer.parseInt(aux[2]);
			int p3=Integer.parseInt(aux[3]);
			
			int ang1=0,ang2=0,ang3=0;
			for (int i = p1; i != p0; i=(i+1)%40) ang1++;
			for (int i = p2; i != p1; i=(i+39)%40) ang2++;
			for (int i = p3; i != p2; i=(i+1)%40) ang3++;
			
			ans+=((ang1+ang2+ang3)*9);
			
			System.out.println(ans);
			linea=br.readLine();
		}
	}
	
}