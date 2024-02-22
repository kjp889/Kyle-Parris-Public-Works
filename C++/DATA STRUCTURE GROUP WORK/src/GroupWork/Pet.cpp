/*
 * Pet.cpp
 *
 *  Created on: 15 Nov 2022
 *      Author: Kyle
 */

#include "Pet.h"

Pet::Pet() {
	this->ticketNumber = 0;
	this->name = " ";
	this->type = "";
	this->age = 0;
}

Pet::Pet(int ticketNumber, string name, string type, int age) {
	this->ticketNumber = ticketNumber;
	this->name = name;
	this->type = type;
	this->age = age;
}

Pet::Pet(Pet &pet) {
	this->ticketNumber = pet.ticketNumber;
	this->name = pet.name;
	this->type = pet.type;
	this->age = pet.age;
}

int Pet::getAge() {
	return age;
}

void Pet::setAge(int age) {
	this->age = age;
}

string& Pet::getName() {
	return name;
}

void Pet::setName(string &name) {
	this->name = name;
}

int Pet::getTicketNumber(){
	return ticketNumber;
}

void Pet::setTicketNumber(int ticketNumber) {
	this->ticketNumber = ticketNumber;
}

string& Pet::getType(){
	return type;
}

void Pet::setType(string &type) {
	this->type = type;
}

void Pet::show() {
	cout << "Pet [ticketNumber=" << ticketNumber << ", name=" << name << ", type=" << type << ", age=" << age << "]"<< endl;
}




