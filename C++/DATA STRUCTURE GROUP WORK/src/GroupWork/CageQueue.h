/*
 * CageQueue.h
 *
 *  Created on: 15 Nov 2022
 *      Author: Kyle
 */

#ifndef GROUPWORK_CAGEQUEUE_H_
#define GROUPWORK_CAGEQUEUE_H_

#include "Pet.h"

class CageQueue {
	private:
		int maxSize;
		int front;
		int back;
		int itemCount;
		Pet cage[3];

	public:
		CageQueue();
		bool isEmpty();
		bool isFull();
		void enqueue(Pet pet);
		Pet dequeue();
		void outCage();
		void show();
};



#endif /* GROUPWORK_CAGEQUEUE_H_ */
