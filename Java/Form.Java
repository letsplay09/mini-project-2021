import java.util.Scanner;
class Form
{
	public static void main(String args[])
	{
		Scanner scInt = new Scanner (System.in);
		Scanner scString = new Scanner (System.in);
		String Profil,Form,Logout,NamaLengkap,Bio,Prodi,Jurusan,NamaAyah,NamaIbu,PekerjaanAyah,PekerjaanIbu,nama,tmpt;
		char p;
		int NIM,pilihan,Tgl,bln,thn,anak_ke,JumSau,pin,total, PendptanAyah,PendptanIbu ;
		

		System.out.println("\t\t\t\t  ************************");
		System.out.println("\t\t\t==========POLITEKNIK NEGERI MALANG==========");
		System.out.println("\t\t\t\t  ************************");
		System.out.println("------------------------------------------------------------------------------------------------------------------------");
		System.out.print("\n\n\n");
		System.out.println("Anda Harus Sign-in Terlebih Dahulu");
		System.out.print("\n");
		System.out.print("Masukkan N");
		System.out.print("ama: ");
		nama = scString.nextLine();
		System.out.println("PIN terdiri dari (0-9), 6 digit");
		System.out.print("\n");
		System.out.print("Masukkan PIN anda: ");
		pin = scInt.nextInt();
		System.out.print("\n");
		if (pin >= 100000 && pin <= 999999)
		{
			System.out.println("\t\t\t\t  ************************");
			System.out.println("\t\t\t==========POLITEKNIK NEGERI MALANG==========");
			System.out.println("\t\t\t\t  ************************");
			System.out.print("----------------------------------------------------------------------------------------------------------------------");
			System.out.print("\n\n");
			System.out.println("\t\t\t\t ***********************");
			System.out.println("\t\t\t\t *Create Account Succes* ");
			System.out.println("\t\t\t\t ***********************");
			System.out.print("\n\n");

			System.out.print("Masukkan Nama: ");
			nama = scString.nextLine();
			System.out.print("Masukkan PIN: ");
			pin = scString.nextInt();
			System.out.print("\n\n");
			if (pin >= 100000 && pin <= 999999 )
			{
				System.out.println("\t\t\t=====Anda berhasil Masuk=====");
				System.out.print("\n");

				System.out.println("\t1. Profil");
				System.out.println("\t2. Form");
				System.out.println("\t3.Logout");
				System.out.println("\t4. Non active Account: ");
				System.out.println("\n");
				System.out.print("Pilihan Anda: ");
				pilihan = scInt.nextInt();


					if (pilihan == 1 )
					{
						System.out.print("N");
						NamaLengkap = scString.nextLine();
						System.out.print("ama lengkap: ");
						NamaLengkap = scString.nextLine();
						System.out.print("Bio: ");
						Bio = scString.nextLine();

						System.out.println("Nama Lengkap: " + NamaLengkap);
						System.out.println("Bio: " + Bio);
						System.out.println("\n\n");
						System.out.println("Kembali ke menu lainnya?");
						System.out.println("\n");
						System.out.println("===========================================================================================");
						System.out.println("\t1. Profil");
						System.out.println("\t2. Form");
						System.out.println("\t3.Logout");
						System.out.println("===========================================================================================");
						System.out.print("Pilihan Anda: ");
						pilihan = scInt.nextInt();
					
						 if (pilihan == 2)
						{
							System.out.print("Nama Lengkap: ");
							NamaLengkap = scString.nextLine();
							System.out.print("Tempat Lahir: ");
							tmpt = scString.nextLine();
							System.out.print("Tanggal Lahir: ");
							Tgl = scInt.nextInt();
							System.out.print("Bulan Lahir: ");
							bln = scInt.nextInt();
							System.out.print("Tahun Lahir: ");
							thn = scInt.nextInt();
							System.out.print("Anak ke- : ");
							anak_ke = scInt.nextInt();
							System.out.print("Jumlah Saudara: ");
							JumSau = scInt.nextInt();
							System.out.print("NIM: ");
							NIM = scInt.nextInt();
							System.out.print("Jurusan: ");
							Jurusan = scString.nextLine();
							System.out.print("Prodi: ");
							Prodi = scString.nextLine();
							System.out.print("Nama Ayah: ");
							NamaAyah = scString.nextLine();
							System.out.print("Pekerjaan Ayah:");
							PekerjaanAyah = scString.nextLine();
							System.out.print("Pendapatan Ayah: ");
							PendptanAyah = scInt.nextInt();
							System.out.print("Nama Ibu: ");
							NamaIbu = scString.nextLine();
							System.out.print("Pekerjaan Ibu: ");
							PekerjaanIbu = scString.nextLine();
							System.out.print("Pendapatan Ibu: ");
							PendptanIbu = scInt.nextInt();

							total = PendptanAyah + PendptanIbu;

							if (total > 5000000)
							{
								total = PendptanAyah + PendptanIbu;
								System.out.println("Anda Tidak Dapat Beasiswa Pendidikan");
								if (total > 5000000)
								{
									System.out.println("Yakin ingin Logout ??? ");
									System.out.println("Pilihan : Y / N");
									System.out.print("Pilihan : ");
									p = scString.next().charAt(0);
									if (p == 'Y')
									{
										System.out.println("------------------------------------------------------------------------------------------------------------------------");
										System.out.println("\t\t\t\t  ************************");
										System.out.println("\t\t\t==========POLITEKNIK NEGERI MALANG==========");
										System.out.println("\t\t\t\t  ************************");
										System.out.println("------------------------------------------------------------------------------------------------------------------------");
										System.out.println("\n\n");
										System.out.print("\t\t\t\t\tAnda Sudah Keluar");
									}
									else if (p == 'N')
									{
										System.out.print("Anda Belum Keluar");
									}
								}
							}
							else if (total <= 5000000)
							{
								total = PendptanAyah + PendptanIbu;
								System.out.print("Anda Dapat Beasiswa Pendidikan");
								System.out.print("Silahkan Menghubungi Bagian Admin Jurusan");
								if (total <= 5000000)
								{
									System.out.println("Yakin ingin Logout ??? ");
									System.out.println("Pilihan : Y / N ");
									System.out.print("Pilihan : " );
									p = scString.next().charAt(0);
									if (p == 'Y')
									{
										System.out.println("------------------------------------------------------------------------------------------------------------------------");
										System.out.println("\t\t\t\t  ************************");
										System.out.println("\t\t\t==========POLITEKNIK NEGERI MALANG==========");
										System.out.println("\t\t\t\t  ************************");
										System.out.println("------------------------------------------------------------------------------------------------------------------------");
										System.out.println("\n\n");
										System.out.print("\t\t\t\t\tAnda Sudah Keluar");
									}
									else if (p == 'N')
									{
										System.out.print("Anda Belum Keluar" );
									}
								}
							}
						}

						else if (pilihan == 3)
							{
								System.out.println("Yakin ingin Logout ??? ");
								System.out.println("Pilihan : Y / N ");
								System.out.print("Pilihan : " );
								p = scString.next().charAt(0);
								if (p == 'Y')
								{
									System.out.println("------------------------------------------------------------------------------------------------------------------------");
									System.out.println("\t\t\t\t  ************************");
									System.out.println("\t\t\t==========POLITEKNIK NEGERI MALANG==========");
									System.out.println("\t\t\t\t  ************************");
									System.out.println("------------------------------------------------------------------------------------------------------------------------");
									System.out.println("\n\n");
									System.out.print("\t\t\t\t\tAnda Sudah Keluar");
								}
								else if (p == 'N')
								{
									System.out.print("Anda Belum Keluar" );
								}
							}
					}
				
					else if (pilihan == 2 )
					{
						System.out.print("N");
						NamaLengkap = scString.nextLine();
						System.out.print("ama Lengkap: ");
						NamaLengkap = scString.nextLine();
						System.out.print("Tempat Lahir: ");
						tmpt = scString.nextLine();
						System.out.print("Tanggal Lahir: ");
						Tgl = scInt.nextInt();
						System.out.print("Bulan Lahir: ");
						bln = scInt.nextInt();
						System.out.print("Tahun Lahir: ");
						thn = scInt.nextInt();
						System.out.print("Anak ke- : ");
						anak_ke = scInt.nextInt();
						System.out.print("Jumlah Saudara: ");
						JumSau = scInt.nextInt();
						System.out.print("NIM: ");
						NIM = scInt.nextInt();
						System.out.print("Jurusan: ");
						Jurusan = scString.nextLine();
						System.out.print("Prodi: ");
						Prodi = scString.nextLine();
						System.out.print("Nama Ayah: ");
						NamaAyah = scString.nextLine();
						System.out.print("Pekerjaan Ayah:");
						PekerjaanAyah = scString.nextLine();
						System.out.print("Pendapatan Ayah: ");
						PendptanAyah = scInt.nextInt();
						System.out.print("Nama Ibu: ");
						NamaIbu = scString.nextLine();
						System.out.print("Pekerjaan Ibu: ");
						PekerjaanIbu = scString.nextLine();
						System.out.print("Pendapatan Ibu: ");
						PendptanIbu = scInt.nextInt();

						total = PendptanAyah + PendptanIbu;

						if (total > 5000000)
						{
							total = PendptanAyah + PendptanIbu;
							System.out.print("Anda Tidak Dapat Beasiswa Pendidikan");
							System.out.println("\n");
							System.out.println("===========================================================================================");
							System.out.println("\n");
							System.out.println("\t\t 3.Logout ");
							System.out.println("\n");
							System.out.println("===========================================================================================");
							System.out.print("Pilihan Anda: ");
							pilihan = scInt.nextInt();
							if(pilihan == 3)
							{
								System.out.println("Yakin ingin Logout ??? ");
								System.out.println("Pilihan : Y / N ");
								System.out.println("Pilihan : ");
								p = scString.next().charAt(0);
								if (p == 'Y')
								{
									System.out.println("------------------------------------------------------------------------------------------------------------------------");
									System.out.println("\t\t\t\t  ************************");
									System.out.println("\t\t\t==========POLITEKNIK NEGERI MALANG==========");
									System.out.println("\t\t\t\t  ************************");
									System.out.println("------------------------------------------------------------------------------------------------------------------------");
									System.out.println("\n\n");
									System.out.print("\t\t\t\t\tAnda Sudah Keluar");
								}
								else if (p == 'N')
								{
									System.out.print("Anda Belum Keluar" );

								}
							}
							else
							{
								System.out.print("ERROR");
							}
						}
						else if (total <= 5000000)
						{
							total = PendptanAyah + PendptanIbu;
							System.out.print("Selamat, Anda Dapat Beasiswa Pendidikan");
							System.out.print("Silahkan Menghubungi Bagian Admin Jurusan");
							System.out.println("\n");
							System.out.println("===========================================================================================");
							System.out.println("\n");
							System.out.println("\t\t 3. Logout");
							System.out.println("\n");
							System.out.println("===========================================================================================");
							System.out.print("Pilihan Anda: ");
							pilihan = scInt.nextInt();
							if(pilihan == 3)
							{
								System.out.println("Yakin ingin Logout ??? ");
								System.out.println("Pilihan : Y / N ");
								System.out.print("Pilihan : ");
								p = scString.next().charAt(0);
								if (p == 'Y')
								{
									System.out.println("------------------------------------------------------------------------------------------------------------------------");
									System.out.println("\t\t\t\t  ************************");
									System.out.println("\t\t\t==========POLITEKNIK NEGERI MALANG==========");
									System.out.println("\t\t\t\t  ************************");
									System.out.println("------------------------------------------------------------------------------------------------------------------------");
									System.out.println("\n\n");
									System.out.print("\t\t\t\t\tAnda Sudah Keluar");
								}
								else if (p == 'N')
								{
									System.out.print("Anda Belum Keluar" );

								}
							else
							{
								System.out.print("ERROR");
							}
						}
					}	
				}
				else if (pilihan == 3)
				{
					System.out.println("Yakin ingin Logout ??? ");
					System.out.println("Pilihan : Y / N ");
					System.out.print("Pilihan : ");
					p = scString.next().charAt(0);
					if (p == 'Y')
					{
						System.out.print("Anda Sudah Keluar");
					}
					else if (p == 'N')
					{
						System.out.print("Anda Belum Keluar" );

					}

				}
				else if (pilihan == 4)
				{
					System.out.println("\t\t\t\t Your Account Not Actived ");
				}
			}
			else
			{
				System.out.print("\t\t\t\tNama/PIN anda salah");
			}
		}
		else
		{
			System.out.print("\t\t\t\tNama/PIN anda salah");
		}		

	}
}