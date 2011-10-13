package de.schdef.slash.coding.designpatterns.oberserving;
import java.util.ArrayList;
import java.util.List;

import de.schdef.slash.coding.designpatterns.duck.Duck;


public class ObservableHelper implements QuackObservable {

	private Duck duck;
	private List<QuackableObserver> observers = new ArrayList<QuackableObserver>();

	public ObservableHelper(Duck duck) {
		this.duck = duck;
	}

	@Override
	public void addObserver(QuackableObserver observer) {
		this.observers.add(observer);
		
	}

	@Override
	public void notifyObservers() {
		for (QuackableObserver observer : observers) {
			observer.update(duck);
		}
	}
}
