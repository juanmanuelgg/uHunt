package medium;

//ID: 10141
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
		if(test)br=new BufferedReader(new FileReader(new File("./data/medium/RequestForProposal.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		solucinarProblema();
		br.close();
	}

	private static void solucinarProblema() throws IOException
	{
		String linea=br.readLine();
		
		for(int i=1; !linea.equals("0 0"); i++)
		{
			if(i>1) System.out.println();

			String[] param = linea.split(" ");
			int numRequisitos = Integer.parseInt(param[0]);
			int numEmpresas = Integer.parseInt(param[1]);

			for (int j=0; j<numRequisitos; j++)br.readLine();

			ArrayList<Propuesta> proEmpresas=new ArrayList<Propuesta>();
			int maxReqsCumplidos = 0;
			for (int j=0; j<numEmpresas; j++)
			{
				String empresa = br.readLine();
				String[] paramPropuesta = br.readLine().split(" ");
				double precio = Double.parseDouble(paramPropuesta[0]);
				int numReqsCumplidos = Integer.parseInt(paramPropuesta[1]);

				if(numReqsCumplidos>maxReqsCumplidos) maxReqsCumplidos=numReqsCumplidos;

				for (int k=0; k<numReqsCumplidos; k++)br.readLine();

				proEmpresas.add(new Propuesta(empresa,precio,numReqsCumplidos));
			}

			ArrayList<Propuesta> primerFiltro = new ArrayList<Propuesta>();
			double menorPrecio = Double.POSITIVE_INFINITY;
			
			for (Propuesta propuesta : proEmpresas)
			{
				if(propuesta.numReqsCumplidos==maxReqsCumplidos)
				{
					primerFiltro.add(propuesta);
					if(propuesta.precio<menorPrecio) menorPrecio=propuesta.precio;
				}
			}

			ArrayList<Propuesta> segundoFiltro = new ArrayList<Propuesta>();
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