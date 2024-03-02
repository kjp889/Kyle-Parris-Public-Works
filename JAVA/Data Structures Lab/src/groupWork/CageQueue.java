package groupWork;

import java.util.Arrays;

public class CageQueue {
	private int maxSize;
	private int front;
	private int back;
	private int itemCount;
	private Pet[] cage;
	
	public CageQueue() {
		this.maxSize = 3;
		this.front = 0;
		this.back = -1;
		this.itemCount = 0;
		this.cage = new Pet [maxSize];
	}
	
	public boolean isEmpty() {
		if (itemCount == 0) {
			return true;
		}
		return false;
	}
	
	public boolean isFull() {
		if (itemCount == maxSize) {
			return true;
		}
		return false;
	}
	
	public void enqueue(Pet pet) {
		if (isFull() == false) {
			if (back == maxSize-1) {
				back = -1;
			}
			back ++;
			cage[back] = pet;
			itemCount++;
		}
		else {System.out.println("Que full");}
	}
	
	public Pet dequeue() {
		if(isEmpty() == false) {
			Pet deqVal = cage[front];
			front++;
			itemCount--;
			
			if (front == maxSize) {
				front = 0;
			}
			return deqVal;
		}
		else {System.out.println("Que empty");}
		return null ;
	}
	
	public void show() {
		System.out.println(toString());
	}
	

	@Override
	public String toString() {
		return "CageQueue [maxSize=" + maxSize + ", front=" + front + ", back=" + back + ", itemCount=" + itemCount
				+ ", cage=" + Arrays.toString(cage) + "]";
	}
	
	

}
