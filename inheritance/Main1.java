/*
FOR BETTER UNDERSTANDING REFER JAVATPOINT.
ALL FILES IN ONE

INHERITANCE --> it means one object acquire all properties and behavior of parent object.
				You can create new class
				that are built upon existing class. Whenever you inherit from existing
				class you can reuse the methods and fiels of existing class. 
				
				Inheritance represents the IS-A relationship which is also known as a 
				parent-child relationship.
				
WHY WE USE INHERITANCE ?
1) FOR METHOD OVERRIDING
2) FOR CODE REUSABILITY

TERMS USED IN INHERITANCE
1)CLASS --> group of objects having common properties. it is type of blueprint 
			from which objects are created
2)SUBCLASS/CHILDCLASS --> it is class which inherits another class also called extended
						class , derived class etc
3)SUPERCLASS/PARENTCLASS --> it is class from were subclass inherits features , also
							called base class\
4)REUSABILITY -->  facilitates you to reuse the fields and methods of the existing class
					when you create a new class.
				   
TYPES OF INHERITANCE
1) SINGLE :  class B --> class A
2) MULTILEVEL : class C --> class B --> class A
3) HIERARCHAL : class B & class C --> class A
4) MULTIPLE : Note: Multiple inheritance is not supported in Java through class. 
				class C --> class B & class A
				Java renders compile-time error if you inherit 2 classes. 
				So whether you have same method or
				different,there will be compile time error.
				To reduce the complexity and simplify the language, 
				multiple inheritance is not supported in java.
5) HYBRID : class D --> class B & class C --> class A
*/

import java.util.Scanner;

class automobile{

int year;
int speed;
String fuel;

}

class cars extends automobile{ //The extends keyword indicates that you are making a 
								//new class that derives
								//from an existing class.
								//The meaning of "extends" is to increase the 
								//functionality.
String carname;

}

class bikes extends automobile{

String bikename;

}

class planes extends automobile{

String planename;

}

class Main1{

public static void main(String z[]){
 
 Scanner s=new Scanner(System.in);
 
 cars car=new cars();
 car.year = 2009;
 car.speed = 50;
 car.fuel = "20 L";
 car.carname = "tesla";
 
 bikes bike=new bikes();
 bike.year = 2007;
 bike.speed = 40;
 bike.fuel = "10 L";
 bike.bikename="pulser";
 
 planes plane=new planes();
 plane.year = 2003;
 plane.speed = 500;
 plane.fuel = "200 L";
 plane.planename="air india";
 
 System.out.println("We have 3 models");
 System.out.println("1. CAR");
 System.out.println("2. BIKE");
 System.out.println("3. PLANE");
 System.out.println("Enter your choice: ");

 int i;
 i=s.nextInt();
 
 if(i==1){
 System.out.println("YEAR OF MANUFACTURE OF CAR:"+car.year);
 System.out.println("MAX SPEED OF CAR:"+car.speed);
 System.out.println("FUEL OF CAR:"+car.fuel);
 System.out.println("NAME OF CAR:"+car.carname);
 }
 
 else if(i==2){
 System.out.println("YEAR OF MANUFACTURE OF BIKE:"+bike.year);
 System.out.println("MAX SPEED OF BIKE:"+bike.speed);
 System.out.println("FUEL OF BIKE:"+bike.fuel);
 System.out.println("NAME OF BIKE:"+bike.bikename);
 }
 
 else if(i==3){
 System.out.println("YEAR OF MANUFACTURE OF PLANE:"+plane.year);
 System.out.println("MAX SPEED OF PLANE:"+plane.speed);
 System.out.println("FUEL OF PLANE:"+plane.fuel);
 System.out.println("NAME OF PLANE:"+plane.planename);
 }
 
 else{
 System.out.println("Please enter valid number");
 }
 
 }
 
}
