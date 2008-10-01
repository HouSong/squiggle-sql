package com.truemesh.squiggle;

/**
 * What can be selected from a table.
 * 
 * @author Nat Pryce
 */
public abstract class Projection implements Selectable {
	private final Table table;
	
	public Projection(Table table) {
		this.table = table;
	}
	
	public Table getTable() {
		return table;
	}
}
