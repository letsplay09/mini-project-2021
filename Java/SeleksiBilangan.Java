import java.util.Scanner;
class SeleksiBilangan
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		float Bilangan1,Bilangan2,Hasil,Error ;
		System.out.println ("Masukkan Bilangan1: ");
		Bilangan1 = sc.nextInt();
		System.out.println ("Masukkan Bilangan2: ");
		Bilangan2 = sc.nextInt();
		if (Bilangan1>Bilangan2)
		{
			System.out.print("Hasil: " + Bilangan1);
		}
		else if (Bilangan1<Bilangan2)
		{
			System.out.print("Hasil: " + Bilangan2);
		}
		else if (Bilangan1 == Bilangan2)
		{
			System.out.print("Error ");
		}
		
	}
}