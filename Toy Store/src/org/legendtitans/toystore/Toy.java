//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

//design and create
//your Toy class

//Use the lab handout
//and sample runner
//code provided
//to help you
package org.legendtitans.toystore;

public class Toy{
	private String name;
	private int count = 1;
	
	public Toy(String n) {
		this.name = n;
	}
	
	public void setCount(int c) {
		count = c;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public int getCount() {
		return count;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return name + " " + count;
	}
	
}