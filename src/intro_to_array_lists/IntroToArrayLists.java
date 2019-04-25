package intro_to_array_lists;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> stringarray = new ArrayList<String>();
		//2. Add five Strings to your list
		stringarray.add("Stop, I could have dropped my croissant");
		stringarray.add("Let me see what you have, a knife, NOO");
		stringarray.add("well when life gives you lemons. duuh duh duhhh duh duhhh duhhh");
		stringarray.add("In all levels except physical, I am a wolf");
		stringarray.add("makes me feel, so o o o, o o o, O O O, OH OH O, OHH OHH OHH., AOHAOHAOHAOH, o o o o o");
		//3. Print all the Strings using a standard for-loop
		for(int i = 0; i< stringarray.size(); i++) {
			JOptionPane.showMessageDialog(null, stringarray.get(i));
		//4. Print all the Strings using a for-each loop
		for(String vines:stringarray ) {
			JOptionPane.showMessageDialog(null, vines);
		}
		//5. Print only the even numbered elements in the list.
		
		//6. Print all the Strings in reverse order.
		
		//7. Print only the Strings that have the letter 'e' in them.
	}
}
}