package com.cl.printerdata;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Printer implements PrinterD {
	private int printerId;
	private String printerName;
	private String printerBrand;
	private double printerPrice;
	private String printerCategory;
	private LocalDate printerMfgDate;
	private String printerColour;

}
