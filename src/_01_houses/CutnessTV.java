package _01_houses;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutnessTV implements ActionListener {
	JButton button1;
	JButton button2;
	JButton button3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CutnessTV().showButton();
	}

	public void showButton() {
		System.out.println("Button clicked");
		JFrame frame = new JFrame();
		button1 = new JButton("1");
		button2 = new JButton("2");
		button3 = new JButton("3");
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		JPanel jpanel = new JPanel();
		jpanel.add(button1);
		jpanel.add(button2);
		jpanel.add(button3);
		frame.add(jpanel);
		frame.setVisible(true);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button1) {
			showDucks();
		} else if (e.getSource() == button2) {
			showFrog();
		} else if (e.getSource() == button3) {
			showFluffyUnicorns();
		}
	}

	void showDucks() {
		playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
		playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
		playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
		try {
			URI uri = new URI(videoID);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
