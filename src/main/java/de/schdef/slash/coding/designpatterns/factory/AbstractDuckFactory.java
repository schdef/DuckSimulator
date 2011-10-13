package de.schdef.slash.coding.designpatterns.factory;

import de.schdef.slash.coding.designpatterns.duck.Quackable;

public abstract class AbstractDuckFactory {

	public abstract Quackable createRedheadDuck();
	
	public abstract Quackable createRubberDuck();

}
