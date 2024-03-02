public class Keyboard {
	
	private String keyboardModel;
	private String layout;
	private int numOfKeys;
	
	public Keyboard() {
		this.keyboardModel = "Unknown";
		this.layout = "Unknown";
		this.numOfKeys = 0;
	}
	
	public Keyboard(String keyboardModel, String layout, int numOfKeys) {
		this.keyboardModel = keyboardModel;
		this.layout = layout;
		this.numOfKeys = numOfKeys;
	}
	
	public Keyboard(Keyboard keyboard) {
		this.keyboardModel = keyboard.keyboardModel;
		this.layout = keyboard.layout;
		this.numOfKeys = keyboard.numOfKeys;
	}

	public String getKeyboardModel() {
		return keyboardModel;
	}

	public void setKeyboardModel(String keyboardModel) {
		this.keyboardModel = keyboardModel;
	}

	public String getKeyboardLayout() {
		return layout;
	}

	public void setKeyboardLayout(String layout) {
		this.layout = layout;
	}

	public int getNumOfKeys() {
		return numOfKeys;
	}

	public void setNumOfKeys(int numOfKeys) {
		this.numOfKeys = numOfKeys;
	}

	public String toString() {
		return "Keyboard Model: " + keyboardModel + "\nLayout: " + layout + "\nKeys: " + numOfKeys;
	}
	
	public void display() {
		System.out.println("Keyboard Model: " + keyboardModel);
		System.out.println("Layout: " + layout);
		System.out.println("Keys: " + numOfKeys);
	}
	
}
