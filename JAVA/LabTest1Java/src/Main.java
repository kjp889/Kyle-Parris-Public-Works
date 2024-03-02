import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static Computer readComputerRecordFromFile(String serialNumber) {
		Computer computer = new Computer();
		String searchSerialNumber = serialNumber;
		Scanner inFileReader = null;
		try {
			inFileReader = new Scanner(new File("ComputerRecords.dat"));	
			while (inFileReader.hasNext()) {
				serialNumber = inFileReader.next();
				computer.setSerialNumber(serialNumber);
				computer.setBrand(inFileReader.next());
				computer.setHardDiskSize(inFileReader.nextInt());
				computer.getKeyboard().setKeyboardModel(inFileReader.next());
				computer.getKeyboard().setKeyboardLayout(inFileReader.next());
				computer.getKeyboard().setNumOfKeys(inFileReader.nextInt());
				
				if (serialNumber == searchSerialNumber) {
					return computer;
				}				
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return computer;
	}
	
	public static boolean saveComputerRecordToFile(Computer computer) {
		try {
			FileWriter outFileWriter = new FileWriter("ComputerRecords.dat", true);
			String record = computer.getSerialNumber() + "\t" + computer.getBrand() + "\t" + computer.getHardDiskSize() + 
					"\t" + computer.getKeyboard().getKeyboardModel() + "\t" + computer.getKeyboard().getKeyboardLayout()+ "\t" + computer.getKeyboard().getNumOfKeys() + "\n";
			outFileWriter.write(record);
			outFileWriter.close();
			return true;
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return false;
	}
	


}
