
public class StockTransaction {
	public static void main (String[] args) {
		
		
		double shares = 1000;
				
		double paidStockByJoe = shares*32.87;
		double commissionPaid = .02 * shares;
		double soldStockByJoe = shares*33.92;
		double commissionPaidAgn = 0.02 * soldStockByJoe;
		double totalCost = paidStockByJoe+ commissionPaidAgn + commissionPaid;
		
		System.out.println();
		
		System.out.printf(" Amount paid by joe for the stock : $" + soldStockByJoe);
		System.out.print(" Amount of money paid an commision : $" + commissionPaid);
		System.out.println(" Joe sold his stock for : $" + soldStockByJoe);
		System.out.printf(" Amount of commission Joe Paid his when he sold the stock : "+commissionPaidAgn);
		
		if (totalCost > soldStockByJoe)
		{
			System.out.println("It's a loss: ");
		
		}
		else
		{   System.out.println("You made a profit! ");
		
	}
	
		
	}
	

}
