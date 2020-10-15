import java.util.Scanner;

class projectku
{
	public static void main(String[] args)
	{
		awal();
		
		Scanner sc = new Scanner(System.in);
		
		int ketentuan = 300000;
		int [] arr1;
		int [] kembalian;
		arr1= new int[12];
		kembalian = new int[12];
		
		System.out.println();
		System.out.println("!!!!!!!!!!!!++++++++++++++++++!!!!!!!!!!!!!!");
		System.out.println("!!Ketentuan Pembayaran Perbulan : "+ketentuan + "!!");
		System.out.println("!!!!!!!!!!!!++++++++++++++++++!!!!!!!!!!!!!!");

		System.out.println();
		System.out.println("======================================");
		for (int i=0; i<12; i++) 
		{
			System.out.print("Masukkan Pembayaran air Pada Bulan "+(i+1)+" : ");
			arr1[i]= sc.nextInt();
			System.out.println("_____________________________________________");
			
			fungsi(arr1,ketentuan,kembalian);
		}

		tampil(arr1,ketentuan,kembalian);
		System.out.println();

		for(int i=0; i<12; i++)
		{
			if(arr1[i] < ketentuan)
			{
				System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==");
				System.out.print("Anda wajib membayar sisa uang pada bulan "+ (i+1) + " sebesar " + kembalian[i] + "  : ");
				arr1[i] = sc.nextInt();	
				System.out.println("--------------------------------------------------");
			}

		}

		tampil_simpan(arr1,ketentuan,kembalian);	
	}

	static void tampil_simpan(int[] arr1,int ketentuan, int[] kembalian)
	{
		for (int i=0; i<12; i++) 
		{
			if(arr1[i]>kembalian[i])
			{

				System.out.println(" Bulan ke " + (i+1) +" LUNAS , dengan kembalian Rp." + kembalian[i]);
			}
			else if(arr1[i]<kembalian[i])
			{
				kembalian[i] = kembalian[i] - arr1[i];
				System.out.println(" Bulan ke " + (i+1)+ " BELUM LUNAS , Uang anda kurang sebesar Rp." + kembalian[i]);
			}
			else
			{
				System.out.println(" ============================= "); 
				System.out.println(" Bulan ke " + (i+1) + " LUNAS");
			}
		}
	}

	static void tampil(int[] arr1,int ketentuan, int[] kembalian)
	{
		for (int i=0; i<12; i++) 
		{
			if(arr1[i]>ketentuan)
			{	 
				System.out.println(" Bulan ke " + (i+1) +" LUNAS , dengan kembalian Rp." + kembalian[i]);
			}
			else if(arr1[i]<ketentuan)
			{				
				System.out.println(" Bulan ke " + (i+1)+ " BELUM LUNAS , Uang anda kurang sebesar Rp." + kembalian[i]);
			}
			else
			{		
				System.out.println(" Bulan ke " + (i+1) + " LUNAS");
			}
		}
	}

	static int[] fungsi(int[] arr1, int ketentuan,int[] kembalian)
	{
		for(int i=0;i<12;i++)
		{
			if(arr1[i]>ketentuan)
			{
				kembalian[i] = arr1[i] - ketentuan; 		
			}
			else if(arr1[i]<ketentuan)
			{
				kembalian[i] = ketentuan - arr1[i];	
			}
			else
			{
				kembalian[i] = 0;	
			}
		}
		return kembalian;
	}
	static void awal()
	{
		System.out.println("     ||||||||||||||||||||||||||||||||||||||||||   ");
		System.out.println("     |             PEMBAYARAN AIR             |    ");
		System.out.println("     |________________________________________|   ");
		System.out.println("     |________________________________________|   ");
	}
}