#include "CageQueue.h"

CageQueue::CageQueue(){
	this->Head = NULL;
    this->Tail = NULL;
}


void CageQueue::enqueue(Node* pet) {
	if(Head == NULL) {
        Head = pet;
        Tail = Head;
    } else {
        Tail->setNextNode(pet);
        Tail = pet;
    }
}

Node* CageQueue::dequeue() {
    Node* top = Head;
    if(Head == NULL) {
        cout << "Queue is Empty" << endl;
    } else {
        Head = Head->getNextNode();
    }
    return top;
}

void CageQueue::showCageQueue() {
    Node* current = Head;
    while (current != NULL) {
        current->getPetData().show();
        current = current->getNextNode();
    }
}