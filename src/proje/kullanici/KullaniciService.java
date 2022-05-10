package proje.kullanici;

import java.util.Scanner;

public class KullaniciService {
	private final IKullaniciRepository kullaniciRepository;

	public KullaniciService(IKullaniciRepository kullaniciRepository) {
		this.kullaniciRepository = kullaniciRepository;
	}

	private boolean sifreDogruFormatta(String sifre) {
		return sifre != null && sifre != "";
	}

	private boolean kullaniciGecerli(Kullanici kullanici) {
		return kullanici != null;
	}

	private boolean idDogruFormatta(String id) {
		return id != null && id != "";
	}

	private boolean sifreDogru(Kullanici kullanici, String sifre) {
		return kullanici.getSifre().equals(sifre);
	}

	public void zorunluGirisYaptir() {
		Scanner scanner = new Scanner(System.in);
		String sifre = null;
		while (!sifreDogruFormatta(sifre)) {
			Kullanici kullanici = null;
			while (!kullaniciGecerli(kullanici)) {
				String id = null;
				while (!idDogruFormatta(id)) {
					System.out.println("Id'nizi giriniz");
					id = scanner.nextLine();
					if (!idDogruFormatta(id))
						System.out.println("Id dogru formatta degil, bos olamaz");
				}
				kullanici = kullaniciRepository.getKullanici(id);
				if (!kullaniciGecerli(kullanici))
					System.out.println("Kullanici gecerli degil, boyle bir kullanici yok");
			}
			while (!sifreDogru(kullanici, sifre)) {
				System.out.println("Sifrenizi giriniz");
				sifre = scanner.nextLine();
				if (!sifreDogruFormatta(sifre))
					System.out.println("Sifre dogru formatta degil, bos olamaz");
				if (!sifreDogru(kullanici, sifre))
					System.out.println("Sifre yanlis");
			}
			System.out.println("Giris basarili\n************************ Hos Geldiniz Sayin " + kullanici.getId()
					+ " ************************");
		}
	}

}