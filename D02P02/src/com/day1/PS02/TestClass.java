package com.day1.PS02;

public class TestClass {
	public static void main(String[] args) {
		MedicineInfo tablet = new Tablet();
		MedicineInfo syrup = new Syrup();
		MedicineInfo ointment = new Ointment();
		
		tablet.displayLabel();
		syrup.displayLabel();
		ointment.displayLabel();
	}
}
