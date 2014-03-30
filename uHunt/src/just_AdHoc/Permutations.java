package just_AdHoc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Permutations
{
	private static BufferedReader br;
	private static boolean test=true;
	
	private static long[] fact=new long[21];

	public static void main(String[] args) throws IOException
	{
		if(test) br=new BufferedReader(new FileReader(new File("./data/just_AdHoc/Permutations.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		precalcularFactoriales();
		solve();
		br.close();
	}
	
	private static void precalcularFactoriales()
	{
		fact[0]=1;
		for(int i=1; i<=20; i++) fact[i]=fact[i-1]*i;
	}
	
	private static void solve() throws IOException
	{
		int N=Integer.parseInt(br.readLine());
		
		while(N--!=0)
		{
			char[] caracteresAux=br.readLine().toCharArray();
			Arrays.sort(caracteresAux);
			
			List<Character> caracteres=new LinkedList<Character>();
			for(Character c : caracteresAux) caracteres.add(c);
			
			long n=Long.parseLong(br.readLine());
			String rta="";
			int T=caracteres.size();
			
			for(int j=0; j<T; j++) 
			{
				long aux1 = n/fact[T-j-1];
				long aux2 = n%fact[T-j-1];
				rta += caracteres.get((int)aux1);
				caracteres.remove((int)aux1);
				n=aux2;
			}
			System.out.println(rta);
		}
		
	}

}