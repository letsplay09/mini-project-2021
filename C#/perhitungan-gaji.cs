using System;

namespace minggu3latihan1
{
    class MainClass
    {
        public static void Main (string[] args)
        {
            string nama, nip, status;
            int masa, tunjangannikah = 0, gaji, tunjanganmasa = 0, gajiakhir;

            Console.WriteLine("\t\t\tMenghitung Gaji Karyawan\t\t\t");
            Console.WriteLine(" ");
            Console.Write("Input Nama                    : ");
            nama = Console.ReadLine();
            Console.Write("Input NIP                     : ");
            nip = Console.ReadLine();
            Console.Write("Gaji Pokok              : ");
            gaji = int.Parse(Console.ReadLine());
            Console.Write("Lama Masa Kerja (Tahun) : ");
            masa = int.Parse(Console.ReadLine());
            if (masa >= 3)
            {
                tunjanganmasa = 20 * gaji / 100;
            }
            Console.Write("sudah menikah? (y/n) : ");
            status = Console.ReadLine();
            status.ToLower();

            if (status == "y" || status == "ya" || status == "yes")
            {
                tunjangannikah = 10 * gaji / 100;
            }

            gajiakhir = gaji + tunjanganmasa + tunjangannikah;

            Console.WriteLine("==================================");
            Console.WriteLine("Nama                 : "+nama);
            Console.WriteLine("Gaji Pokok           : " + gaji);
            Console.WriteLine("Tunjangan Nikah      : " + tunjangannikah);
            Console.WriteLine("Tunjangan Masa Kerja : " + tunjanganmasa);
            Console.WriteLine("Gaji Bersih          : " + gajiakhir);
            Console.Read();
        }
    }
}
