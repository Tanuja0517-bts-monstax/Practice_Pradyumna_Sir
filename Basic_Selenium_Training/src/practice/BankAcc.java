package practice;

public class BankAcc {
	private String name;
	private String address;
	private long accno;
	private long pno;
	private double balance;
	private int pin;
	private String branch;
	private String bname;
	private long ifsc;
	
	public BankAcc(String name,String add,long accno,long pno,double balance,int pin,String branch,String bname,long ifsc) {
		this.name=name;
		address=add;
		this.accno=accno;
		this.pno=pno;
		this.balance=balance;
		this.pin=pin;
		this.branch=branch;
		this.bname=bname;
		this.ifsc=ifsc;
	}
	
	public String getName(int pin) {
		if(this.pin==pin)
			return name;
		else
			return "Invalid pin";
	}
	public String getAddress(int pin) {
		if(this.pin==pin)
			return address;
		else
			return "Invalid pin";
	}
	public long getAccno(int pin) {
		if(this.pin==pin)
			return accno;
		else
			System.out.println("Invalid pin");
		return 0;
	}
	public double getBalance(int pin) {
		if(this.pin==pin)
			return balance;
		else
			System.out.println("Invalid pin");
		return 0;
	}
	public String getBranch() {
		return branch;
	}
	public String getBname() {
		return bname;
	}
	public long getIfsc() {
		return ifsc;
	}
	public void setName(String name,int pin) {
		if(this.pin==pin)
			this.name = name;
	}
	public void setAddress(String address,int pin) {
		if(this.pin==pin)
			this.address = address;
	}
	public void setPno(long pno,int pin) {
		if(this.pin==pin)
			this.pno = pno;
	}
	public void setPin(int oldpin,int newpin) {
		if(pin==oldpin)
			this.pin = newpin;
	}
	
	public void withdraw(long amt,int pin) {
		if(amt<balance && (balance-amt)>500 && pin==this.pin) 
			balance-=amt;
		else if(amt<0)
			System.out.println("Enter proper amount to withdraw");
		else
			System.out.println("Insufficient balance");
	}
	
	public void credit(int amt) {
		if(amt>0) {
			balance+=amt;
			System.out.println("Amount credited:"+amt);
		}
	}
}
