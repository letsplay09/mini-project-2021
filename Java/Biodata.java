import java.util.Scanner;

class Biodata

{
	public static void main (String args[])
	{
		Scanner scInt = new Scanner (System.in);
		Scanner scString = new Scanner (System.in) ;

		String nama, noHp, ttl;
		int usia, tinggiBadan;

		System.out.print("Masukan Nama Lengkap :") ;
		nama = scString.nextLine();

		System.out.print("Masukkan No. Telepon :") ;
		noHp = scString.nextLine();

		System.out.print("Masukkan Tempat Tanggal Lahir :") ;
		ttl = scString.nextLine();

		System.out.print("masukkan Usia :") ;
		usia = scInt.nextInt();

		System.out.print("Tinggi badan: ") ;
		tinggiBadan = scInt.nextInt() ;

		System.out.println("Boidata") ;
		System.out.println("Nama:" + nama ) ;
		System.out.println("No Hp:" + noHp ) ;
		System.out.println("TTL:" + ttl ) ;
		System.out.println("Usia:" + usia ) ;
		System.out.println("Tinggi Badan :" + tinggiBadan ) ;

	}
}

