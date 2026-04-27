/**
 * File containing the ControlPanel entity definition. 
 */

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeListener;

/**
 * Class which represents the panel where the control buttons will be located in
 * the Parabolic Shot program GUI. It was created for the twelfth practice of
 * PAI (Programación de Aplicaciones Interactivas) course of ULL (Universidad de
 * la Laguna).
 * 
 * @author Daute Rodríguez Rodríguez (alu0100973914@ull.edu.es)
 * @version 1.0
 * @since 27 abr. 2018
 */
public class ControlPanel extends JPanel {
	/** Default serial version ID. */
	private static final long	serialVersionUID	= 1L;
	/** Shoot button of the control panel. */
	private JButton						shootButton;
	/** Stop button of the control panel. */
	private JButton						stopButton;
	/** Clear button of the control panel. */
	private JButton						clearButton;
	/** Velocity label of the control panel. */
	private JLabel						velocityLabel;
	/** Velocity text field of the control panel. */
	private JTextField				velocityTextField;
	/** Set velocity button. */
	JButton setVelocityButton;
	/** Velocity slider of the control panel. */
	private JSlider						velocitySlider;
	/** Angle label of the control panel. */
	private JLabel						angleLabel;
	/** Angle text field of the control panel. */
	private JTextField				angleTextField;
	/** Set angle button. */
	JButton setAngleButton;
	/** Angle slider of the control panel. */
	private JSlider						angleSlider;
	/** Height label of the control panel. */
	private JLabel						heightLabel;
	/** Height text field of the control panel. */
	private JTextField				heightTextField;
	/** Set height button. */
	JButton setHeightButton;
	/** Height slider the control panel. */
	private JSlider						heightSlider;
	/** Trajectories check box of the control panel. */
	private JCheckBox					trajectoriesCheckbox;

	/**
	 * Default constructor.
	 * 
	 * @param width
	 *          Width of the panel.
	 * @param height
	 *          Height of the panel.
	 * @param buttonsListener
	 *          Listener for the control buttons.
	 * @param slidersListener
	 *          Listener for the control buttons.
	 */
	public ControlPanel(int width, int height, ActionListener buttonsListener,
			ChangeListener slidersListener, final int MIN_ANGLE, final int ANGLE,
			final int MAX_ANGLE, final int MIN_HEIGHT, final int HEIGHT,
			final int MAX_HEIGHT, final int MIN_VELOCITY, final int VELOCITY,
			final int MAX_VELOCITY) {
		setName("Control panel");
		setPreferredSize(new Dimension(width, height));

		final int INNER_PANEL_HEIGHT = height / 3;

		setBorder(BorderFactory.createMatteBorder(1, 0, 0, 0, Color.BLACK));

		JPanel upperInnerPanel = new JPanel();
		upperInnerPanel.setPreferredSize(new Dimension(width, INNER_PANEL_HEIGHT));
		upperInnerPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		JPanel middleInnerPanel = new JPanel();
		middleInnerPanel.setPreferredSize(new Dimension(width, INNER_PANEL_HEIGHT));
		middleInnerPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		JPanel lowerInnerPanel = new JPanel();
		lowerInnerPanel.setPreferredSize(new Dimension(width, INNER_PANEL_HEIGHT));
		lowerInnerPanel.setLayout(new FlowLayout(FlowLayout.LEFT));

		final int COLUMNS = 4;

		shootButton = new JButton("Shoot");
		shootButton.setName("Shoot");
		shootButton.addActionListener(buttonsListener);

		velocityLabel = new JLabel("Initial velocity (m/s)");

		velocityTextField = new JTextField(COLUMNS);
		velocityTextField.setText(VELOCITY + "");
		velocityTextField.setName("Velocity text field");
		
		setVelocityButton = new JButton("Set");
		setVelocityButton.setActionCommand("Set velocity");
		setVelocityButton.setName("Set velocity");
		setVelocityButton.addActionListener(buttonsListener);

		velocitySlider = new JSlider();
		velocitySlider = new JSlider(MIN_VELOCITY, MAX_VELOCITY, VELOCITY);
		velocitySlider.setPaintTicks(true);
		velocitySlider.setPaintLabels(true);
		velocitySlider.addChangeListener(slidersListener);
		velocitySlider.setName("Velocity slider");

		stopButton = new JButton("Stop");
		stopButton.setName("Stop");
		stopButton.addActionListener(buttonsListener);
		stopButton.setEnabled(false);

		angleLabel = new JLabel("Initial angle (degrees)");

		angleTextField = new JTextField(COLUMNS);
		angleTextField.setText(ANGLE + "");
		angleTextField.setName("Angle text field");
		
		setAngleButton = new JButton("Set");
		setAngleButton.setActionCommand("Set angle");
		setAngleButton.setName("Set angle");
		setAngleButton.addActionListener(buttonsListener);

		angleSlider = new JSlider();
		angleSlider = new JSlider(MIN_ANGLE, MAX_ANGLE, ANGLE);
		angleSlider.setPaintTicks(true);
		angleSlider.setPaintLabels(true);
		angleSlider.addChangeListener(slidersListener);
		angleSlider.setName("Angle slider");

		clearButton = new JButton("Clear");
		clearButton.setName("Clear");
		clearButton.addActionListener(buttonsListener);

		heightLabel = new JLabel("Initial height (m)");

		heightTextField = new JTextField(COLUMNS);
		heightTextField.setText(HEIGHT + "");
		heightTextField.setName("Height text field");
		
		setHeightButton = new JButton("Set");
		
		setHeightButton.setActionCommand("Set height");
		setHeightButton.setName("Set height");
		setHeightButton.addActionListener(buttonsListener);

		heightSlider = new JSlider();
		heightSlider = new JSlider(MIN_HEIGHT, MAX_HEIGHT, HEIGHT);
		heightSlider.setPaintTicks(true);
		heightSlider.setPaintLabels(true);
		heightSlider.addChangeListener(slidersListener);
		heightSlider.setName("Height slider");

		trajectoriesCheckbox = new JCheckBox("Show trajectories");
		trajectoriesCheckbox.setName("Show trajectories checkbox");
		trajectoriesCheckbox.addActionListener(buttonsListener);
		trajectoriesCheckbox.setSelected(true);

		upperInnerPanel.add(shootButton);
		upperInnerPanel.add(velocityLabel);
		upperInnerPanel.add(velocityTextField);
		upperInnerPanel.add(setVelocityButton);
		upperInnerPanel.add(velocitySlider);

		middleInnerPanel.add(stopButton);
		middleInnerPanel.add(angleLabel);
		middleInnerPanel.add(angleTextField);
		middleInnerPanel.add(setAngleButton);
		middleInnerPanel.add(angleSlider);

		lowerInnerPanel.add(clearButton);
		lowerInnerPanel.add(heightLabel);
		lowerInnerPanel.add(heightTextField);
		lowerInnerPanel.add(setHeightButton);
		lowerInnerPanel.add(heightSlider);
		lowerInnerPanel.add(trajectoriesCheckbox);

		add(upperInnerPanel);
		add(middleInnerPanel);
		add(lowerInnerPanel);
	}
	
	/**
	 * Stopped state.
	 */
	public void stoppedState() {
		stopButton.setText("Continue");
		stopButton.setActionCommand("Continue");
		shootButton.setEnabled(true);;
		velocityTextField.setEnabled(true);
		setVelocityButton.setEnabled(true);
		velocitySlider.setEnabled(true);
		angleTextField.setEnabled(true);
		setAngleButton.setEnabled(true);
		angleSlider.setEnabled(true);
		heightTextField.setEnabled(true);
		setHeightButton.setEnabled(true);
		heightSlider.setEnabled(true);
	}
	
	/**
	 * Running state.
	 */
	public void runningState() {
		stopButton.setEnabled(true);
		stopButton.setText("Stop");
		stopButton.setActionCommand("Stop");
		shootButton.setEnabled(false);;
		velocityTextField.setEnabled(false);
		setVelocityButton.setEnabled(false);
		velocitySlider.setEnabled(false);
		angleTextField.setEnabled(false);
		setAngleButton.setEnabled(false);
		angleSlider.setEnabled(false);
		heightTextField.setEnabled(false);
		setHeightButton.setEnabled(false);
		heightSlider.setEnabled(false);
	}

	/**
	 * Getter method for heightSlider attribute.
	 * 
	 * @return heightSlider
	 */
	public JSlider getHeightSlider() {
		return heightSlider;
	}

	/**
	 * Setter method for heightSlider attribute.
	 * 
	 * @param heightSlider
	 */
	public void setHeightSlider(JSlider heightSlider) {
		this.heightSlider = heightSlider;
	}

	/**
	 * Getter method for velocityTextField attribute.
	 * 
	 * @return velocityTextField
	 */
	public JTextField getVelocityTextField() {
		return velocityTextField;
	}

	/**
	 * Getter method for velocitySlider attribute.
	 * 
	 * @return velocitySlider
	 */
	public JSlider getVelocitySlider() {
		return velocitySlider;
	}

	/**
	 * Getter method for angleTextField attribute.
	 * 
	 * @return angleTextField
	 */
	public JTextField getAngleTextField() {
		return angleTextField;
	}

	/**
	 * Getter method for angleSlider attribute.
	 * 
	 * @return angleSlider
	 */
	public JSlider getAngleSlider() {
		return angleSlider;
	}

	/**
	 * Getter method for heightTextField attribute.
	 * 
	 * @return heightTextField
	 */
	public JTextField getHeightTextField() {
		return heightTextField;
	}
}
