package assignment3_1prob;

public class BankAccount {
	public String name;
	public double initialAmount;
	public  BankAccount(String name,double initialAmount){
		this.name=name;
		this.initialAmount =initialAmount;
		
	}
	public  void makeDeposit(double amount){
		initialAmount=amount+initialAmount;
		
	}
	public  void depositWithdrawl(double amount){
		if(amount<=initialAmount){
			initialAmount=initialAmount-amount;
			System.out.println("Balance after withdrawl "+ initialAmount);
			
		}
		else{
			System.out.println(" not sufficient amount ");
		}
		
	}

}
