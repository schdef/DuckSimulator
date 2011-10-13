package de.schdef.slash.coding.designpatterns.duck;

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
