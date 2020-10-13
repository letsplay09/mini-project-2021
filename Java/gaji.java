import java.util.Scanner;

class gaji
{
	public static void main(String args[])
	{
		System.out.println("==============================");
		System.out.println("||  MENGHITUNG GAJI BERSIH  ||  ");
		System.out.println("==============================");


		Scanner sc = new Scanner(System.in);

		double totgaji, gjpokok, uangmakan, uangtransport;

		System.out.println("Gaji pokok :");
		gjpokok = sc.nextDouble();

		System.out.println("Uang makan :");
		uangmakan = sc.nextDouble();

		System.out.println("Uang tranport :");
		uangtransport = sc.nextDouble();

		
		totgaji = gjpokok + uangmakan + uangtransport;


		if(totgaji >= 1000000)
		{
			totgaji = totgaji - (totgaji * 10 / 100);
			System.out.println("Gaji bersih yang diterima karyawan : " + totgaji);
		}
		else
		{
			System.out.println("Gaji bersih yang diterima karyawan : " + totgaji);
		}
	}

}