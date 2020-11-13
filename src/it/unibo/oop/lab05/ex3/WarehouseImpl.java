package it.unibo.oop.lab05.ex3;

import java.util.HashSet;
import java.util.Set;

public class WarehouseImpl implements Warehouse {

	private final Set<Product> internalMem;  
	
	public WarehouseImpl(final Set<Product> inputSet) {
		this.internalMem = inputSet;
	}
	
	public WarehouseImpl() {
		this(new HashSet<Product>());
	}
	
	public void addProduct(final Product p) {
		this.internalMem.add(p);
	}

	public Set<String> allNames() {
		final Set<String> outputSet = new HashSet<>();
		for(final Product p : this.internalMem) {
			outputSet.add(p.getName());
		}
		return outputSet;
	}

	public Set<Product> allProducts() {
		return new HashSet<>(this.internalMem);
	}

	public boolean containsProduct(final Product p) {
		return this.internalMem.contains(p);
	}

	public double getQuantity(final String name) {
		for(final Product p : this.internalMem) {
			if(p.getName() == name) {
				return p.getQuantity();
			}
		}
		return 0;
	}

}
