package array_1D;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class JollyJumpers
{
	private static BufferedReader br;
	private static boolean test=true;
	
	public static void main(String[] args) throws IOException
	{	
		if(test) br=new BufferedReader(new FileReader(new File("./data/array_1D/JollyJumpers.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		solve();
		br.close();
	}

	private static void solve() throws IOException
	{
		for(String linea=br.readLine();linea!=null;linea=br.readLine())
		{
			String[] aux=linea.split(" ");
			int[] nums=new int[aux.length];
			Set<Integer> lol=new HashSet<Integer>();
			
			for(int i=0; i<nums.length; i++)
			{
				nums[i]=Integer.parseInt(aux[i]);
				lol.add(nums[i]);
			}
			
			boolean jolly=true;
			for(int i=0, j=1; j<nums.length && jolly; i++, j++)
			{
				int dif=Math.abs(nums[j]-nums[i]);
				jolly=lol.contains(dif);
			}
			
			if(jolly) System.out.println("Jolly");
			else System.out.println("Not jolly");
		}
	}
}