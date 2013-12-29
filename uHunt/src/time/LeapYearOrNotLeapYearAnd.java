package time;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

//ID: 10070
public class LeapYearOrNotLeapYearAnd
{
	private static BufferedReader br;
	private static boolean test=true;
	
	private static BigInteger bi400=new BigInteger("400");
	private static BigInteger bi4=new BigInteger("4");
	private static BigInteger bi100=new BigInteger("100");
	private static BigInteger bi15=new BigInteger("15");
	private static BigInteger bi55=new BigInteger("55");
	
	public static void main(String[] args) throws IOException
	{
		if(test) br=new BufferedReader(new FileReader(new File("./data/time/LeapYearOrNotLeapYearAnd.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		solve();
		br.close();
	}

	private static void solve() throws IOException
	{
		String linea=br.readLine();
		BigInteger anio;
		boolean leapyear, huluculu, bulukulu, primero=true;
		
		while(linea!=null)
		{
			leapyear=huluculu=bulukulu=false;
			anio=new BigInteger(linea);
			leapyear=(anio.mod(bi400)==BigInteger.ZERO || (anio.mod(bi4)==BigInteger.ZERO && anio.mod(bi100)!=BigInteger.ZERO));
			huluculu=(anio.mod(bi15)==BigInteger.ZERO);
			bulukulu=(leapyear && anio.mod(bi55)==BigInteger.ZERO);
			
			if(primero) primero=false;
			else System.out.println();
			
			if(leapyear) System.out.println("This is leap year.");
			if(huluculu) System.out.println("This is huluculu festival year.");
			if(bulukulu) System.out.println("This is bulukulu festival year.");
			if(!leapyear && !huluculu && !bulukulu) System.out.println("This is an ordinary year.");
			
			linea=br.readLine();
		}
	}
	
}