
public class InvoiceBO 
{
	Double total = 0.0 ;
	
	public void displayUserDetailsByStatus(String status,Invoice[] invoiceArray)
	{
		for( Invoice s : invoiceArray )
		{
			if ( s.getStatus().equals("Cleared"))
			{
				System.out.format("%-15s %-15s %-15s\n", s.getCustomer().getName(),s.getCustomer().getState(),s.getCustomer().getCountry());
			}
		}
	}	
		
	
	public double getTotalInvoiceValue(String userName,Invoice[] invoiceArray)	
	{
		for(Invoice s : invoiceArray)
		{
			if(!s.getCreatedBy().equals(userName))
			{
				
			}
			
			if(s.getCreatedBy().equals(userName))
			{
				total = total + s.getTotal();
			}
		}
		
		return total;
	}


}
