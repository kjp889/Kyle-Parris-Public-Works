package domain;

public interface Payable {
	
	double OVTRATE = 1.25;

	public abstract double calculateOverTime();
}
