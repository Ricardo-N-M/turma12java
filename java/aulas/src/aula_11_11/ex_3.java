package aula_11_11;

import java.util.Random;

/*  3.  	Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.
 * 
 */
public class ex_3 {

	public static void main(String[] args) {
		Random random = new Random();
		final int limite1 = 4;
		final int limite2 = 6;
		int n1 [][]= new int [limite1][limite2];
		int n2 [][]= new int [limite1][limite2];
		int m1 [][]= new int [limite1][limite2];
		int m2 [][]= new int [limite1][limite2];
		
		//n1
		System.out.printf("MATRIZ N1\n");
		for (int x=0;x<limite1;x++)
		{
			for (int y=0; y<limite2;y++)
			{
				n1[x][y] = random.nextInt(9);
				System.out.print(n1[x][y]+"\t");
			}
			System.out.println();
		}
		System.out.printf("MATRIZ N2\n");
		for (int x=0;x<limite1;x++)
		{
			for (int y=0; y<limite2;y++)
			{
				n2[x][y] = random.nextInt(9);
				System.out.print(n2[x][y]+"\t");
			}
			System.out.println();
		}
		System.out.println("MATRIZ M1\n");
		for (int x=0;x<limite1;x++)
		{
			for (int y=0; y<limite2;y++)
			{
				m1[x][y] =n1[x][y] + n2[x][y];
				System.out.print(m1[x][y]+"\t");
			}
			System.out.println();
		}
		System.out.println("MATRIZ M2\n");
		for (int x=0;x<limite1;x++)
		{
			for (int y=0; y<limite2;y++)
			{
				m2[x][y] =n1[x][y] - n2[x][y];
				System.out.print(m2[x][y]+"\t");
			}
			System.out.println();
		}

	}

}
