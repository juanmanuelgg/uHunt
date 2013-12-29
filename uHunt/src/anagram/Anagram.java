package anagram;

//ID: 195
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

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

		StringBuffer out=new StringBuffer("");
		while(casos--!=0)
		{
			char[] m=br.readLine().toCharArray();
			Arrays.sort(m);
			StringBuilder s=new StringBuilder("");
            for(int j=0;j<m.length;j++){
                s.append(m[j]);
            }
			perm(new StringBuilder(""),s,out);
			System.out.print(out);
		}
	}

	static void perm(StringBuilder pre ,StringBuilder s,StringBuffer out) {
        if (s.length() == 0) {
            out.append(pre).append("\n");
        }else{
        for (int i = 0; i < s.length(); i++) {
             if(i<s.length()-1){
                 if(s.charAt(i)==s.charAt(i+1)){
                     continue;
                 }
             }
             perm(new StringBuilder("").append(pre).append(s.charAt(i)), new StringBuilder("").append(s.substring(0, i)).append(s.substring(i+1, s.length())),
                     out);
             }
        }
      
    }

}