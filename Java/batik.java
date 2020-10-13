import java.util.Scanner;

class batik
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);

		double sblm_diskon, jmlh_diskon, ssdh_diskon, x;

		System.out.println("Masukkan panjang kain batik yang dibeli (dalam satuan meter) : ");
		x = sc.nextDouble();

		System.out.println("");

		sblm_diskon = x * 50000;
		System.out.println("Harga kain batik sebelum diskon :" + sblm_diskon);

		if(sblm_diskon > 50000)
		{
			jmlh_diskon = sblm_diskon * 50 / 100;
			System.out.println("Jumlah diskon : " + jmlh_diskon);

			ssdh_diskon = sblm_diskon - jmlh_diskon;
			System.out.println("Total harga sesudah diskon : " + ssdh_diskon);
		}
		else
		{
			jmlh_diskon = sblm_diskon * 0;
			System.out.println("Jumlah diskon : " + jmlh_diskon);

			ssdh_diskon = sblm_diskon - jmlh_diskon;
			System.out.println("Total harga sesudah diskon : " + ssdh_diskon);
		}
	}
}