package proje;

import proje.akillicihaz.AkilliCihazFactory;

import proje.akillicihaz.IAkilliCihaz;
import proje.kullanici.KullaniciRepositoryPostreSQL;
import proje.kullanici.KullaniciService;

public class Program {

	public static void main(String[] args) {
		KullaniciService kullaniciService = new KullaniciService(new KullaniciRepositoryPostreSQL());
		kullaniciService.zorunluGirisYaptir();

		IAkilliCihaz akilliCihaz = new AkilliCihazFactory().factoryMethod();
		akilliCihaz.basla();
	}

}
