import java.util.Scanner;

class ArraySum
{
	public static void main(String args[])
	{
		Scanner scInt = new Scanner(System.in);
		int N, hasil=0;
		int[] arr;

		System.out.print("Masukkan jumlah elemen array: ");
		N = scInt.nextInt();

		arr = new int[N];

		for(int i=0; i<N; i++)
		{
			System.out.print("Masukkan array ke-" +(i+1)+ " : ");
			arr[i] = scInt.nextInt();
		}

		for(int i=0; i<N; i++)
		{
			hasil = hasil + arr[i];
		}
		System.out.println("Hasil penjumlahan isi elemen array: " + hasil);
	}
}