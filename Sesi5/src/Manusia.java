
public class Manusia {
	private String nama;
	private int umur;
	
	public Manusia(String nama, int umur) {
		super();
		this.nama = nama;
		this.umur = umur;
	}
	
	public void ulangTahun() {
		umur++;
	}
	
	public String getNama() {
		return nama;
	}
	public int getUmur() {
		return umur;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public void setUmur(int umur) {
		this.umur = umur;
	}
	
	
	
}
