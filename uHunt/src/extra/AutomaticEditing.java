package extra;

//ID: 10115
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AutomaticEditing
{
	private static BufferedReader br;
	private static boolean test=true;
	
	public static void main(String[] args)throws IOException
	{
		if(test) br=new BufferedReader(new FileReader(new File("./data/easy/AutomaticEditing.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		solve();
		br.close();
	}

	private static void solve()throws IOException
	{
		// TODO Auto-generated method stub
		
	}
}
