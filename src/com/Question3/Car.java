package com.Question3;

public class Car {

	
private	int numberOfPassengers;
private	int numberOfKms = 12;

public Car() {
	super();
}

public Car(int numberOfPassengers, int numberOfKms) {
	super();
	this.numberOfPassengers = numberOfPassengers;
	this.numberOfKms = numberOfKms;
}

public int getNumberOfPassengers() {
	return numberOfPassengers;
}

public void setNumberOfPassengers(int numberOfPassengers) {
	this.numberOfPassengers = numberOfPassengers;
}

public int getNumberOfKms() {
	return numberOfKms;
}

public void setNumberOfKms(int numberOfKms) {
	this.numberOfKms = numberOfKms;
}


}
