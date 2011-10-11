package de.schdef.slash.coding.factory;

import de.schdef.slash.coding.duck.Quackable;
import de.schdef.slash.coding.duck.QuackableCounter;
import de.schdef.slash.coding.duck.RedheadDuck;
import de.schdef.slash.coding.duck.RubberDuck;

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
