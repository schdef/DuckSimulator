package de.schdef.slash.coding.duck;
import java.util.ArrayList;
import java.util.List;

import de.schdef.slash.coding.oberserving.QuackableObserver;


public class Flock implements Quackable {

	private List<Quackable> quackableChildren = new ArrayList<Quackable>();
	
	@Override
	public void quack() {
		for (Quackable quackable : quackableChildren) {
			quackable.quack();
		}

	}
	
	public void add(Quackable quackable) {
		this.quackableChildren.add(quackable);
	}

	@Override
	public void addObserver(QuackableObserver observer) {
		for (Quackable quackable : quackableChildren) {
			quackable.addObserver(observer);
		}
		
	}

	@Override
	public void notifyObservers() {
		for (Quackable quackable : quackableChildren) {
			quackable.notifyObservers();
		}
		
	}

}
