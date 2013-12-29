package interestingRealLifeProblems_Easier;

//ID: 11530
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class SMS_Typing
{
	private static BufferedReader br;
	private static boolean test=true;
	
	private static char[] Type1="adgjmptw ".toCharArray();
	private static char[] Type2="behknqux".toCharArray();
	private static char[] Type3="cfilorvy".toCharArray();
	private static char[] Type4="sz".toCharArray();
	private static Map<Character,Integer> map;
	
	public static void main(String[] args) throws IOException 
	{
		if(test)br=new BufferedReader(new FileReader(new File("./data/interestingRealLifeProblems_Easier/SMS_Typing.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		solve();
		br.close();
	}

	private static void solve() throws IOException
	{
		map=new HashMap<Character, Integer>();
		for (char c : Type1) map.put(c, 1);
		for (char c : Type2) map.put(c, 2);
		for (char c : Type3) map.put(c, 3);
		for (char c : Type4) map.put(c, 4);
		
		int casos=Integer.parseInt(br.readLine());
		
		for (int i=1; i<=casos; i++)
		{
			int rta=0;
			char[] aux=br.readLine().toCharArray();
			for (char c : aux) rta+=map.get(c);
			
			System.out.printf("Case #%d: %d\n",i,rta);
		}
	}
	
}