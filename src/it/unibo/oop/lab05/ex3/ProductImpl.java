package it.unibo.oop.lab05.ex3;

public class ProductImpl implements Product {

	private String name; 
	private double quantity;
	
	public ProductImpl(final String name, final double quantity) {
		this.name = name;
		this.quantity = quantity;
	}

	public String getName() {
		return this.name;
	}

	public double getQuantity() {
		return this.quantity;
	}

}
