package coffeeshop;

public class MedrasCoffeeSubBranch2 implements MedrasCoffeeInterface, PaymentMethod{
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MedrasCoffeeSubBranch2 obj=new MedrasCoffeeSubBranch2();
		obj.coffee();
		obj.normalTea();
		obj.eggPuffs();
		obj.biscuits();
		obj.lemonTea();
		obj.blackTea();
		obj.greenTea();
		obj.handCash();
		obj.onlinepayment();

	}

	@Override
	public void coffee() {
		// TODO Auto-generated method stub
		System.out.println("Coffee Rate is 9 Rs");
		
	}

	@Override
	public void normalTea() {
		// TODO Auto-generated method stub
		System.out.println("Normal Tea Rate is 10 Rs");
		
	}

	@Override
	public void eggPuffs() {
		// TODO Auto-generated method stub
		System.out.println("Egg Puffs Rate is 11 Rs");
	}

	@Override
	public void biscuits() {
		// TODO Auto-generated method stub
		System.out.println("Biscuit Packet Rate is 12 Rs");
		
	}

	@Override
	public void lemonTea() {
		// TODO Auto-generated method stub
		System.out.println("LemonTea Rate is 13 Rs");
		
	}

	@Override
	public void greenTea() {
		// TODO Auto-generated method stub
		System.out.println("Green Tea Rate is 14 Rs");
		
	}

	@Override
	public void blackTea() {
		// TODO Auto-generated method stub
		System.out.println("Black Tea Rate is 15 Rs");
		
	}

	@Override
	public void handCash() {
		// TODO Auto-generated method stub
		System.out.println("Here Only Hand Cash payment");
		
	}

	@Override
	public void onlinepayment() {
		// TODO Auto-generated method stub
		System.out.println("Here not Available Online Payment");

		
	}

}
