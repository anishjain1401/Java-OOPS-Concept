# JAVA-OOPS-CONCEPT

# ABSTRACTION

Rule: If there is an abstract method in a class, that class must be abstract.
Rule: If you are extending an abstract class that has an abstract method, you
 must either provide the implementation of the method or make this class abstract.

SOME POINTS TO REMEMBER
1) AN ABSTRACT CLASS SHOULD HAVE ABSTRACT KEYWORD
2) IT CAN HAVE ABSTRACT OR NON-ABSTRACT METHODS
3) IT CAN HAVE FINAL METHODS
4) IT CAN HAVE CONSTRUCTORS AND METHODS
5) IT CANNOT BE INSTANTIATED -----> Instantiate in Java means to call a constructor of a 
Class which creates an an instance or object, of the type of that Class.Instantiation allocates the initial memory for the object and returns a reference.


# ENCAPSULATION 

--> Encapsulation in Java is a process of wrapping code and data together into a single unit, for example, a capsule which is mixed of several medicines.

1)We can create a fully encapsulated class in Java by making all the data members of the
  class private.
2)Now we can use setter and getter methods to set and get the data in it.			  
	
	The Java Bean class is the example of a fully encapsulated class.
	
ADVANTAGES OF ENCAPSULATION
1)By providing gettters and setters methods you can make read only or write only class.
2)Provides control over data.
3)It is a way to achieve DATA HIDING in Java because other class will not be able to
  access the data through the private data members. 
4)The encapsulate class is EASY TO TEST. So, it is better for unit testing.
5)The standard IDE's are providing the facility to generate the getters and setters.
  So, it is EASY AND FAST TO CREATE AN ENCAPSULATED CLASS IN Java.
  
  IF YOU HAVE SET THE VALUE OF PRIVATE DATA MEMBER STATICALLY , AND IF YOU ASSIGN THE
  VALUE IN SET THEN IT WILL
  GIVE COMPILE TIME ERROR.   


# INHERITANCE

--> it means one object acquire all properties and behavior of parent object.You can create new class that are built upon existing class. Whenever you inherit from existing class you can reuse the methods and fiels of existing class. 
				
Inheritance represents the IS-A relationship which is also known as a parent-child relationship.
				
WHY WE USE INHERITANCE ?
1) FOR METHOD OVERRIDING
2) FOR CODE REUSABILITY

TERMS USED IN INHERITANCE
1)CLASS --> group of objects having common properties. it is type of blueprint 
			from which objects are created
2)SUBCLASS/CHILDCLASS --> it is class which inherits another class also called extended
						class , derived class etc
3)SUPERCLASS/PARENTCLASS --> it is class from were subclass inherits features , also
							called base class
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


# Polymorphism

---> polymorphism as the word says "poly means == many" and "morph means == forms" so we can tell having one name but multiple forms

	We have two concepts Method Overloading and Method Overriding in Polymorphism

1) Taking real technical example as "abs(int)", "abs(long)", "abs(float)"
having same name abs but different arguments is concept of polymorphism including concept of Method overloading.
2) If we have same method but multiple implemantation is know as method overriding,

Two Type of Polymorphism
1) static/compile time/early binding --> its two type include 1)Overloading 2)Method Hiding
2) dynamic/run time/late binding --> it includes overriding

# Method Overloading

---> two methods are said to be overloaded if and only if both methods have same name but different type of argument

1) The responsibility on complier is based on reference type and method argument, so it is called Compile Time Polymorphism.
2) In overloading child class argument will get more priority than parent class argument.

# Method Overriding

---> in overriding method name and argument must be same that is method signature must be same.

1) If child is not satisfied with the requirements of parent class then child can redefine that method in child class.
2) Overriding is considered as runtime polymorphism.
3) we can't override parent class final method in child class.
