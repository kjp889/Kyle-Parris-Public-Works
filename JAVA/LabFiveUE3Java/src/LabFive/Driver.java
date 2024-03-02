package LabFive;

public class Driver {

	public static void main(String[] args) {
		//StockItem stockItem = new StockItem(1234, "Condense Milk", 239.60);
		//stockItem.displayStockItem();
		//stockItem.saveStockItemToFile();
		//stockItem.getStockItemFromUser();
		//stockItem.saveStockItemToFile();
		
		StockItem itemGet = new StockItem();
		//itemGet.getStockItemFromUser();
		//itemGet.retrieveStockItem();
		//itemGet.displayAllItems();
		//itemGet.retrievePrice();
		//itemGet.retrieveDescription();
		//int count;
		
		/*for(count=0; count<10; count++) {
			itemGet.getStockItemFromUser();
			itemGet.saveStockItemToFile();
			System.out.println(count);
		}*/
		
		itemGet.displayAllItems();

	}

}
