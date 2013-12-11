package easy;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EventPlanning
{
	private static BufferedReader br;
	private static boolean test=true;

	public static void main(String[] args) throws IOException 
	{
		if(test)br=new BufferedReader(new FileReader(new File("./data/easy/EventPlanning.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		solucionarProblema();
		br.close();
	}

	private static void solucionarProblema() throws IOException
	{
		String linea=br.readLine();
		while(linea!=null)
		{
			String[] paramEvento=linea.split(" ");
			int numParticip=Integer.parseInt(paramEvento[0]);
			int budget=Integer.parseInt(paramEvento[1]);
			int numHoteles=Integer.parseInt(paramEvento[2]);
			int numWeeks=Integer.parseInt(paramEvento[3]);

			int minGasto=-1;
			// Solucionar Caso
			for (int i = 0; i < numHoteles; i++) 
			{
				int precio=Integer.parseInt(br.readLine());
				String[] camasDisp=br.readLine().split(" ");

				int gasto=precio*numParticip;
				for (int j = 0; j < numWeeks; j++)
				{
					int beds=Integer.parseInt(camasDisp[j]);
					if(gasto<=budget && beds>=numParticip)
					{
						if(gasto<minGasto || minGasto==-1)minGasto=gasto;
					}
				}
			}

			String rta=(minGasto==-1)?"stay home":minGasto+"";
			System.out.println(rta);
			linea=br.readLine();
		}
	}

}