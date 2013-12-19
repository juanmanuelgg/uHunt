package easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class RequestForProposal 
{
	private static BufferedReader br;
	private static boolean test=true;

	public static void main(String[] args) throws IOException 
	{
		if(test)br=new BufferedReader(new FileReader(new File("./data/easy/RequestForProposal.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		solucinarProblema();
		br.close();
	}

	private static void solucinarProblema() throws IOException
	{
		String linea=br.readLine(), empresa;
		String[] param, paramPropuesta;
		int numRequisitos, numEmpresas, maxReqsCumplidos, numReqsCumplidos;
		double precio;
		ArrayList<Propuesta> primerFiltro, segundoFiltro;
		Double menorPrecio;
		
		for(int i=1; !linea.equals("0 0"); i++)
		{
			if(i>1) System.out.println();

			param=linea.split(" ");
			numRequisitos=Integer.parseInt(param[0]);
			numEmpresas=Integer.parseInt(param[1]);

			for (int j=0; j<numRequisitos; j++)br.readLine();

			ArrayList<Propuesta> proEmpresas=new ArrayList<Propuesta>();
			maxReqsCumplidos=0;
			for (int j=0; j<numEmpresas; j++)
			{
				empresa=br.readLine();
				paramPropuesta=br.readLine().split(" ");
				precio=Double.parseDouble(paramPropuesta[0]);
				numReqsCumplidos=Integer.parseInt(paramPropuesta[1]);

				if(numReqsCumplidos>maxReqsCumplidos) maxReqsCumplidos=numReqsCumplidos;

				for (int k=0; k<numReqsCumplidos; k++)br.readLine();

				proEmpresas.add(new Propuesta(empresa,precio,numReqsCumplidos));
			}

			primerFiltro=new ArrayList<Propuesta>();
			menorPrecio=Double.POSITIVE_INFINITY;
			
			for (Propuesta propuesta : proEmpresas)
			{
				if(propuesta.numReqsCumplidos==maxReqsCumplidos)
				{
					primerFiltro.add(propuesta);
					if(propuesta.precio<menorPrecio) menorPrecio=propuesta.precio;
				}
			}

			segundoFiltro=new ArrayList<Propuesta>();
			for (Propuesta propuesta : primerFiltro)
				if(propuesta.precio==menorPrecio) segundoFiltro.add(propuesta);

			System.out.println("RFP #"+i);
			System.out.println(segundoFiltro.get(0).empresa);
			linea=br.readLine();
		}
	}

	private static class Propuesta
	{
		String empresa;
		Double precio;
		int numReqsCumplidos;
		
		public Propuesta(String empresaP, Double precioP, int numReqsCumplidosP)
		{
			empresa=empresaP;
			precio=precioP;
			numReqsCumplidos=numReqsCumplidosP;
		}
	}
	
}