package com.cl.printerdata;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PrinterImpl extends Printer {
	Scanner sc = new Scanner(System.in);
	List<Printer> printerList = new ArrayList<Printer>();
	Printer p = null;

	public void printerSetOperations() {
		p=new PrinterImpl();
		System.out.println("Enter the No. of printers ");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the printer details");
			System.out.println("Enter the printer name");
			sc.nextLine();
			p.setPrinterName(sc.nextLine());
			System.out.println("Enter the printer id");
			p.setPrinterId(sc.nextInt());
			System.out.println("Enter the printer brand");
			sc.nextLine();
			p.setPrinterBrand(sc.nextLine());
			System.out.println("Enter the printer price");
			p.setPrinterPrice(sc.nextDouble());
			System.out.println("Enter the printer category");
			sc.nextLine();
			p.setPrinterCategory(sc.nextLine());
			System.out.println("Enter the printer mfg date");
			LocalDate date = LocalDate.parse(sc.next());
			p.setPrinterMfgDate(date);
			if (date.getYear() <= 1900) {
				try {
					throw new DateCheckingException("enter the date above as 1900");
				} catch (Exception e) {
					System.err.println(e.toString());
				}
			}
			printerList.add(p);
		}
	}
	
	public void display() {
		System.out.println("the printer details:");
		System.out.println(printerList);
	}

	@Override
	public void countPrinter() {
		Map<String, Long> collect = printerList.stream().
		collect(Collectors.
				groupingBy(Printer::getPrinterCategory,
						Collectors.counting()));
		System.out.println(collect);

	}

	@Override
	public void displayBrandNames() {
		printerList.stream()
				.map(Printer::getPrinterBrand).distinct().forEach(System.out::println);

	}

	/*@Override
	public void averagePriceBasedOnColor() {
		System.out.println("Enter the printer colour");
		p.setPrinterColour(sc.next());
		Map<String, List<Printer>> collect = printerList.stream().collect(Collectors.groupingBy(Printer::getPrinterName,Collectors.averagingDouble(p.getPrinterPrice())));
		if(p.equals(getPrinterColour()))){
			System.out.println(collect.);
		}

	}*/

	@Override
	public void displayMaxPrice() {
		Optional<Double> first = printerList.stream().map(Printer::getPrinterPrice).sorted(Collections.reverseOrder()).findFirst();
		System.out.println("the max price "+first);

	}

	@SuppressWarnings("unlikely-arg-type")
	@Override
	public void displayManafacturedYear() {
		System.out.println("Enter the year");
		int year = sc.nextInt();
	printerList.stream().filter(e->e.getPrinterMfgDate().getYear()==year)
				.map(Printer::getPrinterMfgDate).forEach(System.out::println);
		

	}

	@Override
	public void averagePriceBasedOnColor() {
		// TODO Auto-generated method stub
		
	}


}
