package com.sunbeam.tester;

import com.sunbeam.invoice.Invoice;

public class InvoiceTester {

	public static void main(String[] args) {
		Invoice in=new Invoice("1001","engine",7,5000);
		System.out.println("part number - "+in.getPartNumber());
		
		System.out.println("part description - "+in.getPartDescription());
		
		System.out.println("quntity - "+in.getQuantity());
		
		System.out.println("price per item -"+in.getPricePerItem());
		
		System.out.println("totalbill = "+in.CalculateInvoice());
		
		
			
		

	}

}
