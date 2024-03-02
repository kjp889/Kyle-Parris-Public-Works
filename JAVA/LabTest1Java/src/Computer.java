
public class Computer {
	private String serialNumber;
	private String brand;
	private int hardDiskSize;
	private Keyboard keyboard;
	
	public Computer() {
		this.brand = "Unknown";
		this.hardDiskSize = 0;
		this.serialNumber = "Unknown";
		Keyboard keyboard = new Keyboard();
		this.keyboard = keyboard;
	}
	
	public Computer(String serialNumber, String brand, int hardDiskSize, Keyboard keyboard)	{
		this.brand = brand;
		this.hardDiskSize = hardDiskSize;
		this.serialNumber = serialNumber;
		this.keyboard = keyboard;
	}
	
	public Computer(Computer computer) {
		this.brand = computer.brand;
		this.hardDiskSize = computer.hardDiskSize;
		this.serialNumber = computer.serialNumber;
		Keyboard keyboard = new Keyboard(computer.keyboard);
		this.keyboard = keyboard;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getHardDiskSize() {
		return hardDiskSize;
	}

	public void setHardDiskSize(int hardDiskSize) {
		this.hardDiskSize = hardDiskSize;
	}

	public Keyboard getKeyboard() {
		return keyboard;
	}

	public void setKeyboard(Keyboard keyboard) {
		this.keyboard = keyboard;
	}

	
	public String toString() {
		return "Serial No: " + serialNumber + "\nBrand: " + brand + "\nDisk size: " + hardDiskSize + "\n"
				+ keyboard.toString();
	}
	
	public void display() {
		System.out.println("Serial No: " + serialNumber);
		System.out.println("Brand" + brand);
		System.out.println("Disk size: " + hardDiskSize);
		keyboard.display();
	}
	
}
