package de.schdef.slash.coding.designpatterns;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import de.schdef.slash.coding.designpatterns.duck.Flock;
import de.schdef.slash.coding.designpatterns.duck.Quackable;
import de.schdef.slash.coding.designpatterns.duck.QuackableCounter;
import de.schdef.slash.coding.designpatterns.factory.AbstractDuckFactory;
import de.schdef.slash.coding.designpatterns.factory.CountingDuckFactory;
import de.schdef.slash.coding.designpatterns.observing.Quackologist;

public class DuckSimulatorTest {

	@Test
	public void testDuckSimulator() {
		AbstractDuckFactory duckFactory = new CountingDuckFactory();
		simulate(duckFactory);
	}

	private void simulate(AbstractDuckFactory duckFactory) {
		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		
		Flock flock = createFlock(redheadDuck, rubberDuck);
		
		Quackologist logist = new Quackologist();
		flock.addObserver(logist);
		
		simulate(flock);
		
		assertEquals(2, QuackableCounter.getQuackCounts());
	}

	private Flock createFlock(Quackable... ducks) {
		Flock flock = new Flock();
		
		for (Quackable quackable : ducks) {
			flock.add(quackable);
		}
		
		return flock;
	}

	private void simulate(Quackable duck) {
		duck.quack();
		
	}
	
}
