package de.schdef.slash.coding.designpatterns.duck;

import de.schdef.slash.coding.designpatterns.observing.ObservableHelper;
import de.schdef.slash.coding.designpatterns.observing.QuackableObserver;

public class RubberDuck extends Duck {
	
	ObservableHelper helper;
	
	public RubberDuck() {
		super("Rubber");
		helper = new ObservableHelper(this);
	}
	@Override
	public void quack() {
		System.out.println("Rubber duck squeeze");
		notifyObservers();
	}

	@Override
	public void addObserver(QuackableObserver observer) {
		helper.addObserver(observer);
		
	}

	@Override
	public void notifyObservers() {
		helper.notifyObservers();		
	}

}
