package co.edu.unbosque.model;

public class ShareAccount implements Runnable{
	private BankAccount ba = new BankAccount();
	
	@Override
	public void run() {
		for (int i = 0; i < 15; i++) {
			int mov = 15-i;
			System.out.println("Sr/Sra "+Thread.currentThread().getName()+" le quedan "+mov+" movimientos de la cuenta este mes.");
			int opc = (int) (Math.random() * 2 + 1);
			switch (opc) {
			case 1:
				doWithdraw((int) (Math.random() * 15 + 1));
				break;

			case 2:
				doConsign((int) (Math.random() * 15 + 1));
				break;
				
			}
			if(ba.getBalance() < 0) {
				System.out.println("Cuenta sobregirada. Saldo actual: "+ba.getBalance());
			}
		}
	}
	
	private void doWithdraw(int money) {
		if(ba.getBalance() >= money) {
			System.out.println(Thread.currentThread().getName()+ " Tiene saldo actual de: "+ba.getBalance()+" y va a retirar: "+money);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			ba.withdraw(money);
			System.out.println(" ** "+Thread.currentThread().getName()+" hizo retiro exitoso de: "+money+" ahora su saldo es de: "+ba.getBalance());
		}else {
			System.out.println("No hay saldo para "+Thread.currentThread().getName()+" para retirar "+ba.getBalance());
		}
	}
	
	private void doConsign(int money) {
		System.out.println(Thread.currentThread().getName()+ " Tiene saldo actual de: "+ba.getBalance()+" y va a consignar: "+money);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ba.consign(money);
		System.out.println(" ** "+Thread.currentThread().getName()+" hizo consignacion exitosa de: "+money+" ahora su saldo es de: "+ba.getBalance());
	}

}
