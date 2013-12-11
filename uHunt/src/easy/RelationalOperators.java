package easy;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RelationalOperators
{
	private static BufferedReader br;
	private static boolean test=true;
	
	public static void main(String[] args) throws IOException 
	{
		if(test)br=new BufferedReader(new FileReader(new File("./data/easy/RelationalOperators.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		solucionarProblema();
		br.close();
	}

	private static void solucionarProblema() throws NumberFormatException, IOException 
	{
		int casos=Integer.parseInt(br.readLine());
		for (int i = 0; i < casos;i++) 
		{
			String[] param=br.readLine().split(" ");
			int num1=Integer.parseInt(param[0]);
			int num2=Integer.parseInt(param[1]);
			char rta=(num1<num2)?'<':'>';
			rta=(num1==num2)?'=':rta;
			System.out.println(rta);
		}
	}
	
}