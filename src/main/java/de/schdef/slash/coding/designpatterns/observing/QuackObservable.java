package de.schdef.slash.coding.designpatterns.observing;



public interface QuackObservable {

	void addObserver(QuackableObserver observer);
	
	void notifyObservers();
}
