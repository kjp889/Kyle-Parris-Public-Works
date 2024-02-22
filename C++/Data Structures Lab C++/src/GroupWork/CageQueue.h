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
		Pet cage[];

	public:
		CageQueue();
		bool isEmpty();
		bool isFull();
		void enqueue(Pet pet);
		Pet dequeue();
};



#endif /* GROUPWORK_CAGEQUEUE_H_ */
