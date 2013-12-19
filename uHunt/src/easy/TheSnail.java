package easy;

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
		if(test)br=new BufferedReader(new FileReader(new File("./data/easy/TheSnail.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		solucionarProblema();
		br.close();
	}

	private static void solucionarProblema() throws IOException
	{
		String linea=br.readLine(), r1;
		int H, U, D, F;
		double i, posSnail, subida;
		String[] param;
		
		while(!linea.equals("0 0 0 0"))
		{
			param=linea.split(" ");
			H=Integer.parseInt(param[0]);
			U=Integer.parseInt(param[1]);
			D=Integer.parseInt(param[2]);
			F=Integer.parseInt(param[3]);
			
			i=1;
			posSnail=0;
			
			while(true)
			{
				subida=(U-(U*(i-1)*F/100));
				posSnail+=(subida>=0)?subida:0;
				if(posSnail>H)break;
				posSnail-=D;
				if(posSnail<0)break;
				i++;
			}
			r1=(posSnail<0)?"failure":"success";
			
			System.out.println(r1+" on day "+(int)i);
			linea=br.readLine();
		}
	}
	
}