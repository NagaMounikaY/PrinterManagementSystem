package com.cl.printerdata;

import java.util.Scanner;

public class PrinterService {
	PrinterImpl p=new PrinterImpl();
	Scanner sc = new Scanner(System.in);

	public void displayPrinterOperations() {
		System.out.println("Enter the choice");
		System.out.println("store:Store printer details");
		System.out.println("display:Display printer details");
		System.out.println("count:Display printer results");
		System.out.println("brandNames:Display printer names");
		System.out.println("avgprice:Display printer avg price");
		System.out.println("max:Display printer max price");
		System.out.println("mfg:Display printer mfg");
		String choice = sc.next();
		char ch = 'y';
		while (ch == 'y') {
			switch (choice) {
			case "store":
				p.printerSetOperations();
				break;
				
			case "display":
				p.display();
				break;

			case "count":
				p.countPrinter();
				break;
				
			case "brandNames":
				p.displayBrandNames();
				break;
			case "avgprice":
				p.averagePriceBasedOnColor();;
				break;
			case "maxprice":
				p.displayMaxPrice();;
				break;
			case "mfgdate":
				p.displayManafacturedYear();;
				break;

			default:
				System.out.println("Choose the right option");
				break;
			}// switch
			System.out.println("do you want to continue(y/n)");
			ch = sc.next().trim().charAt(0);
			if (ch == 'y') {
				System.out.println("Enter the choice");
				System.out.println("store:Store printer details");
				System.out.println("display:Display printer details");
				System.out.println("count:Display printer results");
				System.out.println("brandNames:Display printer names");
				System.out.println("avgprice:Display printer avg price");
				System.out.println("max:Display printer max price");
				System.out.println("mfg:Display printer mfg");
						choice = sc.next();
			} else {
				System.exit(0);
			}
		}
	}


}
