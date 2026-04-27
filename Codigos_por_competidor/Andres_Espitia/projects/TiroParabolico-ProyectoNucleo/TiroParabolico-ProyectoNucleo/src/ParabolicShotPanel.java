/**
 * File containing the ParabolicShotPanel entity definition. 
 */

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JPanel;

/**
 * Class which represents the upper panel of the Parabolic Shot program GUI. On
 * it will be painted the parabolic trajectories of the projectiles thrown. It
 * was created for the eleventh practice of PAI (Programación de Aplicaciones
 * Interactivas) course of ULL (Universidad de la Laguna).
 * 
 * @author Daute Rodríguez Rodríguez (alu0100973914@ull.edu.es)
 * @version 1.0
 * @since 27 abr. 2018
 */
public class ParabolicShotPanel extends JPanel {

	/** Default serial version ID. */
	private static final long						serialVersionUID	= 1L;
	/** Represents the shot Angle. */
	private int													shotAngle;
	/** Represents the furthest x-axis point reached. */
	private int													furthestXAxisPointReached;
	/** Represents the height of the initial shot point. */
	private int													initialHeight;
	/** Declared for graphic purposes. */
	private final int										X_PADDING;
	/** Declared for graphic purposes. */
	private final int										Y_PADDING;
	/** Declared for graphic purposes. */
	private int													MAXIMUM_HEIGHT;
	/** Establishes if the GUI has to show the projectiles trajectories. */
	private boolean											showTrajectories;
	/** Projectiles to draw. */
	private ArrayList<ArrayList<Point>>	projectiles;
	/** Colors of the projectiles. */
	private ArrayList<Color>						projectileColors;
	/** Scale of the x axis. */
	private double											xAxisScale;
	/** Scale of the x axis. */
	private double											yAxisScale;

	/**
	 * Default constructor.
	 * 
	 * @param width
	 *          Width of the GUI.
	 * @param height
	 *          Height of the GUI.
	 * @param initialAngle
	 *          Initial shot Angle.
	 * @param initialHeight
	 *          Initial shot height.
	 */
	public ParabolicShotPanel(int width, int height, int initialAngle,
			int initialHeight, int maxHeight) {
		setName("Parabolic shot panel");
		setSize(new Dimension(width, height));

		// Default values:
		final int INITIAL_XFURTHEST_POINT = 500;
		setShotAngle(initialAngle);
		setInitialHeight(initialHeight);
		setFurthestXAxisPointReached(INITIAL_XFURTHEST_POINT);
		setInitialHeight(0);
		X_PADDING = (int) (getWidth() * 0.03);
		Y_PADDING = (int) (getHeight() * 0.05);
		MAXIMUM_HEIGHT = maxHeight;

		showTrajectories = true;

		projectiles = new ArrayList<>();
		projectileColors = new ArrayList<>();
	}

	/**
	 * Paints the panel in the graphics object given as a parameter.
	 * 
	 * @param g
	 *          Graphic object where the panel will be painted.
	 */
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		drawAxis(g);

		int diameter = 4;
		int radius = diameter / 2;
		double yOffset = (double) initialHeight / MAXIMUM_HEIGHT;
		if (!showTrajectories) {
			diameter = 8;
			radius = diameter / 2;
		}
		int i = 0;
		for (ArrayList<Point> projectile : projectiles) {
			g.setColor(projectileColors.get(i));
			if (showTrajectories) {
				for (Point point : projectile) {
					int xPosition = (int) (point.x * xAxisScale);
					xPosition = xPosition + X_PADDING;
					int yPosition = (int) (point.y * yAxisScale);
					yPosition = this.getHeight() - Y_PADDING - yPosition;
					g.fillOval(xPosition - radius, (int) (yPosition - radius - yOffset),
							diameter, diameter);
				}
			} else {
				if (projectile.size() > 1) {
					int xPosition = (int) (projectile.get(projectile.size() - 1).x
							* xAxisScale);
					xPosition = xPosition + X_PADDING;
					int yPosition = (int) (projectile.get(projectile.size() - 1).y
							* yAxisScale);
					yPosition = this.getHeight() - Y_PADDING - yPosition;
					g.fillOval(xPosition - radius, (int) (yPosition - radius - yOffset),
							diameter, diameter);
				}
			}
			++i;
		}

		// .add(new Point((int) (newPoint.x * xAxisScale) + X_PADDING,
		// this.getHeight() - Y_PADDING - (int) (newPoint.y * yAxisScale)));
	}

	/**
	 * Paints the axis.
	 * 
	 * @param g
	 *          Graphic object where the axis will be painted.
	 */
	private void drawAxis(Graphics g) {

		//////// DRAWING THE AXIS

		final int X_AXIS_LENGTH = this.getWidth() - X_PADDING - X_PADDING;
		final int Y_AXIS_LENGTH = this.getHeight() - Y_PADDING - Y_PADDING;

		final int MAJOR_SEPARATORS_LENGTH = 12;
		final int MINOR_SEPARATORS_LENGTH = 6;
		final int MINOR_MAJOR_PROPORTION = 4;

		// Y AXIS
		final int Y_AXIS_MINOR_SPACING = 25;
		final int Y_AXIS_MINOR_INTERVALS = MAXIMUM_HEIGHT / Y_AXIS_MINOR_SPACING;
		final int Y_AXIS_MINOR_PIXELS_SPACING = Y_AXIS_LENGTH
				/ Y_AXIS_MINOR_INTERVALS;

		int i = 0;
		while (i < Y_AXIS_MINOR_INTERVALS + 1) {

			if (i % MINOR_MAJOR_PROPORTION == 0) {
				g.drawString("" + Y_AXIS_MINOR_SPACING * i,
						X_PADDING - MAJOR_SEPARATORS_LENGTH - MAJOR_SEPARATORS_LENGTH,
						this.getHeight() - Y_PADDING - (i * Y_AXIS_MINOR_PIXELS_SPACING)
								- MINOR_SEPARATORS_LENGTH);
				g.drawLine(X_PADDING - MAJOR_SEPARATORS_LENGTH,
						this.getHeight() - Y_PADDING - (i * Y_AXIS_MINOR_PIXELS_SPACING),
						X_PADDING,
						this.getHeight() - Y_PADDING - (i * Y_AXIS_MINOR_PIXELS_SPACING));
			} else {
				g.drawLine(X_PADDING - MINOR_SEPARATORS_LENGTH,
						this.getHeight() - Y_PADDING - (i * Y_AXIS_MINOR_PIXELS_SPACING),
						X_PADDING,
						this.getHeight() - Y_PADDING - (i * Y_AXIS_MINOR_PIXELS_SPACING));
			}
			i++;
		}

		g.drawLine(X_PADDING,
				this.getHeight() - Y_PADDING
						- (Y_AXIS_MINOR_INTERVALS * Y_AXIS_MINOR_PIXELS_SPACING),
				X_PADDING, this.getHeight() - Y_PADDING);

		// X AXIS
		final int X_AXIS_MINOR_SPACING = 25;
		final int X_AXIS_MINOR_INTERVALS = this.getFurthestXAxisPointReached()
				/ X_AXIS_MINOR_SPACING;
		final int X_AXIS_MINOR_PIXELS_SPACING = X_AXIS_LENGTH
				/ X_AXIS_MINOR_INTERVALS;

		i = 0;
		while (i < X_AXIS_MINOR_INTERVALS + 1) {
			if (i % MINOR_MAJOR_PROPORTION == 0) {
				g.drawString("" + X_AXIS_MINOR_SPACING * i,
						X_PADDING + MINOR_SEPARATORS_LENGTH
								+ (i * X_AXIS_MINOR_PIXELS_SPACING),
						this.getHeight() - Y_PADDING + MAJOR_SEPARATORS_LENGTH
								+ MINOR_SEPARATORS_LENGTH);
				g.drawLine(X_PADDING + (i * X_AXIS_MINOR_PIXELS_SPACING),
						this.getHeight() - Y_PADDING,
						X_PADDING + (i * X_AXIS_MINOR_PIXELS_SPACING),
						this.getHeight() - Y_PADDING + MAJOR_SEPARATORS_LENGTH);
			} else {
				g.drawLine(X_PADDING + (i * X_AXIS_MINOR_PIXELS_SPACING),
						this.getHeight() - Y_PADDING,
						X_PADDING + (i * X_AXIS_MINOR_PIXELS_SPACING),
						this.getHeight() - Y_PADDING + MINOR_SEPARATORS_LENGTH);
			}
			i++;
		}

		g.drawLine(X_PADDING, this.getHeight() - Y_PADDING,
				X_PADDING
						+ (int) (X_AXIS_MINOR_INTERVALS * X_AXIS_MINOR_PIXELS_SPACING),
				this.getHeight() - Y_PADDING);

		// Arrow
		final int ARROW_HYPOTENUSE = 20;
		final int OPPOSITE = (int) (Math.sin(Math.toRadians(shotAngle))
				* ARROW_HYPOTENUSE);
		final int ADJACENT = (int) (Math.cos(Math.toRadians(shotAngle))
				* ARROW_HYPOTENUSE);
		double offset = (double) initialHeight / MAXIMUM_HEIGHT;
		offset *= (Y_AXIS_MINOR_INTERVALS * Y_AXIS_MINOR_PIXELS_SPACING);
		g.drawLine(X_PADDING, (int) (getHeight() - Y_PADDING - offset),
				X_PADDING + ADJACENT,
				(int) (getHeight() - Y_PADDING - OPPOSITE - offset));

		xAxisScale = (double) X_AXIS_LENGTH
				/ (double) getFurthestXAxisPointReached();
		yAxisScale = (double) Y_AXIS_LENGTH / (double) MAXIMUM_HEIGHT;

	}

	/**
	 * Adds a projectile.
	 */
	public void addProjectile() {
		projectiles.add(new ArrayList<Point>());
		final int BOUND = 255;
		Random randomNumberGenerator = new Random();
		projectileColors.add(new Color(randomNumberGenerator.nextInt(BOUND),
				randomNumberGenerator.nextInt(BOUND),
				randomNumberGenerator.nextInt(BOUND)));
		repaint();
	}

	/**
	 * Adds a point to the last projectile trajectory.
	 * 
	 * @param newPoint
	 *          Point to add.
	 */
	public void addPoint(Point newPoint) {
		projectiles.get(projectiles.size() - 1).add(newPoint);
		if (newPoint.x > getFurthestXAxisPointReached()) {
			setFurthestXAxisPointReached(newPoint.x);
		}
		if (newPoint.y > MAXIMUM_HEIGHT) {
			MAXIMUM_HEIGHT = newPoint.y;
		}
		repaint();
	}

	/**
	 * Getter method for shotAngle attribute.
	 * 
	 * @return shotAngle
	 */
	public int getShotAngle() {
		return shotAngle;
	}

	/**
	 * Setter method for shotAngle attribute.
	 * 
	 * @param shotAngle
	 */
	public void setShotAngle(int shotAngle) {
		repaint();
		this.shotAngle = shotAngle;
	}

	/**
	 * Getter method for furthestXAxisPointReached attribute.
	 * 
	 * @return furthestXAxisPointReached
	 */
	public int getFurthestXAxisPointReached() {
		return furthestXAxisPointReached;
	}

	/**
	 * Setter method for furthestXAxisPointReached attribute.
	 * 
	 * @param furthestXAxisPointReached
	 */
	public void setFurthestXAxisPointReached(int furthestXAxisPointReached) {
		this.furthestXAxisPointReached = furthestXAxisPointReached;
	}

	/**
	 * Getter method for initialHeight attribute.
	 * 
	 * @return initialHeight
	 */
	public int getInitialHeight() {
		return initialHeight;
	}

	/**
	 * Setter method for initialHeight attribute.
	 * 
	 * @param initialHeight
	 */
	public void setInitialHeight(int initialHeight) {
		this.initialHeight = initialHeight;
		repaint();
	}

	/**
	 * Getter method for projectiles attribute.
	 * 
	 * @return projectiles
	 */
	public ArrayList<ArrayList<Point>> getProjectiles() {
		return projectiles;
	}

	/**
	 * Getter method for projectileColors attribute.
	 * 
	 * @return projectileColors
	 */
	public ArrayList<Color> getProjectileColors() {
		return projectileColors;
	}

	/**
	 * Changes the visibility of the trajectories.
	 */
	public void changeShowTrajectories() {
		showTrajectories = !showTrajectories;
		repaint();
	}

}
