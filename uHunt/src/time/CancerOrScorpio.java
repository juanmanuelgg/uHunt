package time;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CancerOrScorpio
{
	private static BufferedReader br;
	private static boolean test=true;
	
	public static void main(String[] args) throws IOException 
	{
		if(test)br=new BufferedReader(new FileReader(new File("./data/time/CancerOrScorpio.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		solve();
		br.close();
	}

	private static void solve() throws IOException
	{
		int casos=Integer.parseInt(br.readLine().trim());
		int month, dayOfMonth, year, mesNac,diaNac,anioNac;
		GregorianCalendar cal;
		String signo;
		
		for(int i=1;i<=casos;i++)
		{
			String aux=br.readLine();
			month=Integer.parseInt(aux.substring(0,2))-1;
			dayOfMonth=Integer.parseInt(aux.substring(2,4));
			year=Integer.parseInt(aux.substring(4,8));
			
			cal=new GregorianCalendar(year, month, dayOfMonth);
			cal.add(Calendar.WEEK_OF_YEAR, 40);
			
			mesNac=cal.get(Calendar.MONTH);
			diaNac=cal.get(Calendar.DAY_OF_MONTH);
			anioNac=cal.get(Calendar.YEAR);
			System.out.printf("%d %02d/%02d/%04d ",i,mesNac+1,diaNac,anioNac);
			
			signo="";
			if(mesNac==0) signo=(diaNac<21)?"capricorn":"aquarius";
			else if(mesNac==1) signo=(diaNac<20)?"aquarius":"pisces";
			else if(mesNac==2) signo=(diaNac<21)?"pisces":"aries ";
			else if(mesNac==3) signo=(diaNac<21)?"aries":"taurus";
			else if(mesNac==4) signo=(diaNac<22)?"taurus":"gemini";
			else if(mesNac==5) signo=(diaNac<22)?"gemini":"cancer";
			else if(mesNac==6) signo=(diaNac<23)?"cancer":"leo";
			else if(mesNac==7) signo=(diaNac<22)?"leo":"virgo";
			else if(mesNac==8) signo=(diaNac<24)?"virgo":"libra";
			else if(mesNac==9) signo=(diaNac<24)?"libra":"scorpio";
			else if(mesNac==10) signo=(diaNac<23)?"scorpio":"sagittarius";
			else if(mesNac==11) signo=(diaNac<22)?"sagittarius":"capricorn";
			System.out.println(signo);
		}
	}
	
}