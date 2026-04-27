package co.edu.unbosque.view;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class BackButton extends JButton {
	public BackButton() {
		setBounds(142, 575, 50, 50);
		try {
			BufferedImage bi = ImageIO.read(new File("src/imgs/presets/but_back.png"));
			Image pokemon1_resized = bi.getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH);
			setIcon(new ImageIcon(pokemon1_resized));
		} catch (Exception e) {
			e.printStackTrace();
		}
		setVisible(true);
		setContentAreaFilled(false);
	}
}
