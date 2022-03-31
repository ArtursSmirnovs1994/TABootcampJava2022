package sef.module8.activity;

//Needs to be completed
import java.util.Set;
import java.util.TreeSet;


public class SetActivity {

	public static void main(String[] args) {
		//TODO: 1 - Type code to create a set of names.

		TreeSet animesNeedToWatch = new TreeSet();

		//Names must be sorted by their natural order.

		animesNeedToWatch.add("PsychoPass");
		animesNeedToWatch.add("Steins-Gate");
		animesNeedToWatch.add("Demon Slayer S2");
		animesNeedToWatch.add("Death Parade");
		animesNeedToWatch.add("Uramichi san or whatever its called - the depressed dude who works with children");
		animesNeedToWatch.add("Wonder egg priority");
		animesNeedToWatch.add("Demon slayer s2");
		animesNeedToWatch.add("Demon Slayer S2");

		//Do research to find if you already have such a class. 
		//Also try adding a few duplicate entries to this set.

		//TODO: 2 - Call print method to print the set passed as its parameter.
		System.out.println("A little part of an endless list on animes: ");
		print(animesNeedToWatch);
	}
	
	public static void print(Set animeNeedToWatch)
	{
		//TODO: 3 - Type code to print this set
		for (Object myObject : animeNeedToWatch) {
			System.out.println(myObject.toString());
		}
		//Notice the order in which elements get printed.
	}
}
