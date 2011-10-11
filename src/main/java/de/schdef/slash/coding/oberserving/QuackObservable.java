package de.schdef.slash.coding.oberserving;



public interface QuackObservable {

	void addObserver(QuackableObserver observer);
	
	void notifyObservers();
}
