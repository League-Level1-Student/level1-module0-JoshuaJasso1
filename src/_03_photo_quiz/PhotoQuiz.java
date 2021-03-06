package _03_photo_quiz;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class PhotoQuiz {

	public void run() throws Exception {

		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		String image = ("https://i.pinimg.com/originals/48/af/c0/48afc07443f7d17309de222cf577f0d7.jpg");

		// 1. find an image on the internet, and put its URL in a String
		// variable (from your browser, right click on the image, and select
		// “Copy Image Address”)

		// 2. create a variable of type "Component" that will hold your image
		Component josh;
		// 3. use the "createImage()" method below to initialize your Component
		josh = createImage(image);
		// 4. add the image to the quiz window
		frame.add(createImage(image));
		// 5. call the pack() method on the quiz window
		frame.pack();
		// 6. ask a question that relates to the image
		String answer = JOptionPane.showInputDialog("What number is the image?(answer in number form)");
		// 7. print "CORRECT" if the user gave the right answer
		int answers = Integer.parseInt(answer);
		if (answers == 6) {
			JOptionPane.showMessageDialog(null, "CORRECT!!!");
		}
		// 8. print "INCORRECT" if the answer is wrong
		else {
			JOptionPane.showMessageDialog(null, "INCORRECT!!!");
		}
		// 9. remove the component from the quiz window
		frame.remove(josh);
	}

	private Component createImage(String imageUrl) throws MalformedURLException {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	
}
