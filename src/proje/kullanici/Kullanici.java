package proje.kullanici;

public class Kullanici {
	private String id;
	private String sifre;

	public Kullanici(String id, String sifre) {
		this.id = id;
		this.sifre = sifre;
	}

	public String getId() {
		return id;
	}

	public String getSifre() {
		return sifre;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setSifre(String sifre) {
		this.sifre = sifre;
	}

	@Override
	public String toString() {
		return "Kullanici{" + "id" + id + ", sifre='" + sifre + '}';
	}

}