package extra;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class LearningVector
{
	private static BufferedReader br;
	private static boolean test=true;

	public static void main(String[] args) throws IOException
	{
		if(test) br=new BufferedReader(new FileReader("./data/extra/LearningVerctor.in"));
		else br=new BufferedReader(new InputStreamReader(System.in));
		solve();
		br.close();
	}

	private static void solve() throws IOException
	{
		int casos=Integer.parseInt(br.readLine()), N, K, x, y, largo;
		double maxArea, altura;
		String[] aux, aux2;
		VectorP[] vectores;
		for(int i=1; i <=casos; i++)
		{
			largo=0;
			aux=br.readLine().split(" ");
			N=Integer.parseInt(aux[0]);
			K=Integer.parseInt(aux[1]);
			vectores=new VectorP[N];
			for (int j=0; j<N; j++)
			{
				aux2=br.readLine().split(" ");
				x=Integer.parseInt(aux2[0]);
				y=Integer.parseInt(aux2[1]);
				vectores[j]=new VectorP(x, y);
				largo+=x;
			}

			for (VectorP vectorP : vectores) vectorP.asignarArea(largo);

			maxArea=altura=0.0;
			Arrays.sort(vectores);
			for (int j=0; j<K; j++)
			{
				System.out.println(vectores[j]);
				double lol=(((vectores[j].x*vectores[j].y)/2.0)+vectores[j].x*altura);
				maxArea+=lol;
				altura+=vectores[j].y;
				System.out.println(lol);
			}

			System.out.println("Case "+i+": "+(int) (maxArea*2));
		}
	}

	private static class VectorP implements Comparable<VectorP>
	{
		private double area;
		private double x;
		private double y;

		public VectorP(double xP, double yP)
		{
			x=xP;
			y=yP;
		}

		public void asignarArea(double largo)
		{
			//area=((x*y)/2.0)+(largo-x)*y;
			//area=y*(-(x/2.0)+largo);
			area=x/y;
		}

		public double getArea() {return area;}
		@Override
		public int compareTo(VectorP o)
		{
			return Double.compare(area, o.getArea());
		}

		public String toString()
		{
			return "("+x+" , "+y+")";

		}
	}

}