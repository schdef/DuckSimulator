package de.schdef.slash.coding.designpatterns.observing;

import de.schdef.slash.coding.designpatterns.duck.Duck;

public class Quackologist implements QuackableObserver {

	@Override
	public void update(Duck duck) {
		System.out.println(this.getClass().getSimpleName() + ": A "
				+ duck.getName() +" duck was quacking.");

	}

}
