package com.example.quickserve;

import java.io.Serializable;
import java.util.ArrayList;

public class Order implements Serializable {

	 
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int numDrinks;
	private ArrayList<String> sides;
	private ArrayList<ArrayList<String>> burgers;
	private boolean isCombo;
	// constructor from name on order 
	public Order(String name) {		
		
		this.setName(name);
	}
	
	public Order() {		
		
		this.numDrinks =0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumDrinks() {
		return numDrinks;
	}

	public void addDrink() {
		this.numDrinks++;
	}

	public ArrayList<String> getSides() {
		return sides;
	}

	public void addSide(String side) {
		this.sides.add(side);
	}

	public ArrayList<ArrayList<String>> getBurgers() {
		return burgers;
	}

	public void addBurger() {
		burgers.add(new ArrayList<String>());		
	}
	
	public void addTopping(String topping){
		burgers.get(burgers.size()-1).add(topping);
	}

	public boolean isCombo() {
		return isCombo;
	}

	public void setCombo(boolean isCombo) {
		this.isCombo = isCombo;
	}
}// end Order Class
