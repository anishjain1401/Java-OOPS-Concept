/*
also refer Main4.java for further details

ENCAPSULATION --> Encapsulation in Java is a process of wrapping code and data together 
				  into a single unit, 
				  for example, a capsule which is mixed of several medicines.

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
*/


//A Java class which is a fully encapsulated class.  
//It has a private data member and getter and setter methods.  
public class encap{

private String name;
//private data member 
private int age;
private int roll;

//getter method for name 
public String getName()
{
return name;
}

//setter method for name
public void setName(String name)
{
this.name=name;
}

public int getAge()
{
return age;
}

public void setAge(int age)
{
this.age=age;
}

public int getRoll()
{
return roll;
}

public void setRoll(int roll)
{
this.roll=roll;
}

}