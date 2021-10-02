import java.util.Scanner;

class ReversedArray

{
	public static void main(String args[])
	{
		Scanner scInt = new Scanner(System.in);
		int[] bil = new int [4];

		for(int i=0; i<4; i++)
		{
			System.out.print("Masukkan bilangan ke-" +(i+1)+ ": ");
			bil[i] = scInt.nextInt();
		}

		for(int i=3; i>=0; i--)
		{
			System.out.println("Isi bilangan ke-" +(i+1)+ "adalah: " + bil[i]);
		}
	}
}