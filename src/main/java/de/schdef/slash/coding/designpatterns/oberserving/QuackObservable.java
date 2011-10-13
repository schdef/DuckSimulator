package de.schdef.slash.coding.designpatterns.oberserving;



public interface QuackObservable {

	void addObserver(QuackableObserver observer);
	
	void notifyObservers();
}
