package easy;

//ID: 11498
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DivisionofNlogonia
{
	private static BufferedReader br;
	private static boolean test=true;
	
	public static void main(String[] args) throws IOException 
	{
		if(test)br=new BufferedReader(new FileReader(new File("./data/easy/DivisionofNlogonia.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		solucionarProblema();
		br.close();
	}

	private static void solucionarProblema() throws IOException 
	{
		int numPuntos=Integer.parseInt(br.readLine());
		String puntoCentro;
		String[] puntos;
		
		while(numPuntos!=0)
		{
			puntoCentro=br.readLine();
			puntos=new String[numPuntos];
			for (int i=0; i<numPuntos; i++) puntos[i]=br.readLine();
			
			solucionarCaso(puntoCentro.split(" "), puntos);
			
			numPuntos=Integer.parseInt(br.readLine());
		}
	}

	private static void solucionarCaso(String[] puntoCentro, String[] puntos) 
	{
		int x=Integer.parseInt(puntoCentro[0]), y=Integer.parseInt(puntoCentro[1]), xp, yp;
		String[] estePunto;
		
		for (String punto : puntos)
		{
			estePunto=punto.split(" ");
			xp=Integer.parseInt(estePunto[0]);
			yp=Integer.parseInt(estePunto[1]);
			
			if(xp==x||yp==y)System.out.println("divisa");
			else if(xp>x&&yp>y)System.out.println("NE");
			else if(xp<x&&yp>y)System.out.println("NO");
			else if(xp<x&&yp<y)System.out.println("SO");
			else if(xp>x&&yp<y)System.out.println("SE");
		}
	}
	
}