/*
 * Agent.h
 *
 *  Created on: 31 Jan 2022
 *      Author: Kyle
 */

#ifndef AGENT_H_
#define AGENT_H_

class Agent{
private:
	string agentName;
	string teleNumber;

public:
	Agent(string agentName, string teleNumber) {
		this->agentName = agentName;
		this->teleNumber = teleNumber;
	}

	void display() {
		cout << "Agent's Name: " << agentName << endl;
		cout << "Telephone Number: " << teleNumber << endl;
	}

};



#endif /* AGENT_H_ */
