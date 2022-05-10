package proje.akillicihaz;

import proje.akillicihaz.agArayuzu.AgArayuzu;
import proje.akillicihaz.agArayuzu.IAgArayuzu;
import proje.akillicihaz.anaIslemPlatformu.AnaIslemPlatformu;
import proje.akillicihaz.anaIslemPlatformu.IAnaIslemPlatformu;
import proje.akillicihaz.eyleyici.Eyleyici;
import proje.akillicihaz.eyleyici.IEyleyici;
import proje.akillicihaz.sicaklikAlgilayici.ISicaklikAlgilayici;
import proje.akillicihaz.sicaklikAlgilayici.SicaklikAlgilayici;
import proje.araclar.Observable;

public class AkilliCihazFactory implements IAkilliCihazFactory {

	@Override
	public IAkilliCihaz factoryMethod() {
		IEyleyici eyleyici = new Eyleyici();
		ISicaklikAlgilayici sicaklikAlgilayici = new SicaklikAlgilayici();
		IAnaIslemPlatformu anaIslemPlatformu = new AnaIslemPlatformu(eyleyici, sicaklikAlgilayici);

		IAgArayuzu agArayuzu = new AgArayuzu();
		((Observable) agArayuzu).attach(anaIslemPlatformu);

		IAkilliCihaz akilliCihaz = new AkilliCihaz(agArayuzu);
		return akilliCihaz;
	}
}
