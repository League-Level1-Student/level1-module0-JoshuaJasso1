package _09_sound_effects_machine;

import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffectsMachine implements ActionListener {
	JButton button1;
	JButton button2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SoundEffectsMachine().showButton();

	}

	public void showButton() {
		System.out.println("Button clicked");
		JFrame frame = new JFrame();
		button1 = new JButton("1");
		button2 = new JButton("2");
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
		if (e.getSource()== button1) {
			playSound("AlienSound.wav");
		}
		else if (e.getSource()== button2) {
			playSound("ServiceBell.wav");
		}
	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

}
