package id.guntur;

class Layanan {
	private String name;
	private double tarifPerKg;

	public Layanan(String name, double tarifPerKg) {
		this.name = name;
		this.tarifPerKg = tarifPerKg;
	}

	public double getTarifPerKg() {
		return tarifPerKg;
	}

	public void displayInfo() {
		System.out.println("================================================================================");
		System.out.println(" Nama layanan: " + name);
		System.out.println("        Tarif: " + tarifPerKg);
		System.out.println("================================================================================");
	}
}

class Pesanan {
	private String name;
	private double weight;
	private Layanan service;
	private double amount;

	public Pesanan(String name, double weight) {
		this.name = name;
		this.weight = weight;
	}

	public void setLayanan(Layanan service) {
		this.service = service;
	}

	public void calculate() {
		if (this.service == null) {
			throw new NullPointerException("Layanan belum diset");
		}

		this.amount = this.weight * this.service.getTarifPerKg();
	}

	public void displayInfo() {
		System.out.println("================================================================================");
		System.out.println("    Nama: " + name);
		System.out.println("   Bobot: " + weight);
		System.out.println(" Tagihan: " + amount);
		System.out.println("================================================================================");
	}
}

public class Main {
	public static void main(String[] args) {
		// Layanan reguler = new Layanan("reguler", 12000.0);
		// reguler.displayInfo();

		Layanan express = new Layanan("express", (double) 15000);
		express.displayInfo();

		Pesanan luffy = new Pesanan("luffy", 2);
		luffy.setLayanan(express);
		luffy.calculate();
		luffy.displayInfo();
	}
}
