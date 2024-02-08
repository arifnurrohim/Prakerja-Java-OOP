
public class Main {

	public static void main(String[] args){
		Manusia andi = new Manusia();

		Mahasiswa budi = new Mahasiswa();

		//set attribute
		andi.setNama("Andi");
		andi.setUmur(19);

		budi.setNama("Budi");
		budi.setNim("2201234876");
		budi.setUmur(19);
		budi.setIpk((float) 3.0);

//		//gunakan method belajar hasil overloading
//		budi.belajar();
//		System.out.println(budi.getNama()+" Memiliki IPK "+budi.getIpk());
//
//		budi.belajar(5);
//		System.out.println(budi.getNama()+" Memiliki IPK "+budi.getIpk());
//
//		budi.belajar(4, "Clarissa");
//		System.out.println(budi.getNama()+" Memiliki IPK "+budi.getIpk());

		//Overriding
		andi.rename("Garry");
		budi.rename("Larry");

		

	}	
}