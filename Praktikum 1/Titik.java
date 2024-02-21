// Nama : Rahman Hanif Aji Saputra
// Nim	: 24060122140128
// Desc	: body Titik.java
// file	: Titik.java
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