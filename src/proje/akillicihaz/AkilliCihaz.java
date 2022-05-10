package proje.akillicihaz;

import proje.akillicihaz.agArayuzu.IAgArayuzu;

public class AkilliCihaz implements IAkilliCihaz {
	private final IAgArayuzu agArayuzu;

	public AkilliCihaz(IAgArayuzu agArayuzu) {
		this.agArayuzu = agArayuzu;
	}

	@Override
	public void basla() {
		while (true) {
			agArayuzu.kullaniciyaBaglan();
		}
	}
}
