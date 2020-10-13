import java.util.Scanner;

class Umur
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		int umur ;

		System.out.println("Masukkan angka :");
		umur = sc.nextInt();

		if(umur <= 5)
		{
			System.out.println("Balita");
		}
		else if(umur < 13)
		{
			System.out.println("anak-anak");
		}
		else if(umur < 17)
		{
			System.out.println("remaja");
		}
		else if(umur >= 17)
		{
			System.out.println("Dewasa");
		}
	}
}