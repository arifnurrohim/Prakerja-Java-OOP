
public class Main {
	
	public static void main(String[] args){
	//Buat object menggunakan constructor tanpa parameter
	Mahasiswa andi = new Mahasiswa();

	//Membuat object dengan costructor  dengan parameter
	Mahasiswa budi = new Mahasiswa("1234567", "Budi", (float) 3.89);
			
			//akan error jika akses langsung ke variable yang jenisnya private
			//solusi 1 : kita akses dengan getter dan setter
			//solusi 2 : ubah jenis variable menjadi public atau no access modifier

	// System.out.println("NIM : "+andi.getNim());
	// System.out.println("Nama : "+andi.getNama());
	// System.out.println("IPK : "+andi.getIpk());

	// System.out.println("NIM : "+budi.getNim());
	// System.out.println("Nama : "+budi.getNama());
	// System.out.println("IPK : "+budi.getIpk());
	
	// //Memanggil method belajar
	// andi.belajar((float)150);
	// System.out.println("IPK: "+andi.getIpk());
	
	
	//Memanggil static variable, dapat dipanggil melalui object maupun class
	Mahasiswa.jumlah = 10;
	System.out.println(Mahasiswa.jumlah);
	System.out.println(andi.jumlah);
	System.out.println(budi.jumlah);

	andi.jumlah = 20;
	System.out.println(Mahasiswa.jumlah);
	System.out.println(andi.jumlah);
	System.out.println(budi.jumlah);

	//Memanggil static method tambahMahasiswa
	Mahasiswa.tambahMahasiswa();
	System.out.println(Mahasiswa.jumlah);
	}	
}