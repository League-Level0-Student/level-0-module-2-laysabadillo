package extra;

import java.net.URI;

import javax.swing.JOptionPane;

public class PiDay {
	public static void main(String[] args) {

		String Pi = "3.14159265";

		for (int i = 0; i < 10; i++) {

			String answer = JOptionPane.showInputDialog("Pi?");
			if (answer.equals(Pi.charAt(i) + "")) {
				JOptionPane.showMessageDialog(null, "Congrats");
				
				System.out.println(Pi.charAt(i));
			}

			else {
				JOptionPane.showMessageDialog(null, "No Pie For You!");
				System.exit(0);

			}
			
		}
		
		playVideo("https://www.youtube.com/watch?v=6TPjRoWm8Ck");
		
	}
	static void playVideo(String videoURL) {
	     try { 
	          URI uri = new URI(videoURL);
	          java.awt.Desktop.getDesktop().browse(uri);
	     } catch (Exception e) {
	          e.printStackTrace();
	       
	     }
	}
}