// Nama : Rahman Hanif Aji Saputra
// Nim	: 24060122140128
// Desc	: MainTitik.java
// file	: MTitik.java

class MTitik
{
	public static void main(String[] args)
	{
		Titik t1,t2,t3;
		t1 = new Titik();
		t2 = new Titik();
		t3 = new Titik(5,6);

		t1.setAbsis(1);
		t1.setOrdinat(2);

		t2.setAbsis(3);
		t2.setOrdinat(4);

		System.out.println("Jumlah Objek Titik = " + Titik.getcounterTitik());
		System.out.println("t1" + "("+ t1.getAbsis() + ", " + t1.getOrdinat() + ")" );
		System.out.println("t2" + "("+ t2.getAbsis() + ", " + t2.getOrdinat() + ")" );
		System.out.println("t3" + "("+ t3.getAbsis() + ", " + t3.getOrdinat() + ")" );

		System.out.println("Jarak T1 terhadap pusat = "+t1.getJarakPusat());

		t1.refleksiX();
		System.out.println("t1" + "("+ t1.getAbsis() + ", " + t1.getOrdinat() + ")" );


		t2.refleksiY();
		System.out.println("t2" + "("+ t2.getAbsis() + ", " + t2.getOrdinat() + ")" );
		System.out.println("t3" + "("+ t3.getAbsis() + ", " + t3.getOrdinat() + ")" );
		System.out.println("t3" + "("+ t3.getAbsis() + ", " + t3.getOrdinat() + ")" );
	}
}

