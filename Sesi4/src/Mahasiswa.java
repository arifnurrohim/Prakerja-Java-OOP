
public class Mahasiswa {
	//Attribut
	private String nim;
	private String nama;
	private float ipk;

	//Constractor tanpa parameter
	public Mahasiswa(){
		nim = "";
		nama = "";
		ipk = 0;
	}

	//Constructor dengan parameter
	public Mahasiswa(String nim, String nama, float ipk){
		this.nim = nim;
		this.nama = nama;
		this.ipk = ipk;
	}
	//Method Baru
	void belajar(float jam){
		//ipk = ipk + (jam/50);
		ipk += jam/50;
	}
	public static void tambahMahasiswa(){
		jumlah++;
	}

	//Getter
	public String getNim() {
		return nim;
	}
	public String getNama() {
		return nama;
	}
	public float getIpk() {
		return ipk;
	}
	//Setter
	public void setNim(String nim) {
		this.nim = nim;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public void setIpk(float ipk) {
		this.ipk = ipk;
	}

	final static double pi = 3.14;
	static int jumlah;
	
}