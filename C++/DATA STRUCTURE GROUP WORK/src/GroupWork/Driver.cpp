/*
 * Driver.cpp
 *
 *  Created on: 15 Nov 2022
 *      Author: Kyle
 */
#include "CageQueue.h"

int main(){
	Pet *p = new Pet(1,"Bean","dog",3);
	Pet *p1 = new Pet(2,"Bean","dog",3);

	p->show();

	CageQueue *c = new CageQueue();
	c->enqueue(*p);
	c->enqueue(*p1);
	c->show();

	Pet *p2 = new Pet();

	*p2 = c->dequeue();

	p2->show();
	c->show();


}



