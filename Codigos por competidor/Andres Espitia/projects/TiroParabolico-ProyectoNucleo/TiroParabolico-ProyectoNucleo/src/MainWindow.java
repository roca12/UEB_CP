/**
 * File containing the MainWindow entity definition. 
 */

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.Timer;
import javax.swing.WindowConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * Class which represents the main window of the Parabolic Shot program GUI. It
 * was created for the eleventh practice of PAI (Programación de Aplicaciones
 * Interactivas) course of ULL (Universidad de la Laguna).
 * 
 * @author Daute Rodríguez Rodríguez (alu0100973914@ull.edu.es)
 * @version 1.0
 * @since 27 abr. 2018
 */
public class MainWindow extends JFrame
		implements ActionListener, ChangeListener {

	/**
	 * Auxiliary class created to act as the timer action listener. It was created
	 * for the twelfth practice of PAI (Programación de Aplicaciones Interactivas)
	 * course of ULL (Universidad de la Laguna).
	 * 
	 * @author Daute Rodríguez Rodríguez (alu0100973914@ull.edu.es)
	 * @version 1.0
	 * @since 28 abr. 2018
	 */
	class TimerListener implements ActionListener {
		/**
		 * Handles the events thrown by the timer.
		 * 
		 * @param e
		 *          Event thrown by the timer.
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			calculateNextTrajectoryPoint();
		}
	}

	/** Default serial version ID. */
	private static final long		serialVersionUID				= 1L;
	/** Parabolic shot panel of the GUI. */
	private ParabolicShotPanel	parabolicShotPanel;
	/** Control panel of the GUI. */
	private ControlPanel				controlPanel;
	/** Information panel of the GUI. */
	private InformationPanel		informationPanel;
	/** Initial angle of the shot. */
	private int									initialAngle;
	/** Initial velocity of the shot. */
	private int									initialVelocity;
	/** Initial height of the shot. */
	private int									initialHeight;
	/** Maximum angle. */
	final int										MAX_ANGLE								= 90;
	/** Minimum angle. */
	final int										MIN_ANGLE								= 0;
	/** Initial angle. */
	final int										INITIAL_ANGLE						= 45;
	/** Maximum height. */
	int										MAX_HEIGHT							= 400;
	/** Minimum height. */
	final int										INITIAL_HEIGHT					= 0;
	/** Initial height. */
	final int										MIN_HEIGHT							= 0;
	/** Maximum velocity. */
	final int										MAX_VELOCITY						= 100;
	/** Minimum velocity. */
	final int										MIN_VELOCITY						= 1;
	/** Initial velocity. */
	final int										INITIAL_VELOCITY				= 50;
	/** Simulation timer. */
	Timer												simulationTimer;
	/** Current instant. */
	double											currentInstant;
	/** Instants time difference in seconds. */
	final double								instantsTimeDifference	= 0.1;
	/** Gravity acceleration. m / s^2 */
	final double								gravityAcceleration			= 9.8196;
	/** Higher point reached. */
	int													maximumHeightReached;
	/** Establishes if the current trajectory has finished. */
	boolean											trajectoryFinished;

	/**
	 * Default constructor.
	 * 
	 * @param width
	 *          Width of the GUI.
	 * @param height
	 *          Height of the GUI.
	 * @param appletMode
	 *          Establishes the execution mode.
	 */
	public MainWindow(int width, int height, boolean appletMode) {
		setName("Main window");
		setTitle("Parabolic shot!");
		setSize(new Dimension(width, height));
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setLayout(new BorderLayout());

		initialAngle = INITIAL_ANGLE;
		initialHeight = INITIAL_HEIGHT;
		initialVelocity = INITIAL_VELOCITY;
		final int TIMER_DELAY = 20;
		simulationTimer = new Timer(TIMER_DELAY, new TimerListener());

		final int PARABOLIC_SHOT_PANEL_HEIGHT = (int) (height * 0.8);
		final int CONTROL_PANEL_WIDTH = (int) (width * 0.80);

		parabolicShotPanel = new ParabolicShotPanel(width,
				PARABOLIC_SHOT_PANEL_HEIGHT, initialAngle, initialHeight, MAX_HEIGHT);
		controlPanel = new ControlPanel(CONTROL_PANEL_WIDTH,
				height - PARABOLIC_SHOT_PANEL_HEIGHT, this, this, MIN_ANGLE,
				initialAngle, MAX_ANGLE, MIN_HEIGHT, initialHeight, MAX_HEIGHT,
				MIN_VELOCITY, initialVelocity, MAX_VELOCITY);
		informationPanel = new InformationPanel(width - CONTROL_PANEL_WIDTH,
				height - PARABOLIC_SHOT_PANEL_HEIGHT);

		JPanel lowerPanel = new JPanel();
		lowerPanel.setLayout(new BorderLayout());

		lowerPanel.add(controlPanel, BorderLayout.WEST);
		lowerPanel.add(informationPanel, BorderLayout.EAST);

		this.add(parabolicShotPanel, BorderLayout.CENTER);
		this.add(lowerPanel, BorderLayout.SOUTH);

		if (!appletMode) {
			this.setLocationRelativeTo(null);
			this.setVisible(true);
		}
	}

	/**
	 * Getter method for parabolicShotPanel attribute.
	 * @return parabolicShotPanel
	 */
	public ParabolicShotPanel getParabolicShotPanel() {
		return parabolicShotPanel;
	}

	/**
	 * Getter method for controlPanel attribute.
	 * @return controlPanel
	 */
	public ControlPanel getControlPanel() {
		return controlPanel;
	}

	/**
	 * Getter method for informationPanel attribute.
	 * @return informationPanel
	 */
	public InformationPanel getInformationPanel() {
		return informationPanel;
	}

	/**
	 * Calculates the next point of the trajectory of the projectile.
	 */
	private void calculateNextTrajectoryPoint() {
		double xVelocity = initialVelocity * Math.cos(Math.toRadians(initialAngle));
		double yVelocity = initialVelocity * Math.sin(Math.toRadians(initialAngle))
				- gravityAcceleration * currentInstant;
		double velocity = Math
				.sqrt(Math.pow(xVelocity, 2) + Math.pow(yVelocity, 2));
		final double CONSTANT = 0.5;
		int xPosition = (int) (xVelocity * currentInstant);
		int yPosition = (int) (initialHeight
				+ (initialVelocity
						* Math.sin(Math.toRadians(initialAngle)) * currentInstant)
				- (CONSTANT * gravityAcceleration * Math.pow(currentInstant, 2)));

		if (maximumHeightReached < yPosition) {
			maximumHeightReached = yPosition;
		}
		if (maximumHeightReached > MAX_HEIGHT) {
			MAX_HEIGHT = maximumHeightReached;
			controlPanel.getHeightSlider().setMaximum(MAX_HEIGHT);
		}

		informationPanel
				.setTime(new DecimalFormat("#.##").format(currentInstant) + "");
		informationPanel.setXPosition(xPosition + "");
		informationPanel.setYPosition(yPosition + "");
		informationPanel
				.setXVelocity(new DecimalFormat("#.##").format(xVelocity) + "");
		informationPanel
				.setYVelocity(new DecimalFormat("#.##").format(yVelocity) + "");
		informationPanel
				.setVelocity(new DecimalFormat("#.##").format(velocity) + "");
		informationPanel.setMaxHeight(maximumHeightReached + "");

		if (yPosition <= 0 && currentInstant > 0.0) {
			trajectoryFinished = true;
			controlPanel.stoppedState();
			stopSimulation();
		}
		
		currentInstant += instantsTimeDifference;

		parabolicShotPanel.addPoint(new Point(xPosition, yPosition));
	}

	/**
	 * Shoots a new projectile.
	 */
	private void newProjectile() {
		parabolicShotPanel.addProjectile();
		initialAngle = controlPanel.getAngleSlider().getValue();
		initialVelocity = controlPanel.getVelocitySlider().getValue();
		initialHeight = controlPanel.getHeightSlider().getValue();
		currentInstant = 0.0;
		trajectoryFinished = false;
		maximumHeightReached = initialHeight;
	}

	/**
	 * Starts the simulation.
	 */
	private void startSimulation() {
		newProjectile();
		simulationTimer.start();
	}

	/**
	 * Stops the simulation.
	 */
	private void stopSimulation() {
		simulationTimer.stop();
	}

	/**
	 * Restarts the simulation.
	 */
	private void restartSimulation() {
		if (!trajectoryFinished) {
			simulationTimer.start();
		}
	}

	/**
	 * Handles the events thrown by the control panel sliders.
	 * 
	 * @param event
	 *          Events thrown.
	 */
	@Override
	public void stateChanged(ChangeEvent event) {
		if (event.getSource().equals(controlPanel.getAngleSlider())) {
			JSlider source = (JSlider) event.getSource();
			initialAngle = source.getValue();
			parabolicShotPanel.setShotAngle(initialAngle);
			controlPanel.getAngleTextField().setText("" + initialAngle);
		} else if (event.getSource().equals(controlPanel.getHeightSlider())) {
			JSlider source = (JSlider) event.getSource();
			initialHeight = source.getValue();
			parabolicShotPanel.setInitialHeight(initialHeight);
			controlPanel.getHeightTextField().setText("" + initialHeight);
		} else if (event.getSource().equals(controlPanel.getVelocitySlider())) {
			JSlider source = (JSlider) event.getSource();
			initialVelocity = source.getValue();
			controlPanel.getVelocityTextField().setText("" + initialVelocity);
		}
	}

	/**
	 * Handles the events thrown by the control panel buttons.
	 * 
	 * @param event
	 *          Events thrown.
	 */
	@Override
	public void actionPerformed(ActionEvent event) {
		if (event.getActionCommand().equals("Shoot")) {
			controlPanel.runningState();
			startSimulation();
		}

		if (event.getActionCommand().equals("Stop")) {
			controlPanel.stoppedState();
			stopSimulation();
		}

		if (event.getActionCommand().equals("Continue")) {
			controlPanel.runningState();
			restartSimulation();
		}

		if (event.getActionCommand().equals("Clear")) {
			stopSimulation();
			parabolicShotPanel.getProjectileColors().clear();
			parabolicShotPanel.getProjectiles().clear();
			parabolicShotPanel.repaint();
		}

		if (event.getActionCommand().equals("Show trajectories")) {
			parabolicShotPanel.changeShowTrajectories();
		}

		try {
			if (event.getActionCommand().equals("Set velocity")) {
				int valueToEvaluate = Integer
						.parseInt(controlPanel.getVelocityTextField().getText());
				if (valueToEvaluate <= MAX_VELOCITY
						&& valueToEvaluate >= MIN_VELOCITY) {
					initialVelocity = valueToEvaluate;
					controlPanel.getVelocitySlider().setValue(initialVelocity);
				}
			}

			if (event.getActionCommand().equals("Set angle")) {
				int valueToEvaluate = Integer
						.parseInt(controlPanel.getAngleTextField().getText());
				if (valueToEvaluate <= MAX_ANGLE && valueToEvaluate >= MIN_ANGLE) {
					initialAngle = valueToEvaluate;
					controlPanel.getAngleSlider().setValue(initialAngle);
					parabolicShotPanel.setShotAngle(initialAngle);
				}
			}

			if (event.getActionCommand().equals("Set height")) {
				int valueToEvaluate = Integer
						.parseInt(controlPanel.getHeightTextField().getText());
				if (valueToEvaluate <= MAX_HEIGHT && valueToEvaluate >= MIN_HEIGHT) {
					initialHeight = valueToEvaluate;
					controlPanel.getHeightSlider().setValue(initialHeight);
					parabolicShotPanel.setInitialHeight(initialHeight);
				}
			}

		} catch (NumberFormatException e) {
		}

	}

}
