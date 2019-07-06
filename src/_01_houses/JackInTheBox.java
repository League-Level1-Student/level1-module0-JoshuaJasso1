package _01_houses;

public class JackInTheBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		private void showPicture(String fileName) {
		    try {
		        JLabel imageLabel = createLabelImage(fileName);
		        JFrame frame = new JFrame();
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        frame.add(imageLabel);
		        frame.setVisible(true);
		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		}
		private JLabel createLabelImage(String fileName) {
			try {
		            URL imageURL = getClass().getResource(fileName);
		            if (imageURL == null) {
			       System.err.println("Could not find image " + fileName);
			       return new JLabel();
		            } else {
		                Icon icon = new ImageIcon(imageURL);
		                JLabel imageLabel = new JLabel(icon);
		                return imageLabel;
		            }
		        } catch (Exception e) {
		            System.err.println("Could not find image " + fileName);
		            return new JLabel();
		        }
		}
	}

}
