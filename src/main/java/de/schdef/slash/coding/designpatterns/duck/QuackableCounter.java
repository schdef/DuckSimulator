package de.schdef.slash.coding.designpatterns.duck;

import de.schdef.slash.coding.designpatterns.oberserving.QuackableObserver;

public class QuackableCounter implements Quackable {

	private Duck duck;
	private static int counter = 0;
	
	public QuackableCounter(Duck duck) {
		this.duck = duck;
	}

	@Override
	public void quack() {
		duck.quack();
		counter++;
	}

	@Override
	public void addObserver(QuackableObserver observer) {
		this.duck.addObserver(observer);
		
	}

	@Override
	public void notifyObservers() {
		this.duck.notifyObservers();		
	}

	public static int getQuackCounts() {
		return counter;
	}

}
