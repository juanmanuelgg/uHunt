package easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AutomaticAnswer
{
	private static BufferedReader br;
	private static boolean test=true;

	public static void main(String[] args) throws IOException 
	{
		if(test)br=new BufferedReader(new FileReader(new File("./data/easy/AutomaticAnswer.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		solve();
		br.close();
	}

	private static void solve() throws IOException
	{
		int casos=Integer.parseInt(br.readLine()), num;
		char[] digitos;
		
		while(casos--!=0)
		{
			num=Integer.parseInt(br.readLine());
			num=((((num*63)+7492)*5)-498);
			
			digitos=(num+"").toCharArray();
			
			System.out.println(digitos[digitos.length-2]);
		}
	}

}