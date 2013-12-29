package easy;

//ID: 11332
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SummingDigits 
{
		private static BufferedReader br;
		private static boolean test=true;

		public static void main(String[] args) throws IOException 
		{
			if(test)br=new BufferedReader(new FileReader(new File("./data/easy/SummingDigits.in")));
			else br=new BufferedReader(new InputStreamReader(System.in));
			solve();
			br.close();
		}

		private static void solve() throws IOException 
		{
			String linea=br.readLine();
			while(!linea.equals("0"))
			{
				char[] caract=linea.toCharArray();
				while(caract.length>1)
				{
					int f=0;
					for (int i=0; i < caract.length; i++) f+=(caract[i]-'0');
					caract=(""+f).toCharArray();
				}
				System.out.println(caract[0]);
				
				linea=br.readLine();
			}
		}

}