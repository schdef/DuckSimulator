package de.schdef.slash.coding.designpatterns.oberserving;

import de.schdef.slash.coding.designpatterns.duck.Duck;

public interface QuackableObserver {

	void update(Duck duck);
}
