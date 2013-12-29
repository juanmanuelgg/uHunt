package game_card;

//ID: 10646
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class WhatIsTheCard
{
	private static BufferedReader br;
	private static boolean test=true;

	public static void main(String[] args) throws IOException 
	{
		if(test)br=new BufferedReader(new FileReader(new File("./data/game_card/WhatIsTheCard.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		solve();
		br.close();
	}

	private static void solve() throws NumberFormatException, IOException 
	{
		int casos=Integer.parseInt(br.readLine());
		for (int i = 1; i <= casos; i++)
		{
			String[] mazo=br.readLine().split(" ");
			boolean[] enMazo=new boolean[mazo.length];
			Arrays.fill(enMazo, true);

			//int desechadas=0,Y=0;
			//for (int j = 0; j < 3; j++)
			//{
			//		int init=25+desechadas;
			//		int X=mapeo(mazo[init].charAt(0));
			//		Y+=X;
			//		desechadas+=(10-X+1);
			//		for (int k = init; k < init+X; k++) enMazo[k]=false;
			//}

			int Y = 0;
			int last = -1;
			int count = 0;
			for (int j = 25; j >= 0 && count < 3; j--) 
			{
				int X=mapeo(mazo[j].charAt(0));
				Y += X;
				j -= (10 - X);
				count++;
				last = j;
			}

			//int j, posRta;
			//for ( j = enMazo.length-1,posRta=0; posRta!=Y; j--) if(enMazo[j])posRta++;
			if (Y <= last) System.out.println("Case " + i + ": " + mazo[Y - 1]);
			else System.out.println("Case " + i + ": " + mazo[26 + (Y - last) - 1]);
		}

		//System.out.println("Case "+i+": "+mazo[j+1]);
	}

	private static int mapeo(char carta)
	{
		return (carta>=50 && carta<= 57)?carta-'0':10;
	}

}