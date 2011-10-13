package de.schdef.slash.coding.designpatterns.duck;

import de.schdef.slash.coding.designpatterns.oberserving.QuackObservable;

public interface Quackable extends QuackObservable {
	void quack();
}
