package combinatorics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class FibinaryNumbers
{
	private static BufferedReader br;
	private static boolean test=true;
	private static BigInteger[] Fibonaccis=new BigInteger[102];
	private static String[] valores={"1","2","3","5","8","13","21","34","55","89","144","233","377","610","987","1597","2584","4181","6765","10946","17711","28657","46368","75025","121393","196418","317811","514229","832040","1346269","2178309","3524578","5702887","9227465","14930352","24157817","39088169","63245986","102334155","165580141","267914296","433494437","701408733","1134903170","1836311903","2971215073","4807526976","7778742049","12586269025","20365011074","32951280099","53316291173","86267571272","139583862445","225851433717","365435296162","591286729879","956722026041","1548008755920","2504730781961","4052739537881","6557470319842","10610209857723","17167680177565","27777890035288","44945570212853","72723460248141","117669030460994","190392490709135","308061521170129","498454011879264","806515533049393","1304969544928657","2111485077978050","3416454622906707","5527939700884757","8944394323791464","14472334024676221","23416728348467685","37889062373143906","61305790721611591","99194853094755497","160500643816367088","259695496911122585","420196140727489673","679891637638612258","1100087778366101931","1779979416004714189","2880067194370816120","4660046610375530309","7540113804746346429","12200160415121876738","19740274219868223167","31940434634990099905","51680708854858323072","83621143489848422977","135301852344706746049","218922995834555169026","354224848179261915075","573147844013817084101","927372692193078999176","2427893228399975082453"};

	public static void main(String[] args) throws IOException
	{
		//primeros102Fibonaccy();
		armarBigIntegers();
		if(test) br=new BufferedReader(new FileReader(new File("./data/combinatorics/FibinaryNumbers.in")));
		else br=new BufferedReader(new InputStreamReader(System.in));
		solve();
		br.close();
	}

	@SuppressWarnings("unused")
	private static void primeros102Fibonaccy()
	{
		BigInteger f1=BigInteger.ONE;		
		BigInteger f2=new BigInteger("2");
		System.out.print("\""+f1+"\",\""+f2+"\",");
	
		int limite=101;
		while(limite--!=0)
		{
			BigInteger nuevo=f2.add(f1);
			System.out.print("\""+nuevo+"\",");
			f1=f2;
			f2=nuevo;
		}
	
	}

	private static void armarBigIntegers()
	{
		for(int i=0; i<valores.length; i++) Fibonaccis[i]=new BigInteger(valores[i]);
	}

	private static void solve() throws IOException
	{
		String l1=br.readLine().trim();
		String l2=br.readLine().trim();

		while(l2!=null)
		{
			br.readLine();
			
			BigInteger rtaDecimal=BigInteger.ZERO;
			rtaDecimal=sumar(rtaDecimal,l1);
			rtaDecimal=sumar(rtaDecimal,l2);

			if(!rtaDecimal.equals(BigInteger.ZERO)) toFibinary(rtaDecimal);
			else System.out.print("0");
			System.out.println();
			System.out.println();

			l1=br.readLine();
			l2=br.readLine();
		}

	}

	private static BigInteger sumar(BigInteger rtaDecimal, String l1)
	{
		char[] digits=l1.toCharArray();
	
		int n=digits.length-1;
		for(int i=n; i>=0; i--)
			if(digits[i]=='1') rtaDecimal=rtaDecimal.add(Fibonaccis[n-i]);
	
		return rtaDecimal;
	}

	private static void toFibinary(BigInteger rtaDecimal)
	{
		int pos=0;
		while(rtaDecimal.compareTo(Fibonaccis[pos])>=0) pos++;
		
		for(int i=pos-1; i>=0; i--)
		{
			if(rtaDecimal.compareTo(Fibonaccis[i])>=0)
			{
				System.out.print(1);
				rtaDecimal=rtaDecimal.subtract(Fibonaccis[i]);
			}
			else System.out.print(0);
		}
	}
}