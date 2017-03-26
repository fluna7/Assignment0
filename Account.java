import java.sql.Date;

public class Account  
{
	
	private String getBalance;
	private int id;
	private double balance;
	private double annualInterestRate;
	Date dateCreated = new Date(0);
	
	public Account()
	{
		setId(0);
		setBalance(0);
		getAnnualInterestRate(0);
		
	}
	public Account(int id,double balance)
	{
		this.id = id;
		this.balance=balance;
	}
	public int getId() {
		return id;
		
	}

	public void setId(int id) {
		this.id = id;
		
	}
	
	public double getBalance () {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public void getAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public Date getDateCreated() 
	{
		return dateCreated;
	}
	
	public double getMonthlyInterestRate()
	{
		return getAnnualInterestRate() / 100 / 12 ;
	}
	
	public double getMonthlyInterest()
	{
		return (getBalance() * getAnnualInterestRate()) ;
	}
	
	public double withdraw(double withdraw)
	{
		balance -= withdraw;
		return (getBalance()- withdraw);
	}
	
	public double deposit (int i)
	{
		balance +=i;
		return (getBalance() + i);
	}
	
}