#ifndef GROUPWORK_PET_H_
#define GROUPWORK_PET_H_

#include <iostream>
using namespace std;

class Pet{
	private:
		int ticketNumber;
		string name;
		string type;
		int age;

	public:
		Pet();
		Pet(int ticketNumber, string name, string type, int age);
		Pet(Pet &pet);
		int getAge();
		void setAge(int age);
		string& getName();
		void setName(string &name);
		int getTicketNumber();
		void setTicketNumber(int ticketNumber) ;
		string& getType();
		void setType(string &type) ;
		void show();
};

#endif /* GROUPWORK_PET_H_ */
