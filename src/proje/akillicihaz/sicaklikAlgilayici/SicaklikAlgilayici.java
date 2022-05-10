package proje.akillicihaz.sicaklikAlgilayici;

import proje.araclar.Observable;

public class SicaklikAlgilayici extends Observable implements ISicaklikAlgilayici {

	@Override
	public void sicaklikOku() {
		System.out.println("Guncel sicaklik: " + (int) (Math.random() * 40));
	}

}
