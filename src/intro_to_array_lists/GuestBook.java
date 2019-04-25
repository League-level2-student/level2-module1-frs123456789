package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	
	ArrayList<String> names = new ArrayList<String>();
	JFrame jf = new JFrame();
	JPanel jp = new JPanel();
	JButton jb = new JButton("Add Name");
	JButton jb1 = new JButton("View Names");

	public static void main(String[] args) {
		GuestBook gb = new GuestBook();
	gb.setup();
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	}
	void setup(){
		jb.addActionListener(this);
		jb1.addActionListener(this);
		jf.setVisible(true);
		jf.add(jp);
		jp.add(jb);
		jp.add(jb1);
		jf.pack();
		names.add("Bob Banders");
		names.add("Sandy Summers");
		names.add("Greg Ganders");
		names.add("Donny Doners");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton button = (JButton) e.getSource();
		if(button == jb) {
			String answer = JOptionPane.showInputDialog("Please enter your name :)");
			names.add(answer);
		}
		else {
			for(int i = 0; i< names.size(); i++) {
				JOptionPane.showMessageDialog(null,"Guest " +i+", "+ names.get(i));
				
			}
		}
		
	}
}
