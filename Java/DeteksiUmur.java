import java.util.Scanner;
class DeteksiUmur
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		int Umur;
		System.out.println("Masukkan Umur:");
		Umur = sc.nextInt();

		if (Umur <= 5)
		{
			System.out.println ("Balita");
		}
		else if (Umur <13 )
		{
			System.out.println ("Anak - Anak");
		}
		else if (Umur <17 )
		{
			System.out.println ("Remaja");
		}
		else if (Umur >= 17)
		{
			System.out.println("Dewasa");
		}
	}
}