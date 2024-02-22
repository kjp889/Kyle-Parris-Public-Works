#ifndef GROUPWORK_CAGEQUEUE_H_
#define GROUPWORK_CAGEQUEUE_H_

#include "Pet.h"
#include "Node.h"

class CageQueue {
	private:
        Node* Head;
		Node* Tail;

	public:
		CageQueue();
		void enqueue(Node* pet);
		Node* dequeue();
		void showCageQueue();
};



#endif /* GROUPWORK_CAGEQUEUE_H_ */
