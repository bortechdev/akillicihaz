package proje.araclar;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {

	private List<IObserver> observerList;

	public Observable() {
		observerList = new ArrayList<>();
	}

	public void attach(IObserver observer) {
		observerList.add(observer);
	}

	public void detach(IObserver observer) {
		observerList.remove(observer);
	}

	public void notifyObservers(String tuslanan) {
		for (IObserver observer : observerList) {
			observer.update(tuslanan);
		}
	}
}