import java.util.Scanner;

class Game
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		menu();
	}

	static void menu()
	{
		System.out.println(" ===================================");
		System.out.println("==>  Selamat Datang di Permainan  <==");
		System.out.println("==>      1. Mulai Permainan       <==");
		System.out.println("==>      2. Keluar Permainan      <==");
		System.out.println(" ===================================");
		System.out.print("Masukkan pilihan 1/2: ");
		int n=sc.nextInt();
		String[] bil = new String [2];

		bil[0]= "\nPermainan Segera Dimulai\n";
		bil[1]= "\nTerimakasih Telah Masuk dalam Permainan :)";
		
		if(n==1)
		{
			System.out.println(bil[n-1]);
			karakter();
		}
		else if(n==2)
		{
			System.out.println(bil[n-1]);
		}
		else
		{
			System.out.println("\n\tInput tidak valid!! \n\tSilahkan pilih lagi\n");
			menu();
		}
	}

	static void karakter()
	{
		System.out.println(" =================================");
		System.out.println("==>   Silahkan Pilih Karakter   <==");
		System.out.println("==>         1. Fighter          <==");
		System.out.println("==>         2. Tank             <==");
		System.out.println("==>         3. Support          <==");
		System.out.println(" =================================");
		System.out.print("Masukkan pilihan 1/2/3: ");
		int n=sc.nextInt();
		String[] bil = new String [3];

		bil[0]= "\n\t Fighter";
		bil[1]= "\n\t  Tank";
		bil[2]= "\n\t Support";
		
		if(n==1 || n==2 || n==3)
		{
			System.out.println(bil[n-1]);
			expertise(n);
		}
		else
		{
			System.out.println("\n\tInput tidak valid!! \n\tSilahkan pilih lagi\n");
			karakter();
		}
	}

	static void expertise(int n)
	{
		int hp=0, damage=0;
		if(n==1)
		{
			hp=hp+500;		damage=damage+70;
			System.out.println("\tHP = "+ hp);
			System.out.println("\tdamage = "+ damage);
		}
		else if(n==2)
		{
			hp=hp+700;		damage=damage+55;
			System.out.println("\tHP = "+ hp);
			System.out.println("\tdamage = "+ damage);
		}
		else if(n==3)
		{
			hp=hp+400;		damage=damage+60;
			System.out.println("\tHP = " +hp);
			System.out.println("\tdamage = " +damage);
		}
		lagi(hp,damage);
	}

	static void lagi(int hp,int damage)
	{
		System.out.println("\nApakah Anda mau mengganti hero ?? \n\t 1 = ya \n\t 0 = tidak");
		System.out.print("Masukkan pilihan 0/1 : ");
		int lagi=sc.nextInt();
		if(lagi==1)
		{
			karakter();
		}
		else if(lagi==0)
		{
			pertempuran(hp,damage);
		}
		else
		{
			System.out.println("Masukkan dengan benar!!");
			lagi(hp,damage);
		}
	}
	
	static int AcakSerangan()
	{
		int nilai;
		{
			nilai = (int)(Math.random()*6);

			return nilai;
		}
	}

	static void pertempuran(int hp, int damage)
	{
		System.out.println("\n\t==>  PERMAINAN DIMULAI  <==\n");
		int damagemusuh=55, hpmusuh=450;
		while(hp>0 && hpmusuh>0)
		{
			if (AcakSerangan()==0)
			{
				System.out.println("serangan musuh miss");
				hp=hp-(damagemusuh*0);
				System.out.println("hp anda : "+hp);
			}
			else if (AcakSerangan()==1)
			{
				System.out.println("\t\t\t\tseranganmu miss");
				hpmusuh=hpmusuh-(damage*0);
				System.out.println("\t\t\t\thp musuh : " +hpmusuh);
			}
			else if (AcakSerangan()==2)
			{
				System.out.println("Terkena serangan musuh");
				hp=hp-damagemusuh;
				System.out.println("hp anda : " +hp);
			}
			else if (AcakSerangan()==3)
			{
				System.out.println("\t\t\t\tseranganmu terkena musuh");
				hpmusuh=hpmusuh-damage;
				System.out.println("\t\t\t\thp musuh : " +hpmusuh);
			}
			else if (AcakSerangan()==4)
			{
				System.out.println("musuh mendapatkan Double attack");
				hp=hp-(damagemusuh*2);
				System.out.println("hp anda : "+hp);
			}
			else if (AcakSerangan()==5)
			{
				System.out.println("\t\t\t\tanda mendapat Double attack");
				hpmusuh=hpmusuh-(damage*2);
				System.out.println("\t\t\t\thp musuh : "+hpmusuh);
			}
		}
		System.out.println("\n\t================================");
		if(hp<=0)
		{
			System.out.println("\t   Anda Kalah dalam Permainan");
		}
		else if(hpmusuh<=0)
		{
			System.out.println("\t   Anda Memenangkan Permainan");
		}
		System.out.println("\t================================\n");
		ulang();
	}

	static void ulang()
	{
		System.out.println(" ============================");
		System.out.println("==>        Tampilan        <==");
		System.out.println("==>    1. Menu Utama       <==");
		System.out.println("==>    2. pilih karakter   <==");
		System.out.println(" ============================");
		System.out.print("Masukkan pilihan 1/2 : ");
		int pilih=sc.nextInt();

		if(pilih == 1)
		{
			menu();
		}
		else if(pilih == 2)
		{
			karakter();
		}
		else
		{
			System.out.println("Silahkan pilih dengan benar !!");
			ulang();
		}
	}
}