package co.edu.unbosque.model;

public class Customer extends Thread {
	private int numcliente;
	private int age;
	private int transaction;
	private int t_value;
	private BankAccount b_account;
	private String text_to_print;
	private static int indx;
	
	public Customer(int num) {
		age = (int) (Math.random() * (80 - 18) + 18);
		transaction = (int) (Math.random() * (2));
		t_value = (int) (Math.random() * (200000 - 50000) + 50000);
		b_account = new BankAccount();
		if (age > 65) {
			setPriority(Thread.MAX_PRIORITY);
		} else if (age > 35) {
			setPriority(5);
		} else {
			setPriority(Thread.MIN_PRIORITY);
		}
		text_to_print = "";
		numcliente = num;
		indx = 0;
	}
	
	@Override
    public void run() {
        while (indx < Bank.getAtms().length) {
            if ((indx) == Bank.getAtms().length-1) {
                indx = 0;
            }
            if (Bank.getAtms()[indx].isOccupied() && !Bank.getAtms()[indx+1].isOccupied()) {
                indx++;
            }
            if (Bank.getAtms()[indx].isOccupied()) {
                try {
                    synchronized (Bank.getAtms()[indx]) {
                        Bank.getAtms()[indx].wait();
                    }
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            if(getTransaction() == 0) {
                System.out.println("Cajero "+(indx+1));
                Bank.getAtms()[indx].addCustomer();
                Bank.getAtms()[indx].setTime(t_value);
                text_to_print = withDraw();
                //System.out.println(withDraw());
                Bank.getAtms()[indx].removeCustomer();
                break;
            }else if(getTransaction() == 1) {
            	System.out.println("Cajero "+(indx+1));
                Bank.getAtms()[indx].addCustomer();
                Bank.getAtms()[indx].setTime(t_value);
                //System.out.println(deposit());
                text_to_print = deposit();
                Bank.getAtms()[indx].removeCustomer();
                break;
            }
        }
    }
	
	private String withDraw() {
		if(b_account.getBalance() - getT_value()<0) {
			return "Cliente: "+numcliente+" - El cliente no posee suficiente dinero($"+b_account.getBalance()+") para realizar el retiro de: $"+getT_value()+"\nSiguiente.";
		}else {
			b_account.setBalance(b_account.getBalance() - getT_value());
			return "Cliente: "+numcliente+" + Retiro exitoso por valor de $"+getT_value()+"!! Quedaste con $"+b_account.getBalance()+"\nSiguiente.";
		}
	}
	
	private String deposit() {
		b_account.setBalance(b_account.getBalance() + getT_value());
		return "Cliente: "+numcliente+" + Consignación por valor de $"+getT_value()+" completada exitosamente!! Quedaste con $"+b_account.getBalance()+"\nSiguiente.";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getTransaction() {
		return transaction;
	}

	public void setTransaction(int transaction) {
		this.transaction = transaction;
	}

	public int getT_value() {
		return t_value;
	}

	public void setT_value(int t_value) {
		this.t_value = t_value;
	}

	public BankAccount getB_account() {
		return b_account;
	}

	public void setB_account(BankAccount b_account) {
		this.b_account = b_account;
	}

	public String getText_to_print() {
		return text_to_print;
	}

	public void setText_to_print(String text_to_print) {
		this.text_to_print = text_to_print;
	}
}
