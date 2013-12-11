package easy;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CostCutting
{
	private static BufferedReader br;
	private static boolean test=true;
	
	public static void main(String[] args) throws IOException 
	{
		if(test)br=new BufferedReader(new FileReader(new File("./data/easy/CostCutting.in")));
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
			List<Integer> lol=new ArrayList<Integer>();
			for (String string : param)lol.add(Integer.parseInt(string));
			Collections.sort(lol);
			System.out.println("Case "+(i+1)+": "+lol.get(1));
		}
	}
	
}