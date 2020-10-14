class Kecepatan
{
	public static void main(String args[])
	{

		int kecepatan = 200;

		if(kecepatan >= 100)
		{
			System.out.println("terlalu cepat");
		}
		else if(kecepatan < 100 && kecepatan >= 80)
		{
			System.out.println("cepat");
		}
		else if(kecepatan < 80 && kecepatan >= 40)
		{
			System.out.println("aman");
		}
		else
		{
			System.out.println("lambat");
		}
	}
}