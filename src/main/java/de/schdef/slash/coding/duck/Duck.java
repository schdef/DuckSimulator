package de.schdef.slash.coding.duck;

public abstract class Duck 
	implements Quackable {

	String name;
	
	public Duck(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
}
