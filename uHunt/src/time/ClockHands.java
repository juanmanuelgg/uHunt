package time;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClockHands 
{
	private static BufferedReader br;
	private static boolean test=true;
	
	public static void main(String[] args) throws IOException 
	{
		if(test) br=new BufferedReader(new FileReader(new File("./data/time/ClockHands.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		solve();
		br.close();
	}

	private static void solve() throws IOException
	{
		String linea=br.readLine();
		while(!linea.equals("0:00"))
		{
			String[] param=linea.split(":");
			double horas=Double.parseDouble(param[0]);
			double minutos=Double.parseDouble(param[1]);
		
			double gradosMinutos=(minutos*360/60);
			double gradosHoras=((horas*360/12)+(minutos*30/60));
			
			double dif=Math.abs(gradosHoras-gradosMinutos);
			dif=(dif>180)?360-dif:dif;
			
			System.out.printf("%.3f\n", dif);
			linea=br.readLine();
		}
	}
	
}