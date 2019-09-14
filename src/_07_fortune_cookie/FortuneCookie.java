package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void showButton() {
		System.out.println("Button clicked");
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton button = new JButton();
		frame.add(button);
		frame.pack();
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Woohoo");
		int rand = new Random().nextInt(5);
		if (rand == 0) {
			JOptionPane.showMessageDialog(null, "You are going to have a great day!!!");
		} else if (rand == 1) {
			JOptionPane.showMessageDialog(null, "You are going to hava some good luck today.");
		} else if (rand == 2) {
			JOptionPane.showMessageDialog(null, "You will run into success very soon.");
		} else if (rand == 3) {
			JOptionPane.showMessageDialog(null, "You will win the lottery very soon.");
		} else if (rand == 4) {
			JOptionPane.showMessageDialog(null, "A beautiful, smart, and loving person will be coming into your life.");
		}
	}
}
