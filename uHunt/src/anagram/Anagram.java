package anagram;

//ID: 195
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Anagram
{
	private static BufferedReader br;
	private static boolean test=true;

	public static void main(String[] args) throws IOException
	{
		if(test) br=new BufferedReader(new FileReader(new File("./data/anagram/Anagram.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		solve();
		br.close();
	}

	private static void solve() throws IOException
	{
		int casos=Integer.parseInt(br.readLine());

		while(casos--!=0)
		{
			char[] x=br.readLine().toCharArray();
			Arrays.sort(x);
			
			Set<String> pals=new HashSet<String>();
			do
			{
				if(pals.add(new String(x))) System.out.println(x);
			}
			while(nextPermutation(x));
		}
	}
	
	private static boolean nextPermutation(char[] array)
	{
		int i=array.length-1;
		while(i>0 && array[i-1]>=array[i]) i--;

		if(i==0) return false;

		int j=array.length-1;
		while (array[j]<=array[i-1]) j--;

		char temp=array[i-1];
		array[i-1] = array[j];
		array[j] = temp;

		j=array.length-1;
		while(i<j) 
		{
			temp=array[i];
			array[i]=array[j];
			array[j]=temp;
			i++;
			j--;
		}

		return true;
	}

}