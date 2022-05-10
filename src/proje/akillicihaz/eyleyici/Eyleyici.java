package proje.akillicihaz.eyleyici;

public class Eyleyici implements IEyleyici {
	@Override
	public void sogutucuAc() {
		System.out.println("Sogutucu acildi");
	}

	@Override
	public void sogutucuKapat() {
		System.out.println("Sogutucu kapatildi");
	}
}
