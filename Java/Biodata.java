import java.util.Scanner;

class Biodata

{
	public static void main (String args[])
	{
		Scanner scInt = new Scanner (System.in);
		Scanner scString = new Scanner (System.in) ;

		String nama, noHp;
		int usia, tinggiBadan;

		System.out.print("Masukan nama :") ;
		nama = scString.nextLine();

		System.out.print("Masukkan no Hp :") ;
		noHp = scString.nextLine();

		System.out.print("masukkan usia :") ;
		usia = scInt.nextInt();

		System.out.print("Tinggi badan: ") ;
		tinggiBadan = scInt.nextInt() ;

		System.out.println("Boidata") ;
		System.out.println("Nama:" + nama ) ;
		System.out.println("No Hp:" + noHp ) ;
		System.out.println("Usia:" + usia ) ;
		System.out.println("Tinggi Badan :" + tinggiBadan ) ;

	}
}

