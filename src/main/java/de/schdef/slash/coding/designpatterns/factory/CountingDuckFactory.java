package de.schdef.slash.coding.designpatterns.factory;

import de.schdef.slash.coding.designpatterns.duck.Quackable;
import de.schdef.slash.coding.designpatterns.duck.QuackableCounter;
import de.schdef.slash.coding.designpatterns.duck.RedheadDuck;
import de.schdef.slash.coding.designpatterns.duck.RubberDuck;

public class CountingDuckFactory extends AbstractDuckFactory {

	@Override
	public Quackable createRedheadDuck() {
		return new QuackableCounter(new RedheadDuck());
	}

	@Override
	public Quackable createRubberDuck() {
		return new QuackableCounter(new RubberDuck());
	}

}
