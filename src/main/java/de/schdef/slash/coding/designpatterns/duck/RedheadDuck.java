package de.schdef.slash.coding.designpatterns.duck;

import de.schdef.slash.coding.designpatterns.oberserving.ObservableHelper;
import de.schdef.slash.coding.designpatterns.oberserving.QuackableObserver;

public class RedheadDuck extends Duck {

	ObservableHelper helper;
	
	public RedheadDuck() {
		super("Readhead");
		helper = new ObservableHelper(this);
	}
	
	@Override
	public void quack() {
		System.out.println("Redhead Quack, quack");
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
