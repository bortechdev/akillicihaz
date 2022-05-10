package proje.akillicihaz.agArayuzu;

import java.util.Scanner;

import proje.araclar.Observable;

public class AgArayuzu extends Observable implements IAgArayuzu {
	@Override
	public void kullaniciyaBaglan() {
		Scanner scanner = new Scanner(System.in);
		String tuslanan = null;
		System.out.println(
				"**********************\nSicakligi gormek icin \"1\"\nSogutuyu acmak icin \"2\"\nSogutuyu kapamak icin \"3\"\'u tuslayiniz");
		tuslanan = scanner.nextLine();
		notifyObservers(tuslanan);
	}
}
