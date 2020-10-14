import java.util.Scanner;

class Arr4
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int barisA, kolomA;

		System.out.print("Masukkan Size Baris Matriks A : ");
		barisA = input.nextInt();

		System.out.print("Masukkan Size Kolom Matriks A : ");
		kolomA = input.nextInt();

		int[][] MatrikA = new int[barisA][kolomA];

		System.out.println("Input Elemen Matriks A : ");
		for (int i = 0; i < barisA; i++)
		{
			for (int j = 0; j < kolomA; j++) 
			{
				System.out.print("Matrik A[" + i + "][" + j + "]" + ": ");
				MatrikA[i][j] = input.nextInt();
			}
			System.out.println();
		}
		System.out.println("Hasil output matriknya adalah : ");
		for (int i = 0; i < barisA; i++) 
		{
			for (int j = 0; j < kolomA; j++)
			{
			System.out.print(MatrikA[i][j]+" ");
			}
			System.out.println();
		}
	}
}