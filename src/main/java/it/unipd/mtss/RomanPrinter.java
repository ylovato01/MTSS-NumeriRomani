////////////////////////////////////////////////////////////////////
// Matteo Vignaga 1201147
// Yuri Lovato 1238100
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;


public class RomanPrinter 
{
	public static String print(int num)	{
		return printAsciiArt(IntegerToRoman.convert(num));
		}
	private static void inizializzaMatrice(String m[][])
	{
		int k;
		for(int i=0;i<m.length;i++)
		{
			for(k=0;k<m[i].length-1;k++) 
			{
				m[i][k]=" ";
				//System.out.print(m[i][k]);
			}
			m[i][k]="\n";
			//sSystem.out.print(m[i][k]);
		}
	}
	private static String printAsciiArt(String romanNumber)
	{
		String matrix[][]=new String[10][120];
		inizializzaMatrice(matrix);
		//
		return null;
	}
	
}
