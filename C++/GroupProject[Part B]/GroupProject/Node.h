#ifndef DRIVER_CPP_NODE_H
#define DRIVER_CPP_NODE_H

#include "Pet.h"

class Node {
private:
    Pet data;
    Node *NextNode;

public:
    Node() {
        data = Pet();
        NextNode = NULL;
    }

    Node(int ticketNumber, string name, string type, int age) {
        this->data = Pet(ticketNumber, name, type, age);
        this->NextNode = NULL;
    }

    void setData(Pet p) {
        data = p;
    }

    void setNextNode(Node *nn) {
        NextNode = nn;
    }

    Pet getPetData() {
        return data;
    }

    Node* getNextNode() {
        return NextNode;
    }
};
#endif //DRIVER_CPP_NODE_H
