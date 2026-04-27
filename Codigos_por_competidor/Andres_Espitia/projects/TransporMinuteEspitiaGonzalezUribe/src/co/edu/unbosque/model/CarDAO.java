package co.edu.unbosque.model;

public class CarDAO {
	// vans
	private Stack v1;
	private Stack v2;
	private Stack v3;
	private Stack v4;
	// camiones
	private Stack c1;
	private Stack c2;
	private Stack c3;
	private Stack c4;
	//ordenes
	private Queue q;

	public CarDAO() {
		v1 = new Stack("V1");
		v2 = new Stack("V2");
		v3 = new Stack("V3");
		v4 = new Stack("V4");
		c1 = new Stack("C1");
		c2 = new Stack("C2");
		c3 = new Stack("C3");
		c4 = new Stack("C4");
		q = new Queue();
	}
	
	public void addToQueue(CarDTO c, int type) {
		q.offer(c, type);
	}
	
	public void passTo() {
		while(!q.isNull()) {
			try {
				Nodeq aux = q.peek();
				addCar(aux.getCar(), aux.getType());
				q.poll();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void addCar(CarDTO c,  int type) {
		switch (type) {
		case 1:
			if (c.getSector() == 1) {
				c1.push(new Correspondance(c.getClient_id(), c.getDestination(), c.getSector()));
			} else if (c.getSector() == 2) {
				c2.push(new Correspondance(c.getClient_id(), c.getDestination(), c.getSector()));
			} else if (c.getSector() == 3) {
				c3.push(new Correspondance(c.getClient_id(), c.getDestination(), c.getSector()));
			} else {
				c4.push(new Correspondance(c.getClient_id(), c.getDestination(), c.getSector()));
			}
			break;
		case 2:
			if (c.getSector() == 1) {
				v1.push(new Bank(c.getClient_id(), c.getDestination(), c.getSector()));
			} else if (c.getSector() == 2) {
				v2.push(new Bank(c.getClient_id(), c.getDestination(), c.getSector()));
			} else if (c.getSector() == 3) {
				v3.push(new Bank(c.getClient_id(), c.getDestination(), c.getSector()));
			} else {
				v4.push(new Bank(c.getClient_id(), c.getDestination(), c.getSector()));
			}
			break;
		default:
			break;
		}
	}

	/**
	 * @return the v1
	 */
	public Stack getV1() {
		return v1;
	}

	/**
	 * @param v1 the v1 to set
	 */
	public void setV1(Stack v1) {
		v1 = v1;
	}

	/**
	 * @return the v2
	 */
	public Stack getV2() {
		return v2;
	}

	/**
	 * @param v2 the v2 to set
	 */
	public void setV2(Stack v2) {
		v2 = v2;
	}

	/**
	 * @return the v3
	 */
	public Stack getV3() {
		return v3;
	}

	/**
	 * @param v3 the v3 to set
	 */
	public void setV3(Stack v3) {
		v3 = v3;
	}

	/**
	 * @return the v4
	 */
	public Stack getV4() {
		return v4;
	}

	/**
	 * @param v4 the v4 to set
	 */
	public void setV4(Stack v4) {
		v4 = v4;
	}

	/**
	 * @return the c1
	 */
	public Stack getC1() {
		return c1;
	}

	/**
	 * @param c1 the c1 to set
	 */
	public void setC1(Stack c1) {
		c1 = c1;
	}

	/**
	 * @return the c2
	 */
	public Stack getC2() {
		return c2;
	}

	/**
	 * @param c2 the c2 to set
	 */
	public void setC2(Stack c2) {
		c2 = c2;
	}

	/**
	 * @return the c3
	 */
	public Stack getC3() {
		return c3;
	}

	/**
	 * @param c3 the c3 to set
	 */
	public void setC3(Stack c3) {
		c3 = c3;
	}

	/**
	 * @return the c4
	 */
	public Stack getC4() {
		return c4;
	}

	/**
	 * @param c4 the c4 to set
	 */
	public void setC4(Stack c4) {
		c4 = c4;
	}

	/**
	 * @return the q
	 */
	public Queue getQ() {
		return q;
	}

	/**
	 * @param q the q to set
	 */
	public void setQ(Queue q) {
		this.q = q;
	}

}
