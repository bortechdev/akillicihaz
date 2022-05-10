package proje;

import proje.Kullanici.KullaniciRepositoryPostreSQL;
import proje.Kullanici.KullaniciService;

public class Program {
	
	public static void main(String[] args) {
		KullaniciService kullaniciService = new KullaniciService(new KullaniciRepositoryPostreSQL());
		kullaniciService.zorunluGirisYaptir();
	}

}
