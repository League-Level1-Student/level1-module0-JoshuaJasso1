package _01_houses;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffectsMachine implements ActionListener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SoundEffectsMachine().showButton();

	}

	public void showButton() {
		System.out.println("Button clicked");
		JFrame frame = new JFrame();
		JButton button1 = new JButton("1");
		JButton button2 = new JButton("2");
		frame.add(button1);
		frame.add(button2);
		button1.addActionListener(this);
		button2.addActionListener(this);
		JPanel jpanel = new JPanel();
		jpanel.add(button1);
		jpanel.add(button2);
		frame.add(jpanel);
		frame.setVisible(true);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
