//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
package org.legendtitans.toystore;


import java.util.ArrayList;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
		toyList = new ArrayList<Toy>();
	}

	public void loadToys( String[] toys )
	{
		for (int i=0; i<toys.length; i++) {
			
			
			//toyList.add(i, toys[i]);
		}
	}
  
  	public Toy getThatToy( String nm )
  	{
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		return "";
  	}  
  
  	public void sortToysByCount()
  	{
  	}  
  	  
	public String toString()
	{
	   return "";
	}
}