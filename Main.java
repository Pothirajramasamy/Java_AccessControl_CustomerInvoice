//Customer Invoice details

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		Scanner scan = new Scanner(System.in);
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
			
		System.out.println("Enter the number of invoices :");
		int n = scan.nextInt();
		Invoice[] invoiceArray = new Invoice[n];
		User[] userArray = new User[n];
		
		
		for ( int i = 0 ; i < n ; i++)
		{
			System.out.println("Enter the invoice "+ (i+1)+" details :");
			
			String st = buf.readLine();
			String[] array = st.split(",");
			userArray[i] = new User(array[0],array[1],array[2]);
			invoiceArray[i] = new Invoice(userArray[i],Double.valueOf(array[3]),array[4],array[5] );
		}
		System.out.println("Customer details with status cleared Invoices :");
		System.out.format("%-15s %-15s %-15s\n","Name","State","Country");
		
		InvoiceBO invoice = new InvoiceBO();
		invoice.displayUserDetailsByStatus("Cleared", invoiceArray);
		
		System.out.println("Enter the Invoice creator name :");
		String userName = buf.readLine();
		invoice.getTotalInvoiceValue(userName, invoiceArray);
		System.out.println("The total invoice value :");
		if ( invoice.getTotalInvoiceValue(userName, invoiceArray) == 0.00)
		{
			System.out.println("No invoice available");
		}
		else
		{
			System.out.format("%.2f",invoice.total);
		}
		
		
	}
}