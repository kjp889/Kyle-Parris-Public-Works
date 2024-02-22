/*
 * CageQueue.cpp
 *
 *  Created on: 15 Nov 2022
 *      Author: Kyle
 */

#include "CageQueue.h"

CageQueue::CageQueue(){
	this->maxSize = 3;
	this->front = 0;
	this->back = -1;
	this->itemCount = 0;
	this->cage[0] = Pet();
}

bool CageQueue::isEmpty() {
	if (itemCount == 0) {
		return true;
	}
	return false;
}

bool CageQueue::isFull() {
	if (itemCount == maxSize) {
		return true;
	}
	return false;
}

void CageQueue::enqueue(Pet pet) {
	if (isFull() == false) {
		if (back == maxSize-1) {
			back = -1;
		}
		back ++;
		cage[back] = pet;
		itemCount++;
	}
	else {cout << "Queue Full. " << endl;}
}

Pet CageQueue::dequeue() {
	Pet deqVal1 = cage[front];
	if(isEmpty() == false) {
		Pet deqVal = cage[front];
		front++;
		itemCount--;

		if (front == maxSize) {
			front = 0;
		}
		return deqVal;
	}
	else {cout << "Queue Empty. " << endl;}
	return deqVal1;
}


