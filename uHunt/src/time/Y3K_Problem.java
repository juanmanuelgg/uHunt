package time;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Y3K_Problem
{
	private static BufferedReader br;
	private static boolean test=true;
	
	public static void main(String[] args) throws IOException 
	{
		if(test)br=new BufferedReader(new FileReader(new File("./data/time/Y3K_Problem.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		solve();
		br.close();
	}

	private static void solve() throws IOException
	{
		String linea=br.readLine();
		String[] paraMprob;
		int adelantar, dia, mes, anio;
		GregorianCalendar cal;
		
		while(!linea.equals("0 0 0 0"))
		{
			paraMprob=linea.split(" ");
			adelantar=Integer.parseInt(paraMprob[0]);
			dia=Integer.parseInt(paraMprob[1]);
			
			mes=Integer.parseInt(paraMprob[2]);
			anio=Integer.parseInt(paraMprob[3]);
			
			cal=new GregorianCalendar(anio,mes-1,dia);
			cal.add(Calendar.DAY_OF_YEAR, adelantar);
			
			System.out.println(cal.get(Calendar.DAY_OF_MONTH)+" "+(cal.get(Calendar.MONTH)+1)+" "+cal.get(Calendar.YEAR));
			linea=br.readLine();
		}
	}
	
}