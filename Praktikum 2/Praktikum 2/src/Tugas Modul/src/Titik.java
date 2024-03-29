// Nama : Rahman Hanif Aji Saputra
// Nim	: 24060122140128
// Desc	: body Titik.java
// file	: Titik.java

public class Titik
{
	private double absis, ordinat;
	static double counterTitik;

	public Titik()
	{
		absis = 0 ;
		ordinat = 0;
		counterTitik++;
	}

	public Titik(double abs , double ord)
	{
		absis = abs ;
		ordinat = ord;
		counterTitik++;
	}

	public void setAbsis(double abs)
	{
		absis = abs;
	}

	public void setOrdinat(double ord)
	{
		ordinat = ord;
	}

	public double getAbsis()
	{
		return absis;
	}

	public double getOrdinat()
	{
		return ordinat;
	}

	public static double getcounterTitik()
	{
		return counterTitik;
	}
	public double getJarakPusat() {
		return Math.sqrt(Math.pow(absis,2)+Math.pow(ordinat,2)) ;
	}

	public void refleksiX(){

		setOrdinat(getOrdinat()*-1);
	}
	public void refleksiY(){

		setAbsis(getAbsis()*-1);
	}

	public Titik getRefleksiX(){
		return new Titik(getAbsis(),getOrdinat()*-1);
	}

	public Titik getRefleksiY(){
		return new Titik(getAbsis()*-1,getOrdinat());
	}

}