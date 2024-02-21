/**
 * File      	: MTitik.java		21/02/24
 * Nama penulis      : Rahman Hanif Aji Saputra
 * NIM               : 24060122140128
 * Deskripsi 		: Kelas yang berisi Body dari Titik
 * 
 */
class Titik
{
	double absis, ordinat;
	static double counterTitik;

	Titik()
	{
		absis = 0 ;
		ordinat = 0;
		counterTitik++;
	}

	Titik(double abs , double ord)
	{
		absis = abs ;
		ordinat = ord;
		counterTitik++;
	}

	void setAbsis(double abs)
	{
		absis = abs;
	}
	
	void setOrdinat(double ord)
	{
		ordinat = ord;
	}	

	double getAbsis()
	{
		return absis;
	}
	
	double getOrdinat()
	{
		return ordinat;
	}

	static double getcounterTitik()
	{
		return counterTitik;
	}

}
