/*
ALL IN ONE FILE --- BIKE.JAVA
call -- javac bike.java
		java Main5

ABSTRACTION

Rule: If there is an abstract method in a class, that class must be abstract.
Rule: If you are extending an abstract class that has an abstract method, you
 must either provide the implementation of the method or make this class abstract.

SOME POINTS TO REMEMBER
1) AN ABSTRACT CLASS SHOULD HAVE ABSTRACT KEYWORD
2) IT CAN HAVE ABSTRACT OR NON-ABSTRACT METHODS
3) IT CAN HAVE FINAL METHODS
4) IT CAN HAVE CONSTRUCTORS AND METHODS
5) IT CANNOT BE INSTANTIATED -----Instantiate in Java means to call a constructor of a 
								Class which creates an an instance or object, of the type of that Class.
								Instantiation allocates the initial memory for the object and returns a reference.
*/

abstract class bike{

bike(){									// here constructor is formed but cannot 
										//be "called or instantiated"
System .out.println("bike started");
}

abstract void run();				
abstract void stop();				//no method body and abstract
abstract void ABS();

void changegear(){					// can have abstract or non-abstract methods
System.out.println("bike changed gear");
}

}

abstract class suzuki extends bike{

void run(){
System.out.println("suzuki is running ");
}

void stop(){
System.out.println("suzuki stopped");
}

}

//In real scenario, implementation is provided by others i.e. unknown by end user
class honda extends suzuki{

void ABS(){
System.out.println("ABS in honda");
}

}

//In real scenario, method is called by programmer or user
//Creating a main class which calls abstract and non-abstract methods
class Main5{

public static void main(String z[]){

bike b = new honda();	//In a real scenario, object is provided through method,
							//e.g., getBike() method
b.run();
b.ABS();
b.changegear();
b.stop();

}

}