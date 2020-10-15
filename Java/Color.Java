import java.util.Scanner;
class Color
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Scanner scString = new Scanner(System.in);
		String color = "hijau";
		int X,Y;
		System.out.print("Masukkan nilai X: ");
		X = sc.nextInt();
		System.out.print("Masukkan nilai Y: ");
		Y = sc.nextInt();

		if (X > 0)
		{
			if (Y > 0)
			{
				color = "merah";
			}
		}
		else
		{
			color = "biru";
		}
		System.out.print("Color = " + color);
	}
}