package games_other_easier;

//ID: 10189
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MasterMindHints 
{
	private static BufferedReader br;
	private static boolean test=true;

	public static void main(String[] args) throws IOException 
	{
		if(test) br=new BufferedReader(new FileReader(new File("./data/games_other_easier/MasterMindHints.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		solve();
		br.close();
	}

	private static void solve() throws IOException
	{
		int numL=Integer.parseInt(br.readLine()), gmaNum=1;
		
		while(numL!=0)
		{
			System.out.println("Game "+(gmaNum++)+":");
			
			String[] lol=br.readLine().split(" ");
			int[] code=new int[numL];
			for (int i=0; i<code.length; i++) code[i]=Integer.parseInt(lol[i]);

			boolean continuar=true;
			lol=br.readLine().split(" ");
			while(continuar)
			{
				continuar=false;
				for (String string : lol) if(!string.equals("0")) continuar=true;
				
				int fuertes=0, debiles=0;
				if(continuar)
				{
					int[] code2=new int[numL], guess=new int[numL];
					for (int i=0; i<code2.length; i++)
					{
						guess[i]=Integer.parseInt(lol[i]);
						code2[i]=code[i];
						if(guess[i]==code[i])
						{
							code2[i]=guess[i]=0;
							fuertes++;
						}
					}
					Arrays.sort(code2);
					Arrays.sort(guess);
					
					Queue<Integer> colaG=new LinkedList<Integer>();
					Queue<Integer> cola2=new LinkedList<Integer>();
					for (int i=0; i<guess.length; i++)
					{
						colaG.add(guess[i]);
						cola2.add(code2[i]);
					}
					
					while(!colaG.isEmpty() && !cola2.isEmpty())
					{
						int guessNum=colaG.peek();
						int code2Num=cola2.peek();
						
						if(guessNum==code2Num)
						{
							colaG.poll();
							cola2.poll();
							if(guessNum!=0) debiles++;
						}
						else if(guessNum<code2Num) colaG.poll();
						else cola2.poll();
					}
					
					System.out.println("    ("+fuertes+","+debiles+")");
					lol=br.readLine().split(" ");
				}
			}
			numL=Integer.parseInt(br.readLine());
		}
	}

}