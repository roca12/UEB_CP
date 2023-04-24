/**
 * File containing the InformationPanel entity definition. 
 */

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Class which represents the panel where the information about the projectiles
 * thrown will be represented in the Parabolic Shot program GUI. It was created
 * for the twelfth practice of PAI (Programación de Aplicaciones Interactivas)
 * course of ULL (Universidad de la Laguna).
 * 
 * @author Daute Rodríguez Rodríguez (alu0100973914@ull.edu.es)
 * @version 1.0
 * @since 27 abr. 2018
 */
public class InformationPanel extends JPanel {
	/** Default serial version ID. */
	private static final long	serialVersionUID	= 1L;
	/** Time label of the information panel. */
	private JLabel						timeLabel;
	/** X position label of the information panel. */
	private JLabel						xPositionLabel;
	/** Y position label of the information panel. */
	private JLabel						yPositionLabel;
	/** X velocity label of the information panel. */
	private JLabel						xVelocityLabel;
	/** Y velocity label of the information panel. */
	private JLabel						yVelocityLabel;
	/** Velocity label of the information panel. */
	private JLabel						velocityLabel;
	/** Maximum height label of the information panel. */
	private JLabel						maxHeightLabel;

	/**
	 * Default constructor.
	 * 
	 * @param width
	 *          Width of the panel.
	 * @param height
	 *          Height of the panel.
	 */
	public InformationPanel(int width, int height) {
		setName("Information panel");
		setPreferredSize(new Dimension(width, height));
		setBorder(BorderFactory.createMatteBorder(1, 1, 0, 0, Color.BLACK));
		final int ROWS = 7;
		setLayout(new GridLayout(ROWS, 1));

		timeLabel = new JLabel("   Time = 0.0 s");
		timeLabel.setName("Time");
		xPositionLabel = new JLabel("   x = 0 m");
		xPositionLabel.setName("X position");
		yPositionLabel = new JLabel("   y = 0 m");
		yPositionLabel.setName("Y position");
		xVelocityLabel = new JLabel("   vx = 0 m/s");
		xVelocityLabel.setName("X velocity");
		yVelocityLabel = new JLabel("   vy = 0 m/s");
		yVelocityLabel.setName("Y velocity");
		velocityLabel = new JLabel("   v = 0 m/s");
		velocityLabel.setName("Velocity");
		maxHeightLabel = new JLabel("   Max. height = 0 m");
		maxHeightLabel.setName("Max height");

		add(timeLabel);
		add(xPositionLabel);
		add(yPositionLabel);
		add(xVelocityLabel);
		add(yVelocityLabel);
		add(velocityLabel);
		add(maxHeightLabel);
	}
	
	/**
	 * Sets the time.
	 * @param time
	 */
	public void setTime(String time) {
		timeLabel.setText("   Time = " + time + " s");
	}
	
	/**
	 * Sets the x position.
	 * @param xPosition
	 */
	public void setXPosition(String xPosition) {
		xPositionLabel.setText("   x = " + xPosition + " m");
	}
	
	/**
	 * Sets the y position.
	 * @param yPosition
	 */
	public void setYPosition(String yPosition) {
		yPositionLabel.setText("   y = " + yPosition + " m");
	}
	
	/**
	 * Sets the x velocity.
	 * @param xVelocity
	 */
	public void setXVelocity(String xVelocity) {
		xVelocityLabel.setText("   vx = " + xVelocity + " m/s");
	}
	
	/**
	 * Sets the y velocity.
	 * @param yVelocity
	 */
	public void setYVelocity(String yVelocity) {
		yVelocityLabel.setText("   vy = " + yVelocity + " m/s");
	}
	
	/**
	 * Sets the velocity.
	 * @param velocity
	 */
	public void setVelocity(String velocity) {
		velocityLabel.setText("   v = " + velocity + " m/s");
	}
	
	/**
	 * Sets the max height.
	 * @param maxHeight
	 */
	public void setMaxHeight(String maxHeight) {
		maxHeightLabel.setText("   Max. height = " + maxHeight + " m");
	}

}
