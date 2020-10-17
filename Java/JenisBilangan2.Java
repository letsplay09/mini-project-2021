import java.util.Scanner;
class JenisBilangan2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int value;
		System.out.print("Masukkan Nilai (0-100): ");
		value = sc.nextInt();

		if (value < 0)
		{
			System.out.println("Value is Negatitive");
		}
		else if (value == 0 )
		{
			System.out.println("Value is zero");
		}
		else
		{
			System.out.println("Value is positive");
		}
		
	}
}