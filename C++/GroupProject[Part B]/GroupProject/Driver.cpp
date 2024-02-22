/*
 * Module: Data Structures
 * Group Name: SKRS^3
 * Group Members:
    Chanel Green- #1703880
    Kyle Parris - #1804904
    Rajae Robinson - #2006677
    Shaniel Foreman- # 1901161
    Shanika McLeggan - #1503802
    Shemmar Ricketts #2005329
 * Occurence: UE3
 * Date: November 28, 2022
 */
#include "CageQueue.h"

int main(){
	Node *n = new Node(1,"Bean","dog",3);
	Node *n1 = new Node(2,"Bubbles","cat",1);
    Node *n2 = new Node(3,"Papi","dog",5);

	CageQueue *c = new CageQueue();
	c->enqueue(n);
	c->enqueue(n1);
    cout << "Cage queue after enqueue of two pets:" << endl;
	c->showCageQueue();


    c->dequeue();
    cout << "\n\nCage queue after dequeue of 1 pet:" << endl;
    c->showCageQueue();

    c->enqueue(n2);
    cout << "\n\nCage queue after enqueue of 1 pet:" << endl;
    c->showCageQueue();
}



