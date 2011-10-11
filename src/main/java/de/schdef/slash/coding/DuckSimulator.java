package de.schdef.slash.coding;

import de.schdef.slash.coding.duck.Flock;
import de.schdef.slash.coding.duck.Quackable;
import de.schdef.slash.coding.duck.QuackableCounter;
import de.schdef.slash.coding.factory.AbstractDuckFactory;
import de.schdef.slash.coding.factory.CountingDuckFactory;
import de.schdef.slash.coding.oberserving.Quackologist;

public class DuckSimulator {

	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		AbstractDuckFactory duckFactory = new CountingDuckFactory();
		simulator.simulate(duckFactory);
	}

	private void simulate(AbstractDuckFactory duckFactory) {
		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		
		Flock flock = createFlock(redheadDuck, rubberDuck);
		
		Quackologist logist = new Quackologist();
		flock.addObserver(logist);
		
		simulate(flock);
		
		System.out.println("There were " + QuackableCounter.getQuackCounts() 
				+ " quacks detected.");
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
