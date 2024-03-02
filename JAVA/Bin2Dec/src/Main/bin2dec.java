package Main;

public class bin2dec {
	private String bin;
	private int dec=0;
	
	public bin2dec(String bin) {
		this.bin = bin;
		for(int i=(bin.length()-1); i>=0; i--) {
			dec += ((bin.charAt(i) - 48)) * (int)Math.pow(2,(bin.length()-1)-i );
			System.out.print(bin.charAt(i) - 48);
			System.out.println((int)Math.pow(2,(bin.length()-1)-i));
		}
		
		System.out.println(dec);
	}

	public String getBin() {
		return bin;
	}

	public void setBin(String bin) {
		this.bin = bin;
	}

	public int getDec() {
		return dec;
	}

	public void setDec(int dec) {
		this.dec = dec;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bin2dec b = new bin2dec("01");
	}

}
