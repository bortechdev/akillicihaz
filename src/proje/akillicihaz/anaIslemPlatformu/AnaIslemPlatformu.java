package proje.akillicihaz.anaIslemPlatformu;

import proje.akillicihaz.Durum;
import proje.akillicihaz.eyleyici.IEyleyici;
import proje.akillicihaz.sicaklikAlgilayici.ISicaklikAlgilayici;

public class AnaIslemPlatformu implements IAnaIslemPlatformu {
	Durum durum = Durum.kapali;
	private final IEyleyici eyleyici;
	private final ISicaklikAlgilayici sicaklikAlgilayici;

	public AnaIslemPlatformu(IEyleyici eyleyici, ISicaklikAlgilayici sicaklikAlgilayici) {
		this.durum = Durum.acilisTestiYapiliyor;
		this.eyleyici = eyleyici;
		this.sicaklikAlgilayici = sicaklikAlgilayici;
	}

	@Override
	public void update(String tuslanan) {
		durum = Durum.algilama;
		switch (tuslanan) {
		case "1":
			sicaklikGonder();
			break;
		case "2":
			sogutucuAc();
			break;
		case "3":
			sogutucuKapat();
			break;
		default:
			System.out.println("Tuslanan yanlis formatta, sadece 1,2 ve 3 tuslanabilir");
			break;
		}
		durum = Durum.bekleme;
	}

	@Override
	public void sogutucuAc() {
		durum = Durum.islemYapiliyor;
		eyleyici.sogutucuAc();
		durum = Durum.bekleme;
	}

	@Override
	public void sogutucuKapat() {
		durum = Durum.islemYapiliyor;
		eyleyici.sogutucuKapat();
		durum = Durum.bekleme;
	}

	@Override
	public void sicaklikGonder() {
		durum = Durum.islemYapiliyor;
		sicaklikAlgilayici.sicaklikOku();
		durum = Durum.bekleme;
	}

}
