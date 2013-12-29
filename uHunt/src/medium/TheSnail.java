package medium;

//ID: 573
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheSnail 
{
	private static BufferedReader br;
	private static boolean test=true;
	
	public static void main(String[] args) throws IOException 
	{
		if(test)br=new BufferedReader(new FileReader(new File("./data/medium/TheSnail.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		solucionarProblema();
		br.close();
	}

	private static void solucionarProblema() throws IOException
	{
		String linea=br.readLine();
		
		while(!linea.equals("0 0 0 0"))
		{
			String[] param = linea.split(" ");
			int H = Integer.parseInt(param[0]);
			int U = Integer.parseInt(param[1]);
			int D = Integer.parseInt(param[2]);
			int F = Integer.parseInt(param[3]);
			
			int i = 1;
			int posSnail = 0;
			
			while(true)
			{
				int subida = (U-(U*(i-1)*F/100));
				posSnail+=(subida>=0)?subida:0;
				if(posSnail>H)break;
				posSnail-=D;
				if(posSnail<0)break;
				i++;
			}
			String r1 = (posSnail<0)?"failure":"success";
			
			System.out.println(r1+" on day "+(int)i);
			linea=br.readLine();
		}
	}
	
}